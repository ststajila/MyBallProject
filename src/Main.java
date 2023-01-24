import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame();

        //DrawPanel panel = new DrawPanel();
        BallPanel myPanel = new BallPanel();
        frame.setSize(500, 500);



        //frame.add(panel);
        frame.add(myPanel);
        frame.setVisible(true);
    }
}