import java.util.Scanner;
public class exercise225 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.println("The sum of a and b: " +(a+b));
        System.out.println("The diffrence of a and b: " +(a-b));
        System.out.println("The product of a and b: "+ (a*b));
        if (b==0){
            System.out.println("there is no quotient!");
        }
        else{
            System.out.println("The quotient of a and b: "+ (a/b));
        }
    }
}
