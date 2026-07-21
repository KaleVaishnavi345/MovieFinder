package springboot.mvc.moviefinder.movie;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_show")
public class MovieShow {

    @Id
    @Column(name = "show_id")
    private int showId;

    private String name;

    @Column(name = "show_date")
    private LocalDate showDate;

    @Column(name = "show_time")
    private LocalTime showTime;

    // Relationship: Many shows belong to one Movie
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movie;

    // Relationship: Many shows happen at one Theater
    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    public MovieShow() {}

    // Getters and Setters
    public int getShowId() { return showId; }
    public void setShowId(int showId) { this.showId = showId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getShowDate() { return showDate; }
    public void setShowDate(LocalDate showDate) { this.showDate = showDate; }

    public LocalTime getShowTime() { return showTime; }
    public void setShowTime(LocalTime showTime) { this.showTime = showTime; }

    public Movies getMovie() { return movie; }
    public void setMovie(Movies movie) { this.movie = movie; }

    public Theater getTheater() { return theater; }
    public void setTheater(Theater theater) { this.theater = theater; }
}