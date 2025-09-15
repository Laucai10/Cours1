import java.io.*;
import java.util.*;

class Palindrome {

    /**** La fonction reverse, à tester puis corriger ****/

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i > 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    /**** Les trois fonctions isPalindrome à tester dans cet exercice - ne pas modifier ****/

    public static boolean isPalindrome1(String s) {
        boolean res = true;
        int n = s.length() - 1;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                res = false;
            }
        }
        return res;
    }

    public static boolean isPalindrome2(String s) {
        return (s.equals(reverse(s)));
    }

    public static boolean isPalindrome3(String s) {
        String firstHalf = s.substring(0, s.length() / 2);
        String s2 = firstHalf + reverse(firstHalf);
        return (s.equals(s2));
    }

    /**** La fonction main où mettre vos tests ****/

    public static void main(String[] args) {
        System.out.println("Pas encore de tests ici...");
    }

    /**** Les fonctions auxiliaires ****/

    /*
     * Fonctions fournies pour cet exercice afin de charger le dictionnaire
     * "dico_fr.txt" puis de renvoyer le mot numéro i dans ce dictionnaire.
     */

    static String dictName = "dico_fr.txt";
    static int dictSize = 336531;
    static String[] dict = new String[dictSize];
    static boolean dictLoaded = false;

    public static void loadError() {
        System.out.println("Erreur de chargement du fichier texte !");
        System.exit(1);
    }

    public static void loadDict() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(dictName));
            for (int i = 0; i < dictSize; i++) {
                dict[i] = br.readLine();
                if (dict[i] == null) {
                    loadError();
                }
            }
            dictLoaded = true;
            br.close();
        } catch (Exception e) {
            loadError();
        }
    }

    public static String wordFromDict(int i) {
        if (!dictLoaded) {
            loadDict();
        }
        return dict[i];
    }

    public static String loadPerec() {
        String text = "";
        try {
            Scanner scanner = new Scanner(new File("perec.txt"));
            text = scanner.useDelimiter("\\A").next();
            scanner.close();
        } catch (Exception e) {
            loadError();
        }
        return text;
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
