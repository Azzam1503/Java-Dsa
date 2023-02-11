public class fahrenheitToCelsius{
    public static double fahToCel(int fah){
        double cel = ((5.0/9)*fah-32);
        return cel;
    }
    public static void main(String[] args) {
        System.out.println(fahToCel(100));
    }
}