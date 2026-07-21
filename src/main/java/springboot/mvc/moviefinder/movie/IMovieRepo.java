package springboot.mvc.moviefinder.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepo extends JpaRepository<Movies, Integer> {
    // This interface automatically gives you methods like save(), findAll(), and findById()
}