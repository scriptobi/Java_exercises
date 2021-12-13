package exercices;

import java.util.Scanner;

public class Exo5 {
    /*
        Ecrire un programme permettant d'afficher le triagle d'étoiles suivant:
        Exemple: ici le nombre de ligne est de 5
     */
    private static final int defLines = 5;
    private static int argLines;

    public static void main(String args[]) {
        Exo5 exo = new Exo5(argsIsInteger(args) ? argLines : defLines);
    }

    private static boolean argsIsInteger(String args[]) {
        boolean result = false;
        if(args.length > 0) {
            try {
                argLines = Integer.parseInt(args[0]);
                result = true;
            } catch (NumberFormatException e) {
                System.out.println("Bad Argument format !\n Using default line count.");
            }
        }
        return result;
    }

    public Exo5(int nbLines) {
        nbLines = getInput();
         for(int curLine = 0 ;curLine < nbLines; curLine++) {
            String line = "";
            /*
            int nbSpaces = nbLines - curLine - 1;
            int nbStars = curLine * 2 + 1;
            for(int i = 0; i < nbSpaces; i++) line += " ";
            for(int j = 0; j < nbStars; j++) line += "*";
             */
            for(int i = 0; i < nbLines - curLine - 1; i++) line += " ";
            for(int j = 0; j < curLine * 2 - 1; j++) line += "*";

            System.out.println(line);
        }
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
