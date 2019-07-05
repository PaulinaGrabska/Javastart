import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public  void shouldReturn5(){

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(10,2);

        //then
        assertThat(result).isEqualTo(5);




    }
}


