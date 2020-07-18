package image;

import java.rmi.MarshalException;

public abstract class Image {
    /**
     * 桥接的与操作系统关联的Painter
     */
    protected Painter painter;

    public Image(Painter painter) {
        this.painter = painter;
    }

    /**
     * 业务方法 打开一个图像
     *
     * @param path 图像路径
     */
    public void open(String path) {
        Matrix matrix = parse(path);
        paint(matrix);
    }

    protected abstract Matrix parse(String path);

    protected abstract void paint(Matrix matrix);
}
