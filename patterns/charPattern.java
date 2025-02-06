package patterns;

public class charPattern {
    public static void main(String args[]) {
        int limit = 7;
        char ch = 'A';
        for(int line=1; line<=limit; line++) {
            for(int rows=1; rows<=line; rows++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }   
}
