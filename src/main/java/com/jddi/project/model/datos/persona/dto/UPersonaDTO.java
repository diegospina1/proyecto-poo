package com.jddi.project.model.datos.persona.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public record UPersonaDTO(
        String nombre,
        String apellido,
        @Email
        String email,
        @Pattern(regexp = "^\\d{10}$")
        String telefono

) {
}
