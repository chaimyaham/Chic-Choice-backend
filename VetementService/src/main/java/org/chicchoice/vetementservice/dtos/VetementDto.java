package org.chicchoice.vetementservice.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.chicchoice.vetementservice.enums.Category;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link org.chicchoice.vetementservice.entities.Vetement}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class VetementDto implements Serializable {
    @Positive
    Long id;
    String note;
    LocalDateTime date_d_ajout = LocalDateTime.now();
    @NotNull
    Category category;
    String marque;
    @NotNull
    Long mediaId;
    @NotNull
    Long userId;
    @NotNull
    Boolean favoris;
    List<VetementDto.EnsembleDto> ensembles;

    @Data
    public static class EnsembleDto{
        @Positive
        Long id;
        LocalDateTime createdAt;
        @NotNull
        String nomDeLEnsemble;
        Long utilisateurId;
        Boolean favoris;

    }
}