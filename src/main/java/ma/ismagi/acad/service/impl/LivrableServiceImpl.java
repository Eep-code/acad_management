package ma.ismagi.acad.service.impl;

import ma.ismagi.acad.dto.livrable.CreateLivrableRequest;
import ma.ismagi.acad.dto.livrable.LivrableResponse;
import ma.ismagi.acad.service.LivrableService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrableServiceImpl implements LivrableService {

    @Override
    public LivrableResponse upload(CreateLivrableRequest request) {
        return null;
    }

    @Override
    public LivrableResponse getById(Long id) {
        return null;
    }

    @Override
    public List<LivrableResponse> getProjectLivrables(Long projetId) {
        return List.of();
    }

    @Override
    public LivrableResponse validate(Long id) {
        return null;
    }

    @Override
    public LivrableResponse reject(Long id, String remark) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
