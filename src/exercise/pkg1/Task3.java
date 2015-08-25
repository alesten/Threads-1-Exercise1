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
public class Task3 extends Thread {
    private boolean run = true;
    
    public void run(){
        int i = 10;
        while(run){
            try {
                System.out.println(i++);
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    
}