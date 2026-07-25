package ma.ismagi.acad.service;

import ma.ismagi.acad.dto.commentaire.CommentaireResponse;
import ma.ismagi.acad.dto.commentaire.CreateCommentaireRequest;
import ma.ismagi.acad.dto.commentaire.UpdateCommentaireRequest;

import java.util.List;

public interface CommentaireService {

    CommentaireResponse create(CreateCommentaireRequest request);

    CommentaireResponse update(Long id, UpdateCommentaireRequest request);

    void delete(Long id);

    List<CommentaireResponse> getProjectComments(Long projetId);
}

