package module4;
public class StringImmutable {
        public static void main(String[] args) {
            String s = "Hello";
            s.concat(" World");
            System.out.println(s); // original string not changed
        }
    }

