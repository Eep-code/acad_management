package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.subject.SujetRequest;
import ma.ismagi.acad.dto.subject.SujetResponse;
import ma.ismagi.acad.service.SubjetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjetService  subjetService;

    @GetMapping
    public List<SujetResponse> getSubjects() {
        return subjetService.getSubjects();
    }

    @GetMapping("/student/{id}")
    public List<SujetResponse> getSubjectsByStudent(Long id) {
        return subjetService.getSubjectsByStudent(id);
    }

    @PostMapping
    public SujetResponse createSubject(@RequestBody SujetRequest request) {
        return subjetService.create(request);
    }

    @PostMapping("/affect")
    public SujetResponse affectSubject(@RequestParam Long id, @RequestParam Long studentId) {
        return subjetService.affectSubject(id, studentId);
    }
}
