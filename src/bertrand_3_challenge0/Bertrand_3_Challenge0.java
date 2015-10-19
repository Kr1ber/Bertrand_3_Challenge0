/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bertrand_3_challenge0;

/**
 *
 * @author aroeder
 */
public class Bertrand_3_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            if (isDivisiblebyfive(i) & isDivisiblebyeleven(i)) {
                 
                    System.out.println("Animate This");
                
            }else if (isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                System.out.println("Team Building");
            } else if (isDivisiblebythree(i) & isDivisiblebyeleven(i)) {
                System.out.println("Herr Direktor");
            } else if (isDivisiblebytwo(i) & isDivisiblebythree(i)) {
                System.out.println("chismé");
            } else if (isDivisiblebytwo(i) & isDivisiblebyeleven(i)) {
                System.out.println("ninja"); 
            } else if (isDivisiblebythree(i) & isDivisiblebyfive(i)) {
                System.out.println("Old School"); 
            } else if (isDivisiblebyfive(i)){
                System.out.println("Vidal");
            } else if (isDivisiblebythree(i)){
                System.out.println("Claughton");
            } else if (isDivisiblebytwo(i))
                System.out.println("Davis");
            else {
                System.out.println(i);

            }
        }
    }

    static boolean isDivisiblebytwo(int somenumber) {
        return (somenumber % 2 == 0);
    }

    static boolean isDivisiblebythree(int somenumber) {
        return (somenumber % 3 == 0);
    }

    static boolean isDivisiblebyfive(int somenumber) {
        return (somenumber % 5 == 0);
    }

    static boolean isDivisiblebyeleven(int somenumber) {
        return (somenumber % 11 == 0);
    }
}