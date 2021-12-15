import java.util.Scanner;
public class Main {
    static int mult(int x,int y){
        return x * y;
    }
    
    
    
    
    public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter a number");
     int v = scan.nextInt();
     int v2 = scan.nextInt();
     System.out.println(mult(v,v2));
    
    }
}
