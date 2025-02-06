package patterns;

public class starPattern {
    public static void main(String args[]){
        int limit = 5;
        for(int line=1; line<=limit; line++) {
            for(int stars=1;stars<=line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
