package ex18;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Euler2Test {

        //given
        Euler2 eu2 = new Euler2();

        @Test
        public void checkFor6(){
            //when
            int result1 = eu2.sumFib(6);

            //then
            assertThat(result1).isEqualTo(10);
        }

    @Test
    public void checkFor25(){
        //when
        int result1 = eu2.sumFib(10);

        //then
        assertThat(result1).isEqualTo(44);
    }

    @Test
    public void checkFor55(){
        //when
        int result1 = eu2.sumFib(14);

        //then
        assertThat(result1).isEqualTo(188);
    }
}
