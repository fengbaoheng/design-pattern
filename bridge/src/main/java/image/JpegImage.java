package image;

public class JpegImage extends Image {

    public JpegImage(Painter painter) {
        super(painter);
    }

    @Override
    protected Matrix parse(String path) {
        System.out.println("解析Jpeg格式文件");
        return new Matrix();
    }

    @Override
    protected void paint(Matrix matrix) {
        painter.paint(matrix);
    }
}
