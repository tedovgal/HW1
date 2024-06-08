import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass main = new MainClass();
        String actual = main.getClassString();

        assertThat(actual, anyOf(containsString("Hello"), containsString("hello")));
    }
}
