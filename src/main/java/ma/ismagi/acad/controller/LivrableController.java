package ma.ismagi.acad.controller;

import lombok.RequiredArgsConstructor;
import ma.ismagi.acad.dto.livrable.CreateLivrableRequest;
import ma.ismagi.acad.dto.livrable.LivrableResponse;
import ma.ismagi.acad.service.LivrableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livrables")
@RequiredArgsConstructor
public class LivrableController {

    private final LivrableService livrableService;

    @PostMapping
    public ResponseEntity<LivrableResponse> upload(
            @RequestBody CreateLivrableRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(livrableService.upload(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivrableResponse> getById(@PathVariable Long id) {

        return ResponseEntity.ok(livrableService.getById(id));
    }

    @GetMapping("/project/{projetId}")
    public ResponseEntity<List<LivrableResponse>> getProjectLivrables(
            @PathVariable Long projetId) {

        return ResponseEntity.ok(livrableService.getProjectLivrables(projetId));
    }

    @PutMapping("/{id}/validate")
    public ResponseEntity<LivrableResponse> validate(
            @PathVariable Long id) {

        return ResponseEntity.ok(livrableService.validate(id));
    }

    @PutMapping("/{id}/reject")
    public ResponseEntity<LivrableResponse> reject(
            @PathVariable Long id,
            @RequestParam String remark) {

        return ResponseEntity.ok(livrableService.reject(id, remark));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        livrableService.delete(id);
        return ResponseEntity.noContent().build();
    }
}