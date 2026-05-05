public class TowerAlgorithm {
    public void moveTower(int anzahlScheiben,char start, char hilfe, char ziel){
        if(anzahlScheiben>0){
            moveTower(anzahlScheiben-1, start,ziel,hilfe);
            System.out.println("Verschiebe Scheibe " + anzahlScheiben + " von " + start + " nach " + ziel);
            moveTower(anzahlScheiben-1,hilfe,start,ziel);

        }
        }
    public static void main (String[]args){
        TowerAlgorithm tower = new TowerAlgorithm();
        tower.moveTower(3,'A','B','C');
    }
}
/*
start=A
hilfe=b
ziel=c

(2,a=start,c=hilfe,b=ziel)
(1,a=start,b=ziel,c=hilfe
 */

