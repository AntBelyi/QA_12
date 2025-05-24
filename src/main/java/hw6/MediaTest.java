class Media {
    String title;
    int duration;

    Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    void play() {
        System.out.println("Playing media");
    }
}

class Music extends Media {
    String artist;

    Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    void play() {
        System.out.println("Playing music by " + artist + ": " + title);
    }
}

class Video extends Media {
    String resolution;

    Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    void play() {
        System.out.println("Playing video " + title + " in resolution " + resolution);
    }
}

public class MediaTest {
    public static void main(String[] args) {
        Media music = new Music("Imagine", 3, "John Lennon");
        Media video = new Video("Inception", 148, "1920x1080");

        music.play();  // polymorphism
        video.play();  // polymorphism
    }
}
