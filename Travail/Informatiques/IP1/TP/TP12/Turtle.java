/*

  Cette classe implémente une version simplifiée de la tortue du
  langage de programmation LOGO. Il ne s'agit pas de code que vous
  nous demandons de lire et encore moins de savoir écrire car il
  sort du programme d'IP1. Cependant, rien ne vous empêche d'y
  jeter un oeil par curiosité.

*/
public class Turtle {

    /*
     * 
     * Une tortue sera représentée par une *instance* de la *classe*
     * Turtle. Les mots "instance" et "classe" sont caractéristiques de
     * la programmation orientée objet telle qu'on la pratique en JAVA.
     * (Encore une fois, cette forme de programmation n'est pas celle
     * que l'on apprend en IP1 mais dans le cours POO en L2.)
     * 
     * Chaque tortue a une position et une orientation dont les valeurs
     * courantes sont stockées dans les attributs d'instance de type
     * int "x", "y" et "angle". Par ailleurs, lorsqu'elle se déplace,
     * la tortue laisse une trace. Pour se faire, on peut imaginer
     * qu'elle tient un crayon dans son bec. Parfois, on ne souhaite
     * rien dessiner pendant le déplacement : il suffit de "lever le
     * crayon". L'état crayon levé ou baissé est aussi stocké dans un
     * attribut, mais il s'agit d'un attribut de type boolean
     * cette fois-ci, l'attribut "is_down". Enfin, la tortue a aussi
     * une vitesse: c'est l'attribut de type int nommé "speed" qui
     * la représente.
     * 
     */

    // Position courante
    public double x;
    public double y;

    // Orientation courante
    public int angle;

    // Crayon levé ou baissé
    public boolean is_down;

    // Distance parcourue depuis le dernier affichage
    public double distanceTraveled;

    // Vitesse de déplacement de la tortue
    // On met à jour l'affichage dès que distanceTraveled >= speed
    public int speed;

    // Déplace la tortue en (x,y) sans changer son orientation
    public void moveto(double x2, double y2) {
        // Faut-il produire une trace?
        if (this.is_down) {
            animate_draw_line(x2, y2);
        }
        // Met à jour les coordonnées de la tortue.
        this.x = x2;
        this.y = y2;
    }

    public void animate_draw_line(double x2, double y2) {
        double dx = x2 - this.x;
        double dy = y2 - this.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (distance == 0)
            return;
        if (this.distanceTraveled + distance < speed) {
            // on trace la ligne sans afficher
            this.distanceTraveled += distance;
            StdDraw.line(this.x, this.y, x2, y2);
        } else {
            // step : distance restante avant le prochain affichage
            double step = speed - this.distanceTraveled;
            double f = ((double) step / distance);
            double nextx = this.x + dx * f;
            double nexty = this.y + dy * f;
            StdDraw.line(this.x, this.y, nextx, nexty);
            StdDraw.show();
            StdDraw.pause(50);
            this.x = nextx;
            this.y = nexty;
            this.distanceTraveled = 0;
            animate_draw_line(x2, y2);
        }
    }

    // Avance la tortue de "distance" pixels.
    public void forward(double distance) {
        double alpha = (double) this.angle * Math.PI / 180;
        double nextx = this.x + Math.cos(alpha) * distance;
        double nexty = this.y + Math.sin(alpha) * distance;
        moveto(nextx, nexty);
    }

    // lève le crayon
    public void up() {
        this.is_down = false;
    }

    // baisse le crayon
    public void down() {
        this.is_down = true;
    }

    // change l'angle d'orientation de la tortue
    public void setheading(int angle) {
        this.angle = angle;
    }

    // tourne la tortue vers la gauche
    public void left(int angle) {
        this.angle += angle;
    }

    // tourne la tortue vers la droite
    public void right(int angle) {
        this.angle -= angle;
    }

    // change la vitesse de la tortue
    public void setspeed(int speed) {
        this.speed = speed;
    }

    // affiche l'état courant de la tortue
    public void display() {
        this.distanceTraveled = 0;
        StdDraw.show();
        StdDraw.pause(50);
    }

    // attend un clic souris et termine
    public void exitonclick() {
        while (!StdDraw.isMousePressed())
            ;
        System.exit(0);
    }

    // initialisation
    public Turtle(int xwidth, int ywidth) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(xwidth, ywidth);
        StdDraw.setXscale(-xwidth / 2, xwidth / 2);
        StdDraw.setYscale(-ywidth / 2, ywidth / 2);
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(StdDraw.BLUE);
        this.distanceTraveled = 0;
        this.is_down = true;
        this.x = 0;
        this.y = 0;
        this.speed = 10;
        this.angle = 0;
    }

}
