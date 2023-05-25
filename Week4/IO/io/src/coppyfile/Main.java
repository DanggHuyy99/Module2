package coppyfile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập source:");
        String sourceFile = scanner.nextLine();

        System.out.println("Nhập target:");
        String targetFile = scanner.nextLine();

        CoppyFile coppyFile = new CoppyFile();
        coppyFile.coppyFile(sourceFile, targetFile);
    }
}
