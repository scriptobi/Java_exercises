package exercices;

public class exo2 {
    /*
        On veut convertir explicitement une valeur en forçant la transformation.
        Syntaxe: <NomVariable> = (<Type>)<NomVariable>;
        Soit:
            int i = 0;
            float y = 0;
     */
    public static void main(String args[]) {
        int i = 0; System.out.println("Org type de i: " + ((Object)i).getClass().getSimpleName());
        float y = 0; System.out.println("Org type de y: " + ((Object)y).getClass().getSimpleName());
        y = (float) i;
        /*
            forçage du type de variable. Dans le cas d'une conversion d'un integer vers un décimal (float ou double), il n'est pas nécessaire de forcer ce typage.
            A l'inverse, pour convertir un float en integer il faut le "caster". Ceci est dû au format mémoire des float. Un float est défini par 2 données:
                - le nombres de décimales
                - sa valeur entière
         */
    }
}
