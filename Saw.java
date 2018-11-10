public class Saw extends Tool {

    protected int width, height;

    public Saw(PaintAPI paintAPI, int width, int height) {
        super(paintAPI);
        this.width = width;
        this.height = height;
    }

    @Override
    public void create() {
        paintAPI.createTool(width, height);
    }
}
