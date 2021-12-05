package exercices;

public class exo1a {
    /*
        Dans le code suivant:
            int = 34;
            int y = x++;
        Que vaut la variable y après l'instruction d'affectation ?
        x++: comment s'appelle ce type d'incrémentation ?
     */
    public static void main(String args[]) {
        int x = 34; System.out.println("Org x: " + x);
        int y = x++; System.out.println(String.format("Result:\ny: %s\nx: %s", y, x));
        /*
         post incrémentation de x :
         la valeur de x est d'abord affectée à y puis est auto-incrémenté de 1
         Equivalence de code éclaté:
            int y = x;
            x++; ou x += 1; ou x = x + 1;
        */
    }
}
