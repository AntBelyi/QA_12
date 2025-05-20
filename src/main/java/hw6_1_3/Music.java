package hw6_1_3;

public class Music extends Media {
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }

    @Override
    public void play() {
        System.out.println("Music is playing"+ " " + getArtist()+ ":" + getTitle() + "," + getDuration());
    }
}