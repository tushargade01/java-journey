public class q2 {
    public static void main(String args[]){
        int a[] = {3,4,5,6};
        int evenSum = 0;
        int oddSum =0;
        for(int i=0;i<a.length;i++){
            
            if(a[i]%2==0){
                evenSum+=a[i];
            }else{
                oddSum+=a[i];
            }
        }
        System.out.println("even : "+evenSum+" odd : "+oddSum);
    }
}
