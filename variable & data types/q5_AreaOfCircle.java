public class q5_AreaOfCircle {
    static float getAreaOfCricle(int radius){
        final float pi = 3.14f;
        float areaOfCricle = pi*radius*radius;
        return areaOfCricle;
    }
    public static void main(String args[]){
        System.out.println(getAreaOfCricle(5));
    }
}
