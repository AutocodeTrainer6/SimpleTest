import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestSimple {

    @Test
    public void testOne(){
        Assert.assertEquals( 5 + 8, 13);
    }

    @Test
    public void testTwo(){
        Assert.assertEquals("5" + "8", "58");
    }

    @Test
    public void testThree(){
        Assert.assertEquals(5 + 8, 5 + 8);
    }

}
