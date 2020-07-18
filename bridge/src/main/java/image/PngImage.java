package image;

public class PngImage extends Image {
    public PngImage(Painter painter) {
        super(painter);
    }

    @Override
    protected Matrix parse(String path) {
        System.out.println("解析Png格式文件");
        return new Matrix();
    }

    @Override
    protected void paint(Matrix matrix) {
        painter.paint(matrix);
    }
}
