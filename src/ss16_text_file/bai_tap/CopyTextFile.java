package ss16_text_file.bai_tap;

import java.io.*;

public class CopyTextFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\CodeGym\\Module2\\src\\ss16_text_file\\data\\sourcefile.csv");
        File targetFile = new File("D:\\CodeGym\\Module2\\src\\ss16_text_file\\data\\targetfile.csv");
        try (
                FileReader fileReader = new FileReader(sourceFile);
                FileWriter fileWriter = new FileWriter(targetFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            int count = 0;
            int c;
            while ((c = bufferedReader.read()) != -1) {
                count++;
            }
            System.out.println("Số ký tự trong file: "+count);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Sao chép file thành công!");
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại hoặc không tìm thấy");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
