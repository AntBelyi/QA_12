package hw_6.task_3;

public class Application {
    public static void main(String[] args) {
        Media media = new Media();
        Music music = new Music(45, "You", "Adel");
        Video video = new Video(1250 * 1542, "Hello", "HD");
        media.play();
        music.play();
        video.play();
    }
}
