package student.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> wirtefile(String Student_file, List<String> stringList, boolean append) {
        File file = new File(Student_file);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, append);
            bw = new BufferedWriter(fw);
            for (String s : stringList) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringList;
    }

    public static <T> void wirtefile(String Student_file, List<T> obj) {
        File file = new File(Student_file);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!!!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("lỗi ghi file !!!");
        }
    }

    public static <T> List<T> readfile(String Student_file) {
        List<T> obj = new ArrayList<>();
        File file = new File(Student_file);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        if (file.length() > 0) {
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                obj = (List<T>) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File không có!!!");
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Lỗi đọc file");
            }
        }
        return obj;
    }

    public static <T> void writeListObjfile(String Student_file, List<T> obj) {
        File file = new File(Student_file);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại !!!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi ghi file !!!");
        }
    }

    public static <T> List<T> readListObjfile(String Student_file) {
        List<T> obj = new ArrayList<>();
        File file = new File(Student_file);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        if (file.length() > 0) {
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                obj = (List<T>) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File không tồn tại !!!");
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Lỗi ghi file !!!");
            }
        }
        return obj;
    }
}
