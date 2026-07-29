package ma.ismagi.acad.mapper;


import ma.ismagi.acad.dto.livrable.CreateLivrableRequest;
import ma.ismagi.acad.dto.livrable.LivrableResponse;
import ma.ismagi.acad.entity.Livrable;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LivrableMapper {

    LivrableResponse toResponse(Livrable livrable);
    List<LivrableResponse> toResponseList(List<Livrable> livrables);
    Livrable toEntity(CreateLivrableRequest request);
}
