package com.jddi.project.model.consulta.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jddi.project.model.doctor.Especialidad;
import com.jddi.project.model.doctor.dto.crud.RDoctorDTO;
import com.jddi.project.model.paciente.dto.crud.RPacienteDTO;

import java.time.LocalDateTime;

public record DatosConsultaDTO(
        Long id,
        RPacienteDTO informacion_paciente,
        RDoctorDTO informacion_doctor,
        Especialidad especialidad,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime fecha_consulta,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime duracion,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime fecha_creacion,
        Boolean cancelada,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime ultima_modificacion
) {
}
