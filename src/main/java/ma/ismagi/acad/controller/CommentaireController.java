package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.commentaire.CommentaireResponse;
import ma.ismagi.acad.dto.commentaire.CreateCommentaireRequest;
import ma.ismagi.acad.dto.commentaire.UpdateCommentaireRequest;
import ma.ismagi.acad.service.CommentaireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/commentaires")
@RequiredArgsConstructor
public class CommentaireController {

    private final CommentaireService commentaireService;

    @PostMapping
    public ResponseEntity<CommentaireResponse> create(
            @RequestBody CreateCommentaireRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(commentaireService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommentaireResponse> update(
            @PathVariable Long id,
            @RequestBody UpdateCommentaireRequest request) {

        return ResponseEntity.ok(commentaireService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        commentaireService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/project/{projetId}")
    public ResponseEntity<List<CommentaireResponse>> getProjectComments(
            @PathVariable Long projetId) {

        return ResponseEntity.ok(commentaireService.getProjectComments(projetId));
    }
}
