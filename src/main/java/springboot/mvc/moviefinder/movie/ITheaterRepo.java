package springboot.mvc.moviefinder.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheaterRepo extends JpaRepository<Theater, Integer> { }