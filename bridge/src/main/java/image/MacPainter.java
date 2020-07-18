package image;

public class MacPainter implements Painter {
    @Override
    public void paint(Matrix matrix) {
        System.out.println("Mac环境显示图像");
    }
}
