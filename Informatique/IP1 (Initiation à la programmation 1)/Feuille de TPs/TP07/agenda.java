import java.io.*;
import java.util.*;

class agenda {

    // parametres 2016
    static int yearLength = 366; // 2016 est une année bisextile
    static int firstWDay = 4; // 2016 commence un vendredi
    


    /* ***********************************************************/
    /* FONCTION PRINCIPALE                                       */
    /* ***********************************************************/


    public static void main (String [] args) {

	// chargement de l'agenda a partir du fichier
	String [] t = loadAgenda("agenda.dat");


	// modifier et/ou afficher l'agenda
    }




    /* ***********************************************************/
    /* PROCEDURE D'AFFICHAGE                                     */
    /* ***********************************************************/

    // a partir de la question 3, definissez ici la procedure
    // d'affichage showAgenda



    /* ***********************************************************/
    /* CONVERSION DE DATE                                     */
    /* ***********************************************************/

    // corrigez la fonction ci-dessous

    public static int monthOfDayNumber (int dayNumber) {
	int [] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	int res = 1;
	for (int i = 0; i<12; i++){  
	    if (dayNumber > daysInMonth[i]) {
		dayNumber = dayNumber - daysInMonth[i];
		res = res + 1; 
	    }
	}
	return res;
    }


    /* ***********************************************************/
    /* ANNEXE                                                    */
    /* ***********************************************************/

    public static String [] loadAgenda(String fileName) {
    // Lit un fichier contenant un agenda et le renvoie sous forme
    // de tableau

	String [] res = new String[yearLength];

	for (int i=0;i<yearLength;i++){
	    res[i] = "";
	}

	try { 
	    Scanner sc = new Scanner (new File(fileName)).useDelimiter("\n");
	    while (sc.hasNext()) {
		String [] line = sc.next().split(":");
		int day = Integer.parseInt(line[0]);
		String desc = line[1];
		res[day] = desc;
	    }
	    return res;
	} catch (IOException e) {
	    System.out.println("erreur de lecture de fichier"); 
	    return res;
	}
	
    }

}
