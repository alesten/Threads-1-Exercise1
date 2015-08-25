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
public class Task2 extends Thread {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}