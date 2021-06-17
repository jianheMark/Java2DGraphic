import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    MyPanel myPanel;
    MyFrame() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.pack();
        this.setLayout(null);
        this.setTitle("2D Graphic Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(600,600);
        this.setLocationRelativeTo(null);//set the frame directly in the center of screen.

        this.setVisible(true);
    }



}
