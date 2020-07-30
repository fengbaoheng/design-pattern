package secrecy;

import java.util.List;
import java.util.stream.Collectors;

public class Secrecy {
    private static final int MASK = 0xFF;

    public static List<Integer> encrypt(List<Integer> in) {
        return in.stream().map(inByte -> inByte ^ MASK).collect(Collectors.toList());
    }

    public static List<Integer> decrypt(List<Integer> in) {
        return in.stream().map(inByte -> inByte ^ MASK).collect(Collectors.toList());
    }
}
