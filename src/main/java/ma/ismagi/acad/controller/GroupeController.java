package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.groupe.CreateGroupeRequest;
import ma.ismagi.acad.dto.groupe.GroupeResponse;
import ma.ismagi.acad.dto.groupe.UpdateGroupeRequest;
import ma.ismagi.acad.service.GroupeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groupes")
@RequiredArgsConstructor
public class GroupeController {

    private final GroupeService groupeService;

    @GetMapping
    public List<GroupeResponse> getAll() {
        return groupeService.getAll();
    }

    @GetMapping("/{id}")
    public GroupeResponse getByGroupeId(Long id) {
        return groupeService.getById(id);
    }

    @PostMapping
    public GroupeResponse create(@RequestBody CreateGroupeRequest request) {
        return groupeService.create(request);
    }

    @DeleteMapping("/{id}")
    public void deleteByGroupeId(@RequestParam Long groupeId) {
        groupeService.delete(groupeId);
    }

    @PutMapping
    public GroupeResponse update(@RequestBody UpdateGroupeRequest request) {
        return groupeService.update(request);
    }

    @PostMapping("add-student")
    public  void addStudent(
            @RequestParam Long groupeId,
            @RequestParam Long etudiantId
    )  {
        groupeService.addStudent(groupeId, etudiantId);
    }
    @PostMapping("/remove-student")
    public  void removeStudent(
            @RequestParam Long groupeId,
            @RequestParam Long etudiantId
    )  {
        groupeService.removeStudent(groupeId, etudiantId);
    }




}
