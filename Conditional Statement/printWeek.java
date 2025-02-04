import java.util.*;
public class printWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number for weeks(1 to 7):");
            int userChoose = sc.nextInt();
            switch (userChoose) {
                case 1 : System.out.println("sundeay");
                break;
                case 2 : System.out.println("monday");
                break;
                case 3 : System.out.println("thusday");
                break;
                case 4 : System.out.println("wednsday");
                break;
                case 5 : System.out.println("thursday");
                break;
                case 6 : System.out.println("friday");
                break;
                case 7 : System.out.println("saturday");
                break;
                default : System.out.println("Please choose from follwing options.");
            }

    }
}
