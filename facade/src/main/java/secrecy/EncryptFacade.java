package secrecy;

import java.util.List;

public class EncryptFacade {
    public static void encrypt(String inPath, String outPath) {
        List<Integer> bytes = FileToBytes.read(inPath);
        List<Integer> encrypted = Secrecy.encrypt(bytes);
        BytesToFile.write(outPath, encrypted);
    }
}
