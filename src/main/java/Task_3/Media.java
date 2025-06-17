package Task_3;

public class Media {
    private String title;
    private int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }

    public void play() {
        System.out.println("Media playback");
    }
}