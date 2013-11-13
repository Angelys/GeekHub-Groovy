package ASTTransformation

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.Parameter
import org.codehaus.groovy.ast.VariableScope
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.expr.BinaryExpression
import org.codehaus.groovy.ast.expr.FieldExpression
import org.codehaus.groovy.ast.expr.VariableExpression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation
import sun.org.mozilla.javascript.internal.ast.InfixExpression

import javax.lang.model.element.Modifier


@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
class GenerateGetterAndSetterTransformation implements ASTTransformation {
    @Override
    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        FieldNode annotatedField = astNodes[1]
        MethodNode getter = generateGetterMethod(ClassHelper.make(annotatedField))
        astNodes[1].declaringClass.addMethod(getter)
        MethodNode setter = generateSetterMethod(ClassHelper.make(annotatedField))
        astNodes[1].declaringClass.addMethod(setter)

    }

    MethodNode generateGetterMethod(FieldNode node){
        return new MethodNode("getMy"+node.name.capitalize(), Modifier.PUBLIC, new ClassNode(node.type), new Parameter[0], new ClassNode[0], new BlockStatement(
                [new ReturnStatement(
                        new VariableExpression(node.name)
                )],
                new VariableScope()))

    }

    MethodNode generateSetterMethod(FieldNode node){
        return new MethodNode("setMy"+node.name.capitalize(), ACC_PUBLIC, Void.TYPE, new ParameterArray(new Parameter(node.type, "new"+node.name)), [], new BlockStatement(
                [new BinaryExpression(new VariableExpression(node.name), new VariableExpression("new" + node.name))],
                new VariableScope()))

    }

}
