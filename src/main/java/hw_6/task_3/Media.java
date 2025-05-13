package hw_6.task_3;

public class Media {
    private String title;
    private int duration;

    public Media() {
    }

    public Media(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    protected void play() {
        System.out.println("Displaying multimedia");
    }
}
