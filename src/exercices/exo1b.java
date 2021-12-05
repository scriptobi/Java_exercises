package exercices;

public class exo1b {
    /*
        Maintenant on remplace juste int y = x++; par int y = ++x;
        Que vaut la variable y ?
        ++x: comment s'appelle ce type d'incrémentation ?
     */
    public static void main(String args[]) {
        int x = 34; System.out.println("Org x: " + x);
        int y = ++x; System.out.println(String.format("Result:\ny: %s\nx: %s", y, x));
        /*
            pré incrémentation de x :
            la valeur de x est d'abord auto-incrémentée de 1 puis est affecté à y
            Equivalence de code éclaté:
                x++; ou x += 1; ou x = x + 1;
                int y = x;
         */
    }
}
