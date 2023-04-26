package phonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        boolean checkNumber;
        do {
            System.out.println("Nhập số phone");
            phoneNumber = scanner.nextLine();
            PhoneExample phoneExample = new PhoneExample();
            checkNumber = phoneExample.validate(phoneNumber);
            if (!checkNumber) {
                System.out.println("Phone " + phoneNumber + " không hợp lệ");
                System.out.println("Mời nhập lại");
                continue;
            }
            System.out.println("Phone " + phoneNumber + " hợp lệ");
        } while (!checkNumber);
    }

    public PhoneExample() {
    }

    ;

    private final static String PHONE_REGEX = "84-0\\d{9,10}";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
