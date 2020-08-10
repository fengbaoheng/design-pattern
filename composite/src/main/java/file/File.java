package file;

public class File extends FileNode {
    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public int size() {
        return size;
    }
}
