public class Fonctions {

    /* Écrivez vos fonctions ici */
    public static int div10(int x){
        int y =(10/x) ;
        return y;
    }
    public static int sumproduct(int x, int y, int z){
        int a = (x*y)+(x*z)+(y*z);
        return a;
    }
    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        
        System.out.println(div10(1)+div10(3)+div10(5)+div10(7));
        System.out.println(sumproduct(2, 2+1, div10(10)));
            
    }
}
