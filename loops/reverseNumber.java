public class reverseNumber {
    public static void main(String args[]){
        int num = 7238;
        while(num>0){
            System.out.print((num%10)+"");
            num/=10;
        }
    }
}
