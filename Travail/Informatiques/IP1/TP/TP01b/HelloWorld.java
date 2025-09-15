/* Ce programme affiche un message de politesse. */

/* Voici le nom du programme. On doit toujours définir
   une classe X dans un fichier nommé X.java*/
public class HelloWorld {
    // Le point d'entrée du programme.
    public static void main (String[] args) {
	// Une unique commande est exécutée.
	System.out.println ("Hello World!");
    //Q3
    System.out.println ("Hello"+" "+"World!");
    //Q4
    System.out.println ("What is your name?");
    String name = System.console ().readLine ();
    System.out.println ("Hello"+" "+"World!");
    }
    
}
