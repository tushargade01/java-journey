import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int userInput = sc.nextInt();
        System.out.println("");
        for(int i=1;i<11;i++){
            System.out.print((i*userInput)+" ");
        }
    }
}
