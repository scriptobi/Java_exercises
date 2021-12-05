package exercices;

public class Exo4 {
    /*
        Que va afficher le programme suivant ?
            int a = 15, b = 20;
            System.out.println((a > b) ? b : a);
     */
    public static void main(String args[]) {
        int a = 15, b = 20;
        System.out.println((a > b) ? b : a);

        /*
            Ce programme affichera la valeur de a selon la condition de comparaison a > b.
            if(a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
         */
    }
}
