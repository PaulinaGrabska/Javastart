import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EulerTest10 {

    //given
    Calculator calculator = new Calculator();

    @Test
    public void checkFor10(){
        //when
        int result1 = calculator.euler(10);

        //then
        assertThat(result1).isEqualTo(23);
    }

    @Test
    public void checkFor11(){
        //when
        int result1 = calculator.euler(11);

        //then
        assertThat(result1).isEqualTo(33);
    }

    @Test
    public void checkFor12(){
        //when
        int result1 = calculator.euler(12);

        //then
        assertThat(result1).isEqualTo(33);
    }


    @Test
    public void checkFor13(){
        //when
        int result2 = calculator.euler(13);

        //then
        assertThat(result2).isEqualTo(45);

    }

    @Test
    public void checkFor16(){
        //when
        int result1 = calculator.euler(16);

        //then
        assertThat(result1).isEqualTo(60);
    }

}


