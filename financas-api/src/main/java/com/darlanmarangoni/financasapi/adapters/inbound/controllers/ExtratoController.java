package com.darlanmarangoni.financasapi.adapters.inbound.controllers;

import com.darlanmarangoni.financasapi.adapters.dtos.ExtratoRequest;
import com.darlanmarangoni.financasapi.adapters.outbound.persistence.ExtratoRepository;
import com.darlanmarangoni.financasapi.adapters.outbound.persistence.entities.Extrato;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class ExtratoController {

    private final ExtratoRepository extratoRepository;
    private final ModelMapper modelMapper;

    public ExtratoController(ExtratoRepository extratoRepository, ModelMapper modelMapper) {
        this.extratoRepository = extratoRepository;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/nova-transacao")
    public ResponseEntity<Object> novaTransacao(@RequestBody ExtratoRequest request) {
        Extrato extrato = modelMapper.map(request, Extrato.class);
        Extrato saved = extratoRepository.save(extrato);
        return ResponseEntity.created(URI.create(saved.getId().toString()))
                .build();
    }
}
