import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

    }
    public static String randomPasswordGenerator(int passwordSize) {
        String passwordGenerator = "abcdefghijklmNBSpqrstuvwxyzALOMBSGQIODAOPQRSTUVWXYZ0123456789!@#$%^&*()_+-={}[]\\\\|;:'\\\"<>,.?/\"";
        SecureRandom rnd = new SecureRandom();
        char[] password = new char[passwordSize];
        for (int i = 0; i < passwordSize; i++) {
            password[i] = passwordGenerator.charAt(rnd.nextInt(passwordGenerator.length()-1));
        }
        return new String(password);
    }
}
