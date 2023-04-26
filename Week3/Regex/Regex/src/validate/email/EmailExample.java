package validate.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static void main(String[] args) {
//        EmailExample emailxample = new EmailExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        EmailExample emailExample1 = new EmailExample();
        boolean check = emailExample1.validate(email);
        System.out.println("Email " + email + ((check) ? "is valid" : "is not valid"));
//        emailExample = new EmailExample();
//        for (String email1 : validEmail) {
//            boolean isValid = emailExample.validate(email);
//            System.out.println("Email is " + email + " is valid: " + isValid);
//        }
//        emailExample = new EmailExample();
//        for (String email1 : invalidEmail){
//            boolean isNotValid = emailExample.validate(email);
//            System.out.println("Email is " + email + " is not valid " + isNotValid);
//        }
    }

//    private static EmailExample emailExample;
//    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
//    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
