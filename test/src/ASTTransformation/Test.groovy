package ASTTransformation

/**
 * Created with IntelliJ IDEA.
 * User: angelys
 * Date: 11/10/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
class Test {

    @GenerateGetterAndSetter
    String value = "value";

    static void main(String[] args){
        println new Test().getMyValue()
    }

}
