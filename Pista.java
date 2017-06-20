/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author rdt
 */
public class Pista extends JFrame {
    
    private ArrayList<HilosC> autos;
    
    public Pista() {
        super("Carrera");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        autos = new ArrayList<HilosC>();
        
    }
    
    public void add(HilosC auto) {
        autos.add(auto);
    }
    
    public void start() {
        setLayout(new GridLayout (autos.size(), 1));
        Panel lane = null;
        
        for (HilosC auto : autos) {
            lane = new Panel();
            lane.add(auto.getLabel());
            add(lane);
            
        }
        
        setVisible(true);
        for (HilosC auto : autos) {
            auto.getLabel().setLocation(auto.getX(), (int) auto.getLabel().getLocation().getY());
            auto.start();
        }
    }
}
