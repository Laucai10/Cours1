/*

   Ce programme affiche un carré de taille 10 par 10

*/
public class Carre{
    
    // Le point d'entrée du programme.
    public static void main (String[] args) {
	for (int i=0; i<10; i=i+1){        // i : numéro de ligne 
	    for (int j=0; j<10; j=j+1){    // j : numéro de colonne
		if (i==0 || i==9 || j==0 || j==9){
		    // Si on est sur le bord : on affiche "#"
		    System.out.print("#");
		}
		else {
		    // Si on est à l'intérieur : on affiche une espace
		    System.out.print(" ");
		}
	    }
	    System.out.println(); // Retour à la ligne
	}
    }
}
