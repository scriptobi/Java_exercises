package exercices;

import java.util.Scanner;

public class Exo6 {
    /*
        Ecrivez un programme qui saisi un entier positif et indique si le nombre est pair ou impair.
        Tant que l'entier saisi n'est pas positif, le programme vous le redemande.
     */
    public static void main(String[] args) { new Exo6(); }

    public Exo6() {
        boolean validEntry = false;

        while(!validEntry) {
            try (Scanner sc = new Scanner(System.in)) {
                while(sc.hasNext()) {
                    try {
                        int entry = Integer.parseInt(sc.nextLine());
                        if(entry > 0) {
                            System.out.println(String.format("Le nombre %s est %s", entry, entry % 2 != 0 ? "impair" : "pair"));
                            validEntry = true;
                        } else {
                            System.out.println("Nombre négatif invalide");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrée invalide !\nRecommencez.");
                    }
                }
            }
        }
    }
}
