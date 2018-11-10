public abstract class Tool {

    protected PaintAPI paintAPI;

    protected Tool(PaintAPI paintAPI){
        this.paintAPI = paintAPI;
    }

    public abstract void create();

}
