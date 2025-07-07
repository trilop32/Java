package String;
public class String62 {
    public static String encrypt(String text) {
        StringBuilder Text = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = encryptChar(c);
                Text.append(encryptedChar);
            } else {
                Text.append(c);
            }
        }
        return Text.toString();
    }
    private static char encryptChar(char c) {
        if (Character.isLowerCase(c)) {
            if (c == 'я') {
                return 'а';
            } else if (c == 'е') {
                return 'ж';
            } else {
                return (char) (c + 1);
            }
        } else if (Character.isUpperCase(c)) {
            if (c == 'Я') {
                return 'А';
            } else if (c == 'Е') {
                return 'Ж';
            } else {
                return (char) (c + 1);
            }
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        String text = "Привет, мир! Я хочу есть!";
        String Text = encrypt(text);
        System.out.println("Исходный текст: " + text);
        System.out.println("Зашифрованный текст: " + Text);
    }
}