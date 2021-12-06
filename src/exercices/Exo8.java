package exercices;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exo8 {
    /*
        Ecrire un programme qui vérifie si une chaîne de caractères (sans espaces) saisie au clavier est un palindrome.
        Un palindrome est un mot qui se lit dans le deux sens. Exemple: kayak.
            - trouvez la chaîne inverse en utilisant la méthode reverse()
            - puis on compare les 2 chaînes de caractères et on indique s'il s'agit ou non d'un palindrome.
     */
    public static void main(String[] args) {
        new Exo8();
    }

    public Exo8() {
        String entry = getString();
        doMethode01(entry);
    }

    private String getString() {
        String entry = null;
        boolean validEntry = false;

        try(Scanner sc = new Scanner(System.in)) {
            while(!validEntry) {
                entry = sc.nextLine();
                if(isValidString(entry)) validEntry = true;
                else System.out.println("Chaîne de caractères non valide !\n Recommencez.");
            }
        }

        return entry;
    }

    private boolean isValidString(String entry) { return entry.matches("[a-zA-Z]*"); }

    private void doMethode01(String entry) {
        System.out.println("Methode par char[]:");
        char[] c = entry.toLowerCase().toCharArray();
        int i = 0, j = c.length - 1;
        boolean match = true;

        do {
            System.out.println(String.format("c[%s]: %s - c[%s]: %s", i, c[i], j, c[j]));
            if(c[i] != c[j]) match = true;
            i++;
            j--;
        } while(i < j);

        System.out.println(String.format("%s %s un palindrome.", entry, match ? "est" : "n'est pas"));
    }
}
