import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OperationTest {
    @Test
    public void should_return_sum() {
        Operation op = new Operation();
        int reslut = op.sum(1, 4);
        assertThat(reslut, is(5));
    }

}