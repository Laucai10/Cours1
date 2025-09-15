/*
  Un programme pour dessiner des fractales.
*/
public class Fractales {

	// Donnée de configuration du dessin
	public static Turtle turtle;
	static int picture_width = 1024;
	static int picture_height = 1024;

	public static void main(String[] args) {
		// Configuration de la tortue
		turtle = new Turtle(picture_width, picture_height);
		turtle.setheading(0);
		turtle.setspeed(10);

		// Testez vos fonctions ici

		// Affichage de la tortue
		turtle.display();
		// Code d'attente pour la fermeture de la fenetre
		turtle.exitonclick();
	}

}
