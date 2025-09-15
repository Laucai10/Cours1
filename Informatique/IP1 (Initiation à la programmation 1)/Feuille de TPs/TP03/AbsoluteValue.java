import java.util.Random;

public class AbsoluteValue {

    /**** Les 3 fonctions à tester dans cet exercice - ne pas modifier ****/

    public static int myAbs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int sqrtAbs(int x) {
        if (x < 100) {
            return (int) (Math.sqrt(x * x));
        } else {
            return (int) (Math.pow(Math.sqrt(x), 2));
        }
    }

    public static int bitwiseAbs(int x) {
        int mask = x >> 20;
        x ^= mask;
        x += mask & 1;
        return x;
    }

    /**** Écrire vos tests dans la fonction main ****/

    public static void main(String[] args) {
        System.out.println("Pas encore de tests ici...");
    }


    /*
     * Fonction fournie pour cet exercice qui renvoie au hasard un entier
     * entre a (inclus) et b (exclus)
     */

    static Random rand = new Random();

    public static int randRange(int a, int b) {
        return (rand.nextInt(b - a) + a);
    }

}
