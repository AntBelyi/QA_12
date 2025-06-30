// Base class Media
class Media {
    protected String title;
    protected int duration; // duration in minutes

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing multimedia");
    }
}

// Subclass Music
class Music extends Media {
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing music by " + artist + ": " + title + " (Duration: " + duration + " min)");
    }
}

// Subclass Video
class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + title + " in resolution " + resolution + " (Duration: " + duration + " min)");
    }
}

// Main class for demonstration
public class MediaDemo {
    public static void main(String[] args) {
        // Create objects
        Media genericMedia = new Media("Generic File", 10);
        Music song = new Music("Bohemian Rhapsody", 6, "Queen");
        Video movie = new Video("Avatar", 162, "1920x1080");

        System.out.println("--- Media Demonstration ---");

        System.out.println("Generic Media File:");
        genericMedia.play();
        System.out.println();

        System.out.println("Music:");
        song.play();
        System.out.println();

        System.out.println("Video:");
        movie.play();
        System.out.println();

        // Demonstrate polymorphism
        System.out.println("--- Polymorphism Demonstration ---");
        Media[] mediaFiles = new Media[3];
        mediaFiles[0] = new Music("Stairway to Heaven", 8, "Led Zeppelin");
        mediaFiles[1] = new Video("The Matrix", 136, "1080p");
        mediaFiles[2] = new Media("Audiobook", 60);

        for (Media media : mediaFiles) {
            media.play(); // The appropriate play() method is called based on the object's actual type
        }
        System.out.println();
    }
}