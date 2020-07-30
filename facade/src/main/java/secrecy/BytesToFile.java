package secrecy;

import java.io.FileOutputStream;
import java.util.List;

public class BytesToFile {
    public static void write(String path, List<Integer> bytes) {
        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            for (Integer b : bytes) {
                outputStream.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
