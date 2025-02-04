import java.util.*;
public class checkNumberType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userNum = sc.nextInt();
        sc.close();
        if(userNum>0){
            System.out.println(userNum+" number is positive");
        }else{
            System.out.println(userNum+" number is negative");
        }
    }    
}
