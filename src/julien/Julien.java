/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julien;

/**
 *
 * @author Julien
 */
public class Julien {

    /**
     * @param args the command line arguments
     */
    static int i = 0; 
    
    public static void main(String [] args) {
        System.out.println("Hello world");
        
        Lapin lap = new Lapin("Bob", 5);
        while(i<=10){
            lap.Crier();
            i=i+1;
        }
    }
    
}
