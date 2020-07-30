package secrecy;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;

public class FileToBytes {
    public static List<Integer> read(String path) {
        List<Integer> bytes = new LinkedList<>();

        try (FileInputStream inputStream = new FileInputStream(path)) {
            int b;
            while ((b = inputStream.read()) != -1) {
                bytes.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bytes;
    }
}
