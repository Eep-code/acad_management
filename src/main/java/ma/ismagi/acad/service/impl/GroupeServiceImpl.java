package ma.ismagi.acad.service.impl;

import ma.ismagi.acad.dto.groupe.CreateGroupeRequest;
import ma.ismagi.acad.dto.groupe.GroupeResponse;
import ma.ismagi.acad.dto.groupe.UpdateGroupeRequest;
import ma.ismagi.acad.service.GroupeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImpl implements GroupeService {

    @Override
    public GroupeResponse create(CreateGroupeRequest request) {
        return null;
    }

    @Override
    public GroupeResponse update(UpdateGroupeRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public GroupeResponse getById(Long id) {
        return null;
    }

    @Override
    public List<GroupeResponse> getAll() {
        return List.of();
    }

    @Override
    public void addStudent(Long groupeId, Long etudiantId) {

    }

    @Override
    public void removeStudent(Long groupeId, Long etudiantId) {

    }
}
