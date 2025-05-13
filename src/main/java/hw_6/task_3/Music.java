package hw_6.task_3;

public class Music extends Media {
    private String artist;

    public Music(int duration, String title, String artist) {
        super(duration, title);
        this.artist = artist;
    }

    @Override
    protected void play() {
        System.out.println("Music started " + artist + " " + getTitle() + "!!");
    }
}
