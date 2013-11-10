package ASTTransformation

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.FieldNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.VariableScope
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.expr.FieldExpression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation


@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
class GenerateGetterAndSetterTransformation implements ASTTransformation {
    @Override
    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        FieldNode annotatedField = astNodes[1]
        MethodNode getter = generateGetterMethod(annotatedField)
        annotatedField.declaringClass.addMethod(getter)
    }

    MethodNode generateGetterMethod(FieldNode node){
        return new MethodNode("getMy"+node.name.capitalize(), ACC_PUBLIC, new ClassNode(node.type), [], [], new BlockStatement(
                [new ReturnStatement(
                        new FieldExpression(node)
                )],
                new VariableScope()))

    }

}
