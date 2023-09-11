public class FizzBuzzWhile {
    public static void main(String[] args) {

        int u = 1;
        while (u < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = u % 3 == 0;
            boolean divisibleBy5 = u % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(u);

            }

            u += 1;
        }
    }
}
