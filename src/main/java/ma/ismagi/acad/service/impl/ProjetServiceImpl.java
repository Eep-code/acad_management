package ma.ismagi.acad.service.impl;

import ma.ismagi.acad.dto.project.CreateProjetRequest;
import ma.ismagi.acad.dto.project.ProjetResponse;
import ma.ismagi.acad.dto.project.UpdateProjectRequest;
import ma.ismagi.acad.enums.EtatProjet;
import ma.ismagi.acad.service.ProjetService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProjetServiceImpl implements ProjetService {

    private final List<ProjetResponse> projets = new ArrayList<>();

    public ProjetServiceImpl() {

        ProjetResponse p1 = new ProjetResponse();
        p1.setId(1L);
        p1.setTitre("Plateforme de gestion des PFA");
        p1.setDescription("Développement d'une plateforme académique.");
        p1.setEtat("EN_COURS");

        ProjetResponse p2 = new ProjetResponse();
        p2.setId(2L);
        p2.setTitre("Application e-learning");
        p2.setDescription("Gestion des cours en ligne.");
        p2.setEtat("VALIDE");

        projets.add(p1);
        projets.add(p2);
    }

    @Override
    public List<ProjetResponse> getAll() {
        return projets;
    }

    @Override
    public ProjetResponse getById(Long id) {
        return projets.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public ProjetResponse create(CreateProjetRequest request) {

        ProjetResponse projet = new ProjetResponse();

        projet.setId((long) (projets.size() + 1));
        projet.setTitre(request.getTitre());
        projet.setDescription(request.getDescription());
        projet.setEtat("PROPOSE");

        projets.add(projet);

        return projet;
    }

    @Override
    public ProjetResponse update(Long id, UpdateProjectRequest request) {

        ProjetResponse projet = getById(id);

        if (projet == null) {
            return null;
        }

        projet.setTitre(request.getTitre());
        projet.setDescription(request.getDescription());

        return projet;
    }

    @Override
    public ProjetResponse updateStat(Long id, EtatProjet etat) {
        return null;
    }

    @Override
    public void delete(Long id) {
        projets.removeIf(p -> p.getId().equals(id));
    }
}