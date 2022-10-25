package se.stadafint.nicecleaning_backend.controller;

import org.springframework.web.bind.annotation.*;
import se.stadafint.nicecleaning_backend.dto.CleanResponseDTO;
import se.stadafint.nicecleaning_backend.dto.CreateCleanDTO;
import se.stadafint.nicecleaning_backend.entities.Clean;
import se.stadafint.nicecleaning_backend.services.CleanService;

import java.util.List;

@RestController
@RequestMapping("/api/clean")
@CrossOrigin(origins = {"http://localhost:3000"}, methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
public class CleanController {

    private final CleanService cleanService;

    public CleanController(CleanService cleanService){
        this.cleanService = cleanService;
    }

    @PostMapping
    public CreateCleanDTO addClean(@RequestBody() CreateCleanDTO createCleanDTO){
        return cleanService
                .addClean(
                        createCleanDTO.date(),
                        createCleanDTO.time(),
                        createCleanDTO.optionalMessage(),
                        createCleanDTO.getId()
                )
                .toResponseDTO();
    }

@GetMapping
    public List<CleanResponseDTO> findAll(
            @RequestParam(required = false, defaultValue = "", name = "tcon") String contains
    ){
        return cleanService.findAll(contains)
                .stream()
                .map(Clean::toResponseDTO)
                .toList();
    }


    public Clean cleanDuplicateCheck(String date, int id){
        return cleanService.cleanDuplicateCheck(date, id);
    }
}