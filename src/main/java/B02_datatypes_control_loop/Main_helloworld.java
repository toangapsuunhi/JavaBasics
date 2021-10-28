
package B02_datatypes_control_loop;

import static java.awt.SystemColor.text;

/**
 *
 * @author Admin
 */
public class Main_helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        int s = sum(2,3);
        System.out.println(s);
        System.out.println(sum(4,6));
        
        printToConsole("Some text");
        
        System.out.println("Factorial of 4: " + interativeFactorial(4));
        
        System.out.println("Factorial of 4: " + calculateFactorial(4));
    }
    private static int sum(int a, int b){
        return a + b;
    }

    private static void printToConsole(String some_text) {
       
    System.out.println(some_text);
    }
    
    // calculateFactorial n*(n+1) ...2 1
    private static int interativeFactorial(int n){
    
        int factorial = 1;
       
        for (int i = 1; i <= n; ++i){
//            factorial = factorial * i;
            factorial *=i;
        }
        return factorial;
        }
    private static int calculateFactorial(int n){
        
        if (n !=0){
            return n * calculateFactorial(n - 1);
        } else{
            return 1;
        }
    }
    


}

