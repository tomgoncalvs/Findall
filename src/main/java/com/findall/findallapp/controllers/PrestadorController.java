package com.findall.findallapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.findall.findallapp.models.Prestador;
import com.findall.findallapp.models.Servico;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {
    Logger log = LoggerFactory.getLogger(getClass());
    List<Prestador> prestadores = new ArrayList<>();
    List<Servico> servicos = new ArrayList<>();

    @PostMapping("/cadastro")
    public ResponseEntity<Prestador> cadastrarPrestador(@RequestBody Prestador prestador) {
        prestadores.add(prestador);
        return ResponseEntity.ok(prestador);
    }

    @PostMapping("/{prestadorId}/servicos")
    public ResponseEntity<Servico> cadastrarServico(@PathVariable Long prestadorId, @RequestBody Servico servico) {
        servicos.add(servico);
        return ResponseEntity.ok(servico);
    }

    @GetMapping("/servicos")
    public ResponseEntity<List<Servico>> buscarServicos(@RequestParam(required = false) String termoBusca,
                                                        @RequestParam(required = false) String diaSemana,
                                                        @RequestParam(required = false) String horario) {
        List<Servico> servicosEncontrados = servicos.stream()
                .filter(s -> s.getNome().contains(termoBusca))
                .filter(s -> s.getDiaSemana().equals(diaSemana))
                .filter(s -> s.getHorario().equals(horario))
                .collect(Collectors.toList());
        return ResponseEntity.ok(servicosEncontrados);
    }

    @GetMapping("/{prestadorId}")
    public ResponseEntity<Prestador> buscarPerfilPrestador(@PathVariable Long prestadorId) {
        Prestador prestadorEncontrado = prestadores.stream()
                .filter(p -> p.getId().equals(prestadorId))
                .findFirst()
                .orElse(null);

        if (prestadorEncontrado != null) {
            return ResponseEntity.ok(prestadorEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
