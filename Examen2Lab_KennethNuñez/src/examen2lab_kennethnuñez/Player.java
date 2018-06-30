/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_kennethnuñez;

import javafx.scene.control.ProgressBar;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Burni
 */
public class Player extends Thread {

    private JLabel label1;
    private JLabel label2;
    private boolean vive;
    private int max;
    private JProgressBar progBar_d;

    public Player(JLabel label1, JLabel label2, int max,JProgressBar barra) {
        this.label1 = label1;
        this.label2 = label2;
        this.max = max;
        vive = true;
        this.progBar_d = barra;
    }

    @Override
    public void run() {
        while(vive){
            while (label2.isVisible()) {
            int x = Integer.parseInt(label2.getText());
            if (x < max) {
                x++;
                String num = Integer.toString(x);
                label2.setText(num);
                progBar_d.setValue(x);
            }else{
                vive = false;
                
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        }
        
    }

}
