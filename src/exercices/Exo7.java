package exercices;

import java.util.Scanner;

public class Exo7 {
    /*
        Ecrivez un programme qui permet de convertir des jours en secondes et affichez le résultat.
        Ex: 12 jours = 1036800s.
        Le code prends en entrée le nombre de jours (saisie au clavier).
     */
    public static void main(String[] args) {
        new Exo7();
    }

    public Exo7() {
        int days = getDays();
        long sec = days * 24 * 3600;
        System.out.println(String.format("%s jours = %s secondes", days, sec));
    }

    private int getDays() {
        int days = 0;
        boolean validEntry = false;

        try(Scanner sc = new Scanner(System.in)) {
            while(!validEntry) {
                try {
                    days = Integer.parseInt(sc.nextLine());
                    if(days > 0) validEntry = true;
                    else System.out.println(("Le nombre de jour ne peut être inférieur à 0.\nRecommencez."));
                } catch (NumberFormatException e) {
                    System.out.println(("Entrée invalide !\nRecommencez."));
                }
            }
        }
        return days;
    }
}
