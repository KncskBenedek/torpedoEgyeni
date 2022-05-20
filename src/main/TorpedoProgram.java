
package main;

import java.util.Random;
import java.util.Scanner;


public class TorpedoProgram {
    public static final int PALYA_HOSSZ = 7;
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        int[] poz = hajoPozicio();
        Hajo hajo = new Hajo(poz);
        int talalatokSzama = 0;
        int loves = 0;
        do {
            int tipp = jatekosTippBe();
            String talaltE = hajo.talalat(tipp);
            if (talaltE.equals("találat")) {
                talalatokSzama++;
                System.out.println(talaltE);
            }else{
                System.out.println(talaltE);
            }
            loves++;
        } while (!(talalatokSzama == 3));
        System.out.println("Talált és süllyedt " +loves+ " db lövésből.");
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
        int tipp = 1;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Hova lő(1-%d): \n", PALYA_HOSSZ);
        tipp = sc.nextInt();
        } while (!(tipp >= 1 && tipp <= PALYA_HOSSZ));
        return tipp-1;    
    }
    
    
    
}
