package Task4;

import Task2.Ellipse;
import Task2.Rectangle;
import Task2.ShapeFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Animation extends JFrame{

    private static BufferedImage image;
    public Animation(int width, int height){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width,height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) throws IOException {
        image = ImageIO.read(new File("D:\\IDEAProjects\\Prac4\\src\\Task4\\frame_0_delay-0.1s.gif"));
        Animation a = new Animation(image.getWidth(),image.getHeight());
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        while (true) {
            try {
                image = ImageIO.read(new File("D:\\IDEAProjects\\Prac4\\src\\Task4\\frame_1_delay-0.1s.gif"));
                TimeUnit.MILLISECONDS.sleep(100);
                g.drawImage(image, 0, 0, null);
                image = ImageIO.read(new File("D:\\IDEAProjects\\Prac4\\src\\Task4\\frame_2_delay-0.1s.gif"));
                TimeUnit.MILLISECONDS.sleep(100);
                g.drawImage(image, 0, 0, null);
                image = ImageIO.read(new File("D:\\IDEAProjects\\Prac4\\src\\Task4\\frame_3_delay-0.1s.gif"));
                TimeUnit.MILLISECONDS.sleep(100);
                g.drawImage(image, 0, 0, null);
                image = ImageIO.read(new File("D:\\IDEAProjects\\Prac4\\src\\Task4\\frame_0_delay-0.1s.gif"));
                TimeUnit.MILLISECONDS.sleep(100);
                g.drawImage(image, 0, 0, null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
