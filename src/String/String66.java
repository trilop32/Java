package String;
public class String66 {
    public static String encrypt(String text) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                oddChars.append(text.charAt(i));
            } else             {
                evenChars.append(text.charAt(i));
            }
        }
        return evenChars.toString() + new StringBuilder(oddChars).reverse().toString();
    }
    public static void main(String[] args) {
        String sentence = "Программа";
        String encryptedSentence = encrypt(sentence);
        System.out.println("Исходная строка: " + sentence);
        System.out.println("Зашифрованная строка: " + encryptedSentence);
        String sentence2 = "Hello World!";
        String encryptedSentence2 = encrypt(sentence2);
        System.out.println("Исходная строка: " + sentence2);
        System.out.println("Зашифрованная строка: " + encryptedSentence2);
    }
}
