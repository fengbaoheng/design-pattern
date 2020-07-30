package secrecy;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class SecrecyTest {
    @Test
    public void testEncryptAndDecrypt() {
        String message = "123adf;'  !@#$%^!@#中文测试(⊙﹏⊙)👼🈚";

        List<Integer> bytes = getBytes(message);
        List<Integer> encrypted = Secrecy.encrypt(bytes);
        List<Integer> decrypted = Secrecy.decrypt(encrypted);

        Assert.assertNotEquals(bytes, encrypted);
        Assert.assertEquals(bytes, decrypted);
    }




    private List<Integer> getBytes(String message) {
        List<Integer> bytes = new LinkedList<>();
        for (byte b : message.getBytes()) {
            bytes.add((int) b);
        }
        return bytes;
    }
}