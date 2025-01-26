import java.util.*;
public class q2_AreaOfSqure {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Squre: ");
        int sideOfSqure = sc.nextInt();
        sc.close();
        System.out.println("Area of Squre is: "+(sideOfSqure*sideOfSqure));
    }
}
