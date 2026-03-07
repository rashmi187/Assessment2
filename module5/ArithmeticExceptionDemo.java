package module5;
public class ArithmeticExceptionDemo {
        public static void main(String[] args) {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        }
    }

