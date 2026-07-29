package ma.ismagi.acad.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.subject.SujetRequest;
import ma.ismagi.acad.dto.subject.SujetResponse;
import ma.ismagi.acad.entity.Etudiant;
import ma.ismagi.acad.entity.Sujet;
import ma.ismagi.acad.mapper.SujetMapper;
import ma.ismagi.acad.repository.*;
import ma.ismagi.acad.service.SubjetService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjetService {

    private final SubjectJpaRepository subjectJpaRepository;
    private final ProjectRepository projectRepository;
    private final EtudiantRepository etudiantRepository;
    private final EncadrantRepository encadrantRepository;
    private final SujetMapper sujetMapper;

    @Override
    public List<SujetResponse> getSubjectsByStudent(Long studentId) {

        List<Sujet> sujets = subjectJpaRepository.findByEtudiantId(studentId);

        return sujetMapper.toResponseList(sujets);
    }

    @Override
    public List<SujetResponse> getSubjects() {

        List<Sujet> sujets = subjectJpaRepository.findAll();

        return sujetMapper.toResponseList(sujets);
    }

    @Override
    public Sujet getSubjetById(Long id) {

        return subjectJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sujet introuvable"));
    }

    @Override
    public SujetResponse create(SujetRequest request) {

        Sujet sujet = new Sujet();

        sujet.setTitre(request.getTitre());
        sujet.setDescription(request.getDescription());

        sujet.setDateCreation(LocalDateTime.now());
        sujet.setStatut("PROPOSE");

        if (request.getProjetId() != null) {
            sujet.setProjet(
                    projectRepository.findById(request.getProjetId())
                            .orElseThrow(() -> new RuntimeException("Projet introuvable")));
        }

        if (request.getEtudiantId() != null) {
            sujet.setEtudiant(
                    etudiantRepository.findById(request.getEtudiantId())
                            .orElseThrow(() -> new RuntimeException("Etudiant introuvable")));
        }

        if (request.getEncadrantId() != null) {
            sujet.setEncadrant(
                    encadrantRepository.findById(request.getEncadrantId())
                            .orElseThrow(() -> new RuntimeException("Encadrant introuvable")));
        }

        return sujetMapper.toResponse(subjectJpaRepository.save(sujet));
    }

    @Override
    public SujetResponse affectSubject(Long sujetId, Long studentId) {

        Sujet sujet = subjectJpaRepository.findById(sujetId)
                .orElseThrow(() -> new RuntimeException("Sujet introuvable"));

        Etudiant etudiant = etudiantRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Etudiant introuvable"));

        sujet.setEtudiant(etudiant);

        Sujet saved = subjectJpaRepository.save(sujet);

        return sujetMapper.toResponse(saved);
    }
}