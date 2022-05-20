
package main;

import java.util.Random;
import java.util.Scanner;


public class TorpedoProgram {
    public static final int PALYA_HOSSZ = 7;
    public static void main(String[] args) {
        int[] poz = hajoPozicio();
        Hajo hajo = new Hajo(poz);
        int talalatokSzama = 0;
        int loves = 0;
        do {
            int tipp = jatekosTippBe();
            loves++;
        } while (!(talalatokSzama == 0));
        
        
    }

    private static int[] hajoPozicio() {
        int[] tomb = new int[3];
        Random rnd = new Random();
        int poz = rnd.nextInt(PALYA_HOSSZ-2);
        tomb[0] = poz;
        tomb[1] = poz+1;
        tomb[2] = poz+2;
        return tomb;
    }

    private static int jatekosTippBe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hova lő: ");
        int tipp = sc.nextInt();
        return tipp;    
    }
    
    
    
}
