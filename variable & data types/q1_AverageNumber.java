import java.util.*;
class q1_AverageNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int avgSum = 0;
        for(int i=1; i<=3;i++){
            System.out.println("Enter "+i+" number:");
            avgSum += sc.nextInt();
            sc.close();
        }
        System.out.println("Average Sum of Three Numbers is:"+avgSum/3);
    }
}