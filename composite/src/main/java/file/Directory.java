package file;

import java.util.LinkedList;
import java.util.List;

public class Directory extends FileNode {
    private List<FileNode> fileNodes = new LinkedList<>();

    @Override
    public int count() {
        return fileNodes.stream().mapToInt(FileNode::count).sum();
    }

    @Override
    public int size() {
        return fileNodes.stream().mapToInt(FileNode::size).sum();
    }

    public void add(FileNode node) {
        fileNodes.add(node);
    }

    public void remove(FileNode node) {
        fileNodes.remove(node);
    }
}
