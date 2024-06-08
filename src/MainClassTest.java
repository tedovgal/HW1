import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass main = new MainClass();
        int actual = main.getClassNumber();
        int comparedNum = 45;

        Assert.assertTrue("Actual is less or equals compared number",actual > comparedNum);
    }
}
