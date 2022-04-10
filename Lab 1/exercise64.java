import java.util.Scanner;

public class exercise64 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if((month<1)||(month>12)){
            System.out.println("Please enter the month again!");
        }
        else{
            if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
                System.out.println("There are 31 days in this month!");
            }
            else if((month==4)||(month==6)||(month==9)||(month==11)){
                System.out.println("There are 30 days in this month!");
            }
            if(month==2){
                if((year%400==0)||((year%4==0)&&(year%100!=0))){
                    System.out.println("There are 29 days in this month!");
                }
                else{
                    System.out.println("There are 28 days in this month!");
                }
            }
        }
    }
}
