public class q2 {
    static boolean isEven(int num) {
        boolean IsEven = num%2==0? true:false;
        return IsEven;
    }
    public static void main(String args[]) {
        int num = 1;
        if(isEven(num)) {
            System.out.println(num+" is a even number.");
        } else {
            System.out.println(num+" is a odd number.");
        }
    }
}
