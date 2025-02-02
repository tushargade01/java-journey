package operators;

public class precidance {
    public static void main(String args[]){
        int m=2; int n=5;
        int exp1 = m*n/m;
        int exp2 = m*(n/m);
        System.out.println(exp1);
        System.out.println(exp2);

        int a = 200; int b = 50; int c = 150;
        if(a>b && c<b){
            System.out.println("java");
        }else if((b+200)>b && c>b){
            System.out.println("hello World!");
        }else{
            System.out.println("not available");
        }

        int x, y, z;
        x = y = z = 2;
        System.out.println(x + " " + y + " " + z);
        x += y;
        System.out.println(x + " " + y + " " + z);
        y -= z;
        System.out.println(x + " " + y + " " + z);
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
