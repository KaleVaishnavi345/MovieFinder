package springboot.mvc.moviefinder.movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies") // Matches your lowercase table in Workbench
public class Movies {

    @Id
    @Column(name = "movie_id")
    private int movieId;

    private String name;
    private String language;
    private String duration;

    @Column(name = "released_year")
    private int releasedYear;

    // Default Constructor
    public Movies() {}

    // Getters and Setters
    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public int getReleasedYear() { return releasedYear; }
    public void setReleasedYear(int releasedYear) { this.releasedYear = releasedYear; }
}