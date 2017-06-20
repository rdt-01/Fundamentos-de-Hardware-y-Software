/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rdt
 */

public class Panel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) { //Colocar imagenes en programa
        ImageIcon image = new ImageIcon("");//Directorio de imagen
        super.setOpaque(false);
        g.drawImage(image.getImage(), 0, 0, null);
        super.paintComponent(g);
    }
}
