package Service;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public class JPanelDegrade extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(0, 159, 255);
        Color color2 = new Color(236, 47, 75);
        GradientPaint gp = new GradientPaint(0, 0, color1, 900, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

}
