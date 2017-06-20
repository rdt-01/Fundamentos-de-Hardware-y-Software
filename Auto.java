/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author rdt
 */
public class Auto extends HilosC{
    
    public Auto(String imageName) {
        setImageName(imageName);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon (imageName));
        setLabel(label);
        
    }
    
    @Override
    public void run() {
        int i;
        
        for (i = 0; i < 1000; i++) {
            try {
                setX(getX() + getVelocidad());
                getLabel().setLocation(getX() , (int) getLabel().getLocation().getY());
                Thread.sleep(1000/getVelocidad());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
