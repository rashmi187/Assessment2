package module5;
public class ThrowsExample {
        static void checkNumber(int num) throws ArithmeticException {
            if (num < 0) {
                throw new ArithmeticException("Number is negative");
            } else {
                System.out.println("Number is positive");
            }
        }
        public static void main(String[] args) {
            checkNumber(-5);
        }
    }


