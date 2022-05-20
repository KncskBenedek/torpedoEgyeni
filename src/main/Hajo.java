
package main;

public class Hajo {
    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = new int[3];
        this.pozicio = pozicio;
    }
    
        
    public String talalat(int poz){
        int i = 0;
        while (i < pozicio.length && !(poz == pozicio[i])) {
            i++;
        }
        String szoveg = "";
        if (i < pozicio.length) {
            szoveg = "találat";
        }else{
            szoveg = "nem talált";
        }
        return  szoveg;
    }
}
