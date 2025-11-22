package com.uniruy.appuser;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Lob;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora; 
    
    @Lob
    private String observacoes;
    
    @ManyToOne 
    @JoinColumn(name = "paciente_id", nullable = false) 
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false) 
    private Registro medico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Registro getMedico() {
        return medico;
    }

    public void setMedico(Registro medico) {
        this.medico = medico;
    }

}
