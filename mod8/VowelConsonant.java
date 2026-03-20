package mod8;
public class VowelConsonant {
    public static void main(String[] args) {
        String str = "Hello World";
        int v = 0, c = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
