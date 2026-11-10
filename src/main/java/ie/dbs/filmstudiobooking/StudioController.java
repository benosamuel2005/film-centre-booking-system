
package ie.dbs.filmstudiobooking;

import ie.dbs.filmstudiobooking.model.Studio;
import ie.dbs.filmstudiobooking.service.StudioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudioController {

    private final StudioService studioService;

    public StudioController(StudioService studioService) {
        this.studioService = studioService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Film Studio Booking System";
    }

    @GetMapping("/studios")
    public List<Studio> getAllStudios() {
        return studioService.getAllStudios();
    }

    @PostMapping("/studios")
    public Studio addStudio(@RequestBody Studio studio) {
        return studioService.saveStudio(studio);
    }
}
