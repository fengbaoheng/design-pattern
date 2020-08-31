package archive;

import java.util.ArrayList;
import java.util.List;

public class SavePoint {
    private final List<Archive> archives = new ArrayList<>();

    public void addArchive(Archive archive) {
        archives.add(archive);
    }

    public Archive getArchive(int index) {
        return archives.get(index);
    }
}
