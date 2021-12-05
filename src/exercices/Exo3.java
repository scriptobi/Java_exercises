package exercices;

public class Exo3 {
    /*
        Analysez les intructions suivantes:
            int i;
            for(i=0;i<10;i++){
                System.out.println(i);
            }
            Réécrivez les en utilisant une instruction while.
     */
    public static void main(String args[]) {
       int i = -1;
        while(++i < 10) {
            System.out.println(i);
        }
    }
}
