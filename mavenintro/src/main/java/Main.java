import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {

        Robot robot = new Robot();
        Random random = new Random();

        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");

        Thread.sleep(300);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);



        for (int i = 0; i < 50; i++) {

            robot.mouseMove(random.nextInt(1500),random.nextInt(1000));
            Thread.sleep(100);
        }




    }
}
