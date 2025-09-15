public class Recursivite {
    
    // Écrivez vos fonctions ici
    //EX1
    public static int factorielle (int n){
        if (n==0){ return 1;}
        else{ return (factorielle(n-1)*n);}
    }
    //EX2
    public static int Fibonacci (int n){
        if (n==0){return 0;}
        else if (n==1){return 1;}
        else {
            return (Fibonacci(n-2)+Fibonacci(n-1));}
    }
    //EX3
    public static int Syracuse (int p){
        if (p==1){return 0;}
        else{
            if (p%2==0){
                return Syracuse(p/2)+1;
            } else{
                return Syracuse(3*p+1)+1;
            }
        }
    }
    //EX4
    public static Boolean Palindrome (String s){
        if (s.isEmpty()){
            return true;
        } else {
            return Palindrome(s.substring(1,s.length()-1))&&(s.charAt(0)==s.charAt(s.length()-1));
        }
    }
    //EX5
    public static int Sum (int[] tab, int i){
        if (tab.length==0){
            return -1;
        } 
        if (i==tab.length-1){
            return tab[i];
        } else{
            return tab[i]+Sum(tab,i+1);
        }
    }
    public static int sumArray (int[] tab){
        return Sum(tab, 0);
    }
    //EX6
    public static Boolean Sort (int[]tab, int i){
        if (tab.length==0 || i==tab.length-1){
            return true;
        } else{
            return Sort(tab, i+1)&&(tab[i]<=tab[i+1]);
        }
    }
    public static Boolean isSorted (int[] tab){
        return Sort(tab,0);
    }
    

    public static void main(String[] args) {
        // Écrivez vos tests ici
        int[] tab = {1,3,5,7,10}; int[] tab2 = {1,3,3}; int[] tab3 = {1,3,2};
        
    }
}