public class RedSaw implements PaintAPI {

    @Override
    public void createTool(int width, int height) {
        System.out.println("Created a red Saw that is: " + width + "cm in width and " + height + "cm in height");
    }
}
