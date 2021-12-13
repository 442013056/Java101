import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("days");
     
     int var1 = scan.nextInt();
     switch(var1){
         case  1:
         case  2:
         case  3:
         case  4:
         case  5:
             System.out.print("weekdays");
        break;
        
        
        case 6:
        case 7:
            System.out.print("weekend");
        break;
        
        default:
           System.out.print("eror");
     }
     
    }
}
