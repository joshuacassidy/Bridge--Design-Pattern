public class Main {

    public static void main(String[] args) {

        Tool redSaw = new Saw(new RedSaw(), 100, 100);
        Tool blueSaw = new Saw(new BlueSaw(), 100, 100);

        redSaw.create();
        blueSaw.create();

    }


}
