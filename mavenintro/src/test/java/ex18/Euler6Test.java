package ex18;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler6Test {

    //given
    Euler6 eu = new Euler6();


    @Test
    public void checkFor8(){
        //when
        int result1 = eu.differeceBetweenSquares(8);

        //then
        assertThat(result1).isEqualTo(1092);
    }

    @Test
    public void checkFor5(){
        //when
        int result1 = eu.differeceBetweenSquares(5);

        //then
        assertThat(result1).isEqualTo(170);
    }

    @Test
    public void checkFor10(){
        //when
        int result1 = eu.differeceBetweenSquares(10);

        //then
        assertThat(result1).isEqualTo(2640);
    }


}
