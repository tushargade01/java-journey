package patterns;

public class numberPattern {
    public static void main(String args[]) {
        int n = 5;
        for(int line=1; line<=5;line++) {
            for(int numbers=1;numbers<=line;numbers++) {
                System.out.print(numbers+" ");
            }
            System.out.println();
        }
    }
}
