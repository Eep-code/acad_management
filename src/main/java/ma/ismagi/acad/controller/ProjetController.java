package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.project.CreateProjetRequest;
import ma.ismagi.acad.dto.project.ProjetResponse;
import ma.ismagi.acad.dto.project.UpdateProjectRequest;
import ma.ismagi.acad.service.ProjetService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/projets")
@RequiredArgsConstructor
public class ProjetController {

    private final ProjetService projetService;

    @GetMapping
    public List<ProjetResponse> getAll() {
        return projetService.getAll();
    }

    @GetMapping("/{id}")
    public ProjetResponse getById(Long id) {
        return null;
    }

    @PostMapping
    public ProjetResponse create(CreateProjetRequest request) {
        return null;
    }

    @PutMapping("/{id}")
    public ProjetResponse update(Long id, UpdateProjectRequest request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {

    }

}
