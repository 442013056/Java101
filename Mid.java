import java.util.Scanner;
public class Mid
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter a following");
		
	    float var1 = scan.nextFloat();
		var1 = var1 / 10 * 100;
		
		if(var1 > 100 && var1 < 0){
		    System.out.print("Error,please try again and anter a number bwtween 0 and 10");}
		    
		 else if(var1 < 50){
		     System.out.print(var1 + "is less than 50%");}
		     
		  else{
		      System.out.print(var1 + "is greater or equel than 50%");}
	}
}
