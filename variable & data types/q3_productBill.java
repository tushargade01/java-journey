import java.util.*;
public class q3_productBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float sumOfProducts = 0.0f;
        System.out.print("How many product are you buying? Enter-  ");
        int productSize = sc.nextInt();
        for(int i=1;i<=productSize;i++){
            System.out.println("Enter price of "+i+" Product: ");
            sumOfProducts += sc.nextFloat();
        }
        float productGST = (sumOfProducts*18)/100;
        System.out.print("final Bill:\nproduct total is: "+sumOfProducts+"\nproduct GST: "+productGST+"\nTotal: "+(productGST+sumOfProducts));
        sc.close();
    }
}
