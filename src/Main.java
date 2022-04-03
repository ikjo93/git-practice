public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git!!");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]*2;
            System.out.println(numbers[i]);
        }
    }
}
