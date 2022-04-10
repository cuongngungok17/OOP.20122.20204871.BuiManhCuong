import java.util.Scanner;
public class exercise226{
    public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("linear equation enter 1 and linear system enter 2 :");
		System.out.println("Enter number : ");
		int iNumber = keyboard.nextInt();
		switch(iNumber) {
		case 1:
			System.out.println("Solve : ax +b = 0 ");
			System.out.print("Enter a : ");
			float a = keyboard.nextFloat();
			System.out.print("Enter b : ");
			float b = keyboard.nextFloat();
			if(a == 0 && b!=0) {
				System.out.println("No answer ");
			}else if(a==0 && b== 0) {
				System.out.println("Wealth of counter");
			}else {
				float fAnswer = -b/a;
				System.out.println("Answer:" );
				System.out.println(fAnswer);
			}
            break;
		case 2:
			System.out.println("Solve : a11x1 +a12x2 = b1 & a21x1+a22x2 = b2 ");
			System.out.print("Enter a11 : ");
			float a11 = keyboard.nextFloat();
			System.out.print("Enter a12 : ");
			float a12 = keyboard.nextFloat();
			System.out.print("Enter b1 : ");
			float b1 = keyboard.nextFloat();
			System.out.print("Enter a21 : ");
			float a21 = keyboard.nextFloat();
			System.out.print("Enter a22 : ");
			float a22 = keyboard.nextFloat();
			System.out.print("Enter b2 : ");
			float b2= keyboard.nextFloat();
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				System.out.println("Wealth of counter");
			}else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				System.out.println("No answer ");
			}else {
				float fAnswerx1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				System.out.println("Answer x1:" );
				System.out.println(fAnswerx1);
				float fAnswerx2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				System.out.println("Answer x2:" );
				System.out.println(fAnswerx2);
			}
            break;
		}
	}
}