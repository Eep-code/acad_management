package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.livrable.CreateLivrableRequest;
import ma.ismagi.acad.dto.livrable.LivrableResponse;

import java.util.List;

public interface LivrableService {

    LivrableResponse upload(CreateLivrableRequest request);

    LivrableResponse getById(Long id);

    List<LivrableResponse> getProjectLivrables(Long projetId);

    LivrableResponse validate(Long id);

    LivrableResponse reject(Long id, String remark);

    void delete(Long id);
}
