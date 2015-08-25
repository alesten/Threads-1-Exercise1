/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlexanderSteen
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task1 t1 = new Task1();        
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        
        t1.start();        
        t2.start();
        t3.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.setRun(false);
    }
    
}
