import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldTest {
    HelloWorld hw;

    @Test
    public void should_return_sum_when_input_two_args() {
        hw = new HelloWorld();
        int a = 3;
        int b = 5;
        int c = hw.sum(a, b);
        assertThat(c, is(8));
    }

}