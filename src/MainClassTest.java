import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass main = new MainClass();
        int actual = main.getLocalNumber();
        int expected = 14;

        Assert.assertTrue("Actual and expected results do not match",actual == expected);
    }
}
