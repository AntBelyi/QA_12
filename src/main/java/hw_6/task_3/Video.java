package hw_6.task_3;

public class Video extends Media {
    private String resolution;

    public Video(int duration, String title, String resolution) {
        super(duration, title);
        this.resolution = resolution;
    }

    @Override
    protected void play() {
        System.out.println("Displaying video " + getTitle() + " with resolution " + resolution);
    }
}
