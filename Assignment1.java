import java.util.Scanner;
//great job, thanks for your hard work
//your grade is 4.5/5
//@ change class name Main to match file name Assignment1 ( golden rule )
class Main {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter two float digits :");
        float num1 = numbers.nextFloat();
        float num2 = numbers.nextFloat();
        System.out.println("Addition + :"+(num1+num2));
        System.out.println("Subtraction  - :"+(num1-num2));
        System.out.println("Multiplication  * :"+(num1*num2));
        System.out.println("Division / :"+(num1/num2));
        System.out.println("Modulus % :"+(num1%num2));
        System.out.println("Grater > :"+(num1>num2));
        System.out.println("Grater or equal :"+(num1>=num2));
        System.out.println("Less :"+(num1<num2));
        System.out.println("Less or equal :"+(num1<=num2));
        System.out.println("Not equal :"+(num1!=num2));
        System.out.println("Equal :"+(num1==num2));
        //عبدالله فيصل الحساني
        //442013056
    }
}
