package springboot.mvc.moviefinder.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

    @Autowired
    private IMovieShowRepo movieShowRepo;

    // 1. Display the Home Page
    @GetMapping("/")
    public String index(Model model) {
        // Fetch all shows to display on the main page initially
        List<MovieShow> allShows = movieShowRepo.findAll();
        model.addAttribute("shows", allShows);
        return "index"; // This looks for index.html in templates folder
    }

    // 2. Handle the Search Request
    @GetMapping("/search")
    public String searchMovies(@RequestParam("movieName") String movieName, Model model) {
        // Search for shows by the name entered in the search bar
        List<MovieShow> foundShows = movieShowRepo.findByMovie_NameContainingIgnoreCase(movieName);
        
        model.addAttribute("shows", foundShows);
        model.addAttribute("searchQuery", movieName);
        
        return "index"; // Returns results back to the same page
    }
}