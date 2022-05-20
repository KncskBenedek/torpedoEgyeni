/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author szf1_a2
 */
public class TorpedoTeszt {
    
    public static void main(String[] args) {
        
       tesztLoves(4);
    }
    
    public static String tesztLoves(int poz){
        int[] tomb = new int[3];
        tomb[0] = 2;
        tomb[1] = 3;
        tomb[2] = 4;
        Hajo hajo = new Hajo(tomb);
        String t = hajo.talalat(poz);
        assert t.equals("találat") || t.equals("nem találat")  : "nem jó a találat ellenőrzése";
        return "";
    }

    
    
}
