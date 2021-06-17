import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MyPanel extends JPanel {
    Image image;

    MyPanel() {
        image = new ImageIcon(MyPanel.class.getResource("images/elephant.png")).getImage();
        this.setPreferredSize(new Dimension(600,600));
    }

    public void paint (Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g; //cast the Graphics to 2D.
        graphics2D.drawImage(image,0,0,null);
        graphics2D.setPaint(Color.PINK);
        graphics2D.setStroke( new BasicStroke(5));
        graphics2D.drawLine(0,0,500,500);
        graphics2D.drawRect(50,50,140,280);
        graphics2D.fillRect(50,50,40,280);

        graphics2D.drawOval(390,190,20,20);
        graphics2D.fillOval(390,190,20,20);

        graphics2D.drawOval(210,195,20,20);
        graphics2D.fillOval(210,195,20,20);

        int[] xPoints  = {450,150,350};
        int[] yPoints = {400,400,600};
        graphics2D.setPaint(Color.yellow);
        graphics2D.fillPolygon(xPoints,yPoints,3);

        graphics2D.setPaint(Color.red);
        graphics2D.drawArc(0,500,100,100,0,180);
        graphics2D.drawArc(0,500,100,100,0,180);
        graphics2D.setPaint(Color.white);
        graphics2D.fillArc(0,500,100,100,180,180);
        graphics2D.fillArc(0,500,100,100,180,180);
    }

}
