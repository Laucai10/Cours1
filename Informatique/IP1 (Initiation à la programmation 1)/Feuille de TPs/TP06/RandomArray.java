import java.util.Random;
public class RandomArray {
 static Random rand = new Random();

/* ************************************************************************** */
  

    //  QUESTION 1 
    // public static int[] createRandomArray(int n)
	

    // QUESTION 2
    //public static int[] minMaxAverage(int[] a)
    
 
    // QUESTION 3
    //public static int[] occurrences(int[] a)
  
    // QUESTION 4a
    //public static int[] countingSort(int[] a)
  
    // QUESTION 4b
    //public static void countingSort2(int[] a)


      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/
	
    public static boolean  intArrayEquals (int[] a, int[] b){
    	if (a.length!=b.length) {
	        return false;
		}
	    for (int i=0; i<a.length; i++){
	        if (a[i]!=b[i]){
	        	return false;
	        }
	    }
	    return true;
    }
  
    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */


    public static void main(String[] args){
    //System.out.println("Entrez un entier positif (la taille du tableau):");
    //	int n = Integer.parseInt(System.console().readLine());
    //	int[] a = createRandomArray(n);	
    //	printIntArray(a);
	
    }


}
