import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallPanel extends JPanel{

    private Ball ball = new Ball(0, 0, 23, 1, 1, Color.WHITE);
    private Ball[] balls = new Ball[20];

    private Ball myBall = new Ball(150, 200, 20, 10, 10,  Color.GREEN);


    public BallPanel(){

        setBackground(new Color(203, 203, 203));
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == 68){
                    myBall.moveRight();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        for (int i = 0; i < 20; i++){
            balls[i] = new Ball();
        }
    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        myBall.drawBall(g);

        for (int i = 0; i < 20; i++){
            balls[i].drawBall(g);
            balls[i].moveBall(this);
        }

        repaint();

    }
}