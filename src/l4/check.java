//String getValidLogin(Scanner sc) {
//    String login = null;
//    boolean valid = false;
//    while (!valid) {
//        System.out.print("Введите логин: ");
//        login = sc.nextLine();
//        try {
//            validateLogin(login);
//            valid = true;
//        } catch (WrongLoginException e) {
//            System.err.println("Ошибка: " + e.getMessage());
//            System.out.println("Попробуйте еще раз.");
//        }
//    }
//    return login;
//}
//String[] getValidPassword(Scanner sc) {
//    String password = null;
//    String confirmPassword = null;
//    boolean valid = false;
//    String[] passwords = new String[2];
//    while (!valid) {
//        System.out.print("Введите пароль: ");
//        password = sc.nextLine();
//        System.out.print("Подтвердите пароль: ");
//        confirmPassword = sc.nextLine();
//        try {
//            validatePassword(password, confirmPassword);
//            valid = true;
//        } catch (WrongPasswordException  e) {
//            System.err.println("Ошибка: " + e.getMessage());
//            System.out.println("Попробуйте еще раз.");
//        }
//    }
//    passwords[0] = password;
//    passwords[1] = confirmPassword;
//    return passwords;
//}
//void validateLogin(String login) throws WrongLoginException {
//    if (login == null || login.length() < 5) {
//        throw new WrongLoginException("Логин должен содержать не менее 5 символов.");
//    }
//    if (!login.matches("[a-zA-Z0-9_]+")) {
//        throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания.");
//    }
//}
//void validatePassword(String password, String confirmPassword) throws WrongPasswordException  {
//    if (password == null || password.length() < 8) {throw new WrongPasswordException ("Пароль должен содержать не менее 8 символов.");
//    }
//    if (!password.equals(confirmPassword)) {
//        throw new WrongPasswordException ("Пароль и подтверждение пароля не совпадают.");
//    }
//    if (!isValidPassword(password)) {
//        throw new WrongPasswordException ("Пароль должен содержать как минимум 3 из 4 групп символов: латинские буквы (большие и маленькие), цифры и знак подчеркивания.");
//    }
//}
//boolean isValidPassword(String password) {
//    boolean hasUppercase = false;
//    boolean hasLowercase = false;
//    boolean hasDigit = false;
//    boolean hasUnderscore = false;
//    for (char c : password.toCharArray()) {
//        if (Character.isUpperCase(c)) {
//            hasUppercase = true;
//        } else if (Character.isLowerCase(c)) {
//            hasLowercase = true;
//        } else if (Character.isDigit(c)) {
//            hasDigit = true;
//        } else if (c == '_') {
//            hasUnderscore = true;
//        }
//    }
//    int count = 0;
//    if (hasUppercase) count++;
//    if (hasLowercase) count++;
//    if (hasDigit) count++;
//    if (hasUnderscore) count++;
//    return count >= 3;
//}
//static class WrongLoginException extends Exception {
//    public WrongLoginException(String message) {
//        super(message);
//    }
//}
//static class WrongPasswordException  extends Exception {
//    public WrongPasswordException (String message) {
//        super(message);
//    }
//}
//void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String login = getValidLogin(sc);
//    String[] passwords = getValidPassword(sc);
//    System.out.println("Логин и пароль валидны.");
//}