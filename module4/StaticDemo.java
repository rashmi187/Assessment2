package module4;
public class StaticDemo {
        static int count = 0;
        static void display() {
            System.out.println("Static Method Called");
        }
        StaticDemo() {
            count++;
        }
        public static void main(String[] args) {
            StaticDemo obj1 = new StaticDemo();
            StaticDemo obj2 = new StaticDemo();
            System.out.println("Count = " + count);
            display();
        }
    }

