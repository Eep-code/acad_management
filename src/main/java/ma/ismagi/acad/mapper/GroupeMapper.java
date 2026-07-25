package ma.ismagi.acad.mapper;


import ma.ismagi.acad.dto.groupe.GroupeResponse;
import ma.ismagi.acad.entity.Groupe;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GroupeMapper {

    GroupeResponse toResponse(Groupe groupe);

    List<GroupeResponse> toResponseList(List<Groupe> groupes);
}
