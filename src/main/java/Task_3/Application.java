package Task_3;

public class Application {
    public static void main(String[] args) {
        Media music = new Music("SweetLove", 3, "Monatik");
        Media video = new Video("In the Lost Land", 140, "1920x1080");

        music.play();
        video.play();
    }
}