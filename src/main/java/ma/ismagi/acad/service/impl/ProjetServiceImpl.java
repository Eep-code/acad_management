package ma.ismagi.acad.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.project.CreateProjetRequest;
import ma.ismagi.acad.dto.project.ProjetResponse;
import ma.ismagi.acad.dto.project.UpdateProjectRequest;
import ma.ismagi.acad.entity.Projet;
import ma.ismagi.acad.enums.EtatProjet;
import ma.ismagi.acad.mapper.ProjectMapper;
import ma.ismagi.acad.repository.ProjectRepository;
import ma.ismagi.acad.service.ProjetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetServiceImpl implements ProjetService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Override
    public List<ProjetResponse> getAll() {
        return projectMapper.toResponseList(projectRepository.findAll());
    }

    @Override
    public ProjetResponse getById(Long id) {

        Projet projet = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projet introuvable"));

        return projectMapper.toResponse(projet);
    }

    @Override
    public ProjetResponse create(CreateProjetRequest request) {

        Projet projet = projectMapper.toEntity(request);

        projet.setEtat(EtatProjet.PROPOSE.name());

        Projet savedProjet = projectRepository.save(projet);

        return projectMapper.toResponse(savedProjet);
    }

    @Override
    public ProjetResponse update(Long id, UpdateProjectRequest request) {

        Projet projet = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projet introuvable"));

        projet.setTitre(request.getTitre());
        projet.setDescription(request.getDescription());

        Projet updatedProjet = projectRepository.save(projet);

        return projectMapper.toResponse(updatedProjet);
    }

    @Override
    public ProjetResponse updateStat(Long id, EtatProjet etat) {

        Projet projet = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projet introuvable"));

        projet.setEtat(etat.name());

        Projet updatedProjet = projectRepository.save(projet);

        return projectMapper.toResponse(updatedProjet);
    }

    @Override
    public void delete(Long id) {

        if (!projectRepository.existsById(id)) {
            throw new RuntimeException("Projet introuvable");
        }

        projectRepository.deleteById(id);
    }
}