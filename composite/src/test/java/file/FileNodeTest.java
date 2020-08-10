package file;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FileNodeTest {

    @Test
    public void testFile() {
        File file;

        file = new File(4);
        assertEquals(4, file.size());
        assertEquals(1, file.count());
    }

    @Test
    public void testDirectory() {
        Directory d1 = getDirectory(1, 2, 3);
        assertEquals(3, d1.count());
        assertEquals(6, d1.size());

        Directory d2 = getDirectory(4, 5);
        assertEquals(2, d2.count());
        assertEquals(9, d2.size());

        Directory root = getDirectory();
        root.add(d1);
        root.add(d2);
        assertEquals(5, root.count());
        assertEquals(15, root.size());

    }

    private Directory getDirectory(int... sizes) {
        Directory directory = new Directory();
        getFiles(sizes).forEach(directory::add);
        return directory;
    }

    private Stream<File> getFiles(int... sizes) {
        return Arrays.stream(sizes).mapToObj(File::new);
    }
}