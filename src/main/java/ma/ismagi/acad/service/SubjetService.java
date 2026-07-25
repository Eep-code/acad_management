package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.subject.SujetRequest;
import ma.ismagi.acad.dto.subject.SujetResponse;
import ma.ismagi.acad.entity.Sujet;


import java.util.List;

public interface SubjetService {

    List<SujetResponse> getSubjectsByStudent(Long studentId);
    List<SujetResponse> getSubjects();
    Sujet getSubjetById(Long id);
    SujetResponse create(SujetRequest sujet);
    SujetResponse affectSubject(Long sujetId, Long studentId);

}
