package ex18;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaxTest {

        //given
        Tax tax = new Tax();


        @Test
        public void checkFor85000(){
            //when
            int result1 = tax.countTax(85000);

            //then
            assertThat(result1).isEqualTo(15199);
        }

    @Test
    public void checkFor85528(){
        //when
        int result1 = tax.countTax(85528);

        //then
        assertThat(result1).isEqualTo(15294);
    }

    @Test
    public void checkFor88000(){
        //when
        int result1 = tax.countTax(88000);

        //then
        assertThat(result1).isEqualTo(15630);
    }




}
