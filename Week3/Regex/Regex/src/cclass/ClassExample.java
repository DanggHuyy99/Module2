package cclass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cclass;
        boolean checkClass;
        do {
            System.out.println("Nhập tên lớp học:");
            cclass = scanner.nextLine();
            ClassExample classExample = new ClassExample();
            checkClass = classExample.validate(cclass);
            if (!checkClass) {
                System.out.println("Class " + cclass + " is not valid");
                System.out.println("Nhập lại");
                continue;
            }
            System.out.println("Class " + cclass + " is valid");
        } while (!checkClass);

    }

    public ClassExample() {
    }

    ;
    private static final String CLASS_REGEX = "^[A-Z]\\d{5}[A-Z]";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
