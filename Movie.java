public class Movie {
    
    private String title;

    private String description;

    private int durationInMinutes;

    public Movie(String title, String description, int length) {
        this.title = title;
        this.description = description;
        durationInMinutes = length;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
