package springboot.mvc.moviefinder.movie;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieShowRepo extends JpaRepository<MovieShow, Integer> {
    
    // This looks inside the 'movie' object and finds its 'name' field
    List<MovieShow> findByMovie_NameContainingIgnoreCase(String movieName);
}