public class oneToTenPrint {
    public static void main(String args[]){
        int num = 1;
        while (num<=10) {
            System.out.print(num+" ");
            num++;
        }

        for(int i=1;i<11;i++){
            System.out.println(i+" ");
        }

        do{
            System.out.println(num+" "); //print 11
        }while(num<=10); //exit loop beacase num <= 10 & here num is 11 now
    }
}
