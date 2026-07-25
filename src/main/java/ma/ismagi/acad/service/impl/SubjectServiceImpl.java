package ma.ismagi.acad.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.subject.SujetRequest;
import ma.ismagi.acad.dto.subject.SujetResponse;
import ma.ismagi.acad.entity.Sujet;
import ma.ismagi.acad.mapper.SujetMapper;
import ma.ismagi.acad.repository.SubjectJpaRepository;
import ma.ismagi.acad.service.SubjetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjetService {

    private final SubjectJpaRepository subjectJpaRepository;
    private final SujetMapper sujetMapper;

    @Override
    public List<SujetResponse> getSubjectsByStudent(Long studentId) {
        return List.of();
    }


    public List<SujetResponse> getSubjects() {
        List<Sujet> subjects = subjectJpaRepository.findAll();
        return sujetMapper.toResponseList(subjects);
    }

    @Override
    public Sujet getSubjetById(Long id) {
        return null;
    }

    @Override
    public SujetResponse create(SujetRequest request) {

        Sujet sujet = sujetMapper.toEntity(request);
        return sujetMapper.toResponse(subjectJpaRepository.save(sujet));
    }

    @Override
    public SujetResponse affectSubject(Long sujetId, Long studentId) {
        return null;
    }
}
