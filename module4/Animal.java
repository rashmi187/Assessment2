package module4;
final class Animal {
        void show() {
            System.out.println("This is a final class");
        }
    }

    final class FinalClassDemo {
        public static void main(String[] args) {
            Animal a = new Animal();
            a.show();
        }
    }

