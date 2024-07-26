import java.util.Random;

public class PasswdGenerator {
    public static void main(String[] args) {
        int passwordLength = 12;
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length must be at least 8 characters.");
        }

        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String allChars = lowerCaseLetters + upperCaseLetters + digits;

        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));


        for (int i = 3; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        return new String(passwordArray);
    }
}

