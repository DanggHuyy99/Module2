package coppyfile;

import java.io.*;

public class CoppyFile {
    public void coppyFile(String sourceFile, String targetFile){
        try {
            File source_file = new File(sourceFile);
            if (!source_file.exists()) throw new FileNotFoundException("Hong có file source ♥♥");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source_file));

            File target_file = new File(targetFile);
            if (!target_file.exists()) throw new FileNotFoundException("Hong có file target !♥♥");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));

            int c;
            int count = 0;
            while ((c = bufferedReader.read()) != -1){
                bufferedWriter.write(c);
                count++;
            }
            System.out.println(" File Coppy thành công có " + count + " ký tự");
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
