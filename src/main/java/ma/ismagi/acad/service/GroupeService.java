package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.groupe.CreateGroupeRequest;
import ma.ismagi.acad.dto.groupe.GroupeResponse;
import ma.ismagi.acad.dto.groupe.UpdateGroupeRequest;

import java.util.List;

public interface GroupeService {

    GroupeResponse create(CreateGroupeRequest request);

    GroupeResponse update(UpdateGroupeRequest request);

    void delete(Long id);

    GroupeResponse getById(Long id);

    List<GroupeResponse> getAll();

    void addStudent(Long groupeId, Long etudiantId);

    void removeStudent(Long groupeId, Long etudiantId);
}
