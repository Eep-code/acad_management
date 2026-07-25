package ma.ismagi.acad.mapper;


import ma.ismagi.acad.dto.project.ProjetResponse;
import ma.ismagi.acad.entity.Projet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjetResponse toResponse(Projet projet);

    List<ProjetResponse> toResponseList(List<Projet> projets);
}
