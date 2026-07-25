package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.project.CreateProjetRequest;
import ma.ismagi.acad.dto.project.ProjetResponse;
import ma.ismagi.acad.dto.project.UpdateProjectRequest;
import ma.ismagi.acad.enums.EtatProjet;

import java.util.List;

public interface ProjetService {

    List<ProjetResponse> getAll();

    ProjetResponse getById(Long id);

    ProjetResponse create(CreateProjetRequest request);

    ProjetResponse update(Long id,
                          UpdateProjectRequest request);

    ProjetResponse updateStat(Long id, EtatProjet etat);

    void delete(Long id);

}
