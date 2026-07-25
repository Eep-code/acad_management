package ma.ismagi.acad.mapper;

import ma.ismagi.acad.dto.subject.SujetRequest;
import ma.ismagi.acad.dto.subject.SujetResponse;
import ma.ismagi.acad.entity.Sujet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SujetMapper {

    SujetResponse toResponse(Sujet sujet);
    Sujet toEntity(SujetRequest sujet);
    List<SujetResponse> toResponseList(List<Sujet> sujets);
}