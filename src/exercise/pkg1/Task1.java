/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

/**
 *
 * @author AlexanderSteen
 */
public class Task1 extends Thread {
    public void run(){
        long sum = 0;
        
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        
        System.out.println("Sum: " + sum);
    }
}
