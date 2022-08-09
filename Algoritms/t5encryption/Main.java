package Algoritms.t5encryption;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {

        SecretKeySpec key = new SecretKeySpec("QWE12345QWE12345".getBytes(),"AES");

        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите текст:");
            String s = scanner.nextLine();
            System.out.println("Для шифрования введите \"+\", для расшифрования введите \"-\"");
            String p = scanner.next();

            if (p.equalsIgnoreCase("+")) {
                Cipher cipher = Cipher.getInstance("AES");
                cipher.init(Cipher.ENCRYPT_MODE, key);
                byte[] bytes = cipher.doFinal(s.getBytes());
                String encriptValue = new BASE64Encoder().encode(bytes);
                System.out.println(encriptValue);
                System.out.println();

            } else if (p.equalsIgnoreCase("-")) {
                Cipher descriptCipher = Cipher.getInstance("AES");
                descriptCipher.init(Cipher.DECRYPT_MODE, key);
                byte[]tmp = new BASE64Decoder().decodeBuffer(s);
                byte[] dbytes = descriptCipher.doFinal(tmp);
                String decriptValue = new String(dbytes);
                System.out.println(decriptValue);

            } else {
                System.err.println("Неверное значение!");
            }
        }
}
