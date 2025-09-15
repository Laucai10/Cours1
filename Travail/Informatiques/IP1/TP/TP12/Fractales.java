/*
  Un programme pour dessiner des fractales.
*/
public class Fractales {
	// Donnée de configuration du dessin
	public static Turtle turtle;
	static int picture_width = 512;
	static int picture_height = 512;

	//EX7
	public static void kochLine(int n, double length){
		double l = length/3;
		if (n==0){
			turtle.forward(length);
		} else{
			turtle.forward(l);
			turtle.left(60);
			turtle.forward(l);
			turtle.right(120);
			turtle.forward(l);
			turtle.left(60);
			turtle.forward(l);
		}
	}
	public static void main(String[] args) {
		// Configuration de la tortue
		turtle = new Turtle(picture_width, picture_height);
		turtle.setheading(0);
		turtle.setspeed(10);

		// Testez vos fonctions ici
		kochLine(2, 100);
		// Affichage de la tortue
		turtle.display();
		// Code d'attente pour la fermeture de la fenetre
		turtle.exitonclick();
	}

}
