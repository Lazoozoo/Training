public class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 3;
        j = 10;
        if (i != 0) {
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
        if (i == 0) System.out.println("На ноль делить нельзя!");
    }
}
