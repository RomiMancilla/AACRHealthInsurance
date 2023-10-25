
package Service;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagenFondoPanel extends  JPanel{
 
    private Image imagen;
    
   @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/images/4000x350.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
