
public class Task1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }
}
