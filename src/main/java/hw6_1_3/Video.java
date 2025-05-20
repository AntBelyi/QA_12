package hw6_1_3;

public class Video  extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }
    public  String getResolution(){
        return resolution;
    }

    @Override
    public void play() {
        System.out.println("Video is playing" + ":" + getTitle() + "in resolution" + "," + getResolution() + "," + getDuration() + "m");
    }
}