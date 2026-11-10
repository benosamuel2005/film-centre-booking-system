package ie.dbs.filmstudiobooking.service;

import ie.dbs.filmstudiobooking.model.Studio;
import ie.dbs.filmstudiobooking.repository.StudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioService {

    private final StudioRepository studioRepository;

    public StudioService(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }

    public List<Studio> getAllStudios() {
        return studioRepository.findAll();
    }

    public Studio saveStudio(Studio studio) {
        return studioRepository.save(studio);
    }
}