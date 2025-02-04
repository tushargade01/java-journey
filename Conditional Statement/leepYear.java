import java.util.*;
public class leepYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int userInput = sc.nextInt();
        if(userInput % 4 == 0 && userInput % 400 == 0){
            System.out.println(userInput+" is a leep year.");
        }else {
            System.out.println("not a leep year.");
        }
    }
}
