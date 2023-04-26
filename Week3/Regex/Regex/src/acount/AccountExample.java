package acount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String account;
        for (int i = 1; i <= 5; i++){
            System.out.println("Nhập Account:");
            account = scanner.nextLine();
            AccountExample accountExample = new AccountExample();
            boolean checkAccount = accountExample.validate(account);
            System.out.println("Account " + account + ((checkAccount) ? " Hợp lệ" : " Không hợp lệ"));
        }
    }

    public AccountExample() {
    }

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
