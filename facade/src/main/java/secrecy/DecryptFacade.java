package secrecy;

import java.util.List;

public class DecryptFacade {
    public static void decrypt(String inPath, String outPath) {
        List<Integer> bytes = FileToBytes.read(inPath);
        List<Integer> decrypted = Secrecy.decrypt(bytes);
        BytesToFile.write(outPath, decrypted);
    }
}
