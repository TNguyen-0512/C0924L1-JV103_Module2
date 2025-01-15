package case_study.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static final String FILE_PATH = "src/case_study/data";

    public static List<String> readFile(String fileName) {
        List<String> list = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + fileName))) {
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
        } catch (IOException e) {
           System.out.println("Lỗi đọc file !!!" + e.getMessage());
        }
        return list;
    }
    public static void writeFile(String fileName, List<String> list) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH + fileName))) {
            for(String str : list){
                bw.write(str);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Lỗi ghi file !!!" + e.getMessage());
        }
    }
    public static void ownerWriteFile(String fileName, List<String> list) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH + fileName))){
            for(String str : list){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file !!!" + e.getMessage());
        }
    }
}
