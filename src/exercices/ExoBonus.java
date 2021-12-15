package exercices;

import java.util.Scanner;

public class ExoBonus {
    public static void main(String... args) {
        new ExoBonus();
    }

    public ExoBonus() {
        int value = getInput();
        int result = 0;
        for(int i = 0; i < 3; i++) {
            value *= 0.9;
        }

        System.out.println("Result: " + value);
    }

    private int getInput() {
        int lines = 0;
        boolean entryIsValid = false;

        try(Scanner sc = new Scanner(System.in)) {
            while (!entryIsValid) {
                try {
                    lines = Integer.parseInt(sc.nextLine());
                    if (lines > 0) entryIsValid = true;
                    else System.out.println(("Le nombre de ligne doit être supérieur à 0 !\nRecommencez."));
                } catch (NumberFormatException e) {
                    System.out.println("Entrée invalide !\nRecommencez.");
                }
            }
        }
        return lines;
    }

}
