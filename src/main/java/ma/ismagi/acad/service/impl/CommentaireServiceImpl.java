package ma.ismagi.acad.service.impl;

import ma.ismagi.acad.dto.commentaire.CommentaireResponse;
import ma.ismagi.acad.dto.commentaire.CreateCommentaireRequest;
import ma.ismagi.acad.dto.commentaire.UpdateCommentaireRequest;
import ma.ismagi.acad.service.CommentaireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService {

    @Override
    public CommentaireResponse create(CreateCommentaireRequest request) {
        return null;
    }

    @Override
    public CommentaireResponse update(Long id, UpdateCommentaireRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<CommentaireResponse> getProjectComments(Long projetId) {
        return List.of();
    }
}
