package firstTask.test

/**
 * Created with IntelliJ IDEA.
 * User: angelys
 * Date: 10/10/13
 * Time: 11:55 PM
 * To change this template use File | Settings | File Templates.
 */
class GroovyFirstTest extends GroovyTestCase {

    void testSome(){
        assert (1..3).collect({3}) == [3, 3, 3]

        assert [1, 2, 4].contains(4);

        shouldFail { 3/0 }
    }

}
