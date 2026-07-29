package ma.ismagi.acad.mapper;

import ma.ismagi.acad.dto.commentaire.CommentaireResponse;
import ma.ismagi.acad.dto.commentaire.CreateCommentaireRequest;
import ma.ismagi.acad.entity.Commentaire;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentaireMapper {

    CommentaireResponse toResponse(Commentaire commentaire);
    List<CommentaireResponse> toResponseList(List<Commentaire> commentaires);
    Commentaire toEntity(CreateCommentaireRequest request);
}
