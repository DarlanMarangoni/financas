package com.darlanmarangoni.financasapi.adapters.dtos;

import com.darlanmarangoni.financasapi.adapters.outbound.persistence.entities.Categoria;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExtratoRequest {
        private String transacao;
        private String descricao;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
        private LocalDateTime dataEHora;
        private BigDecimal valor;
        private Categoria categoria;
}
