package com.findall.findallapp.models;

public class Servico {
    private Long id;
    private Long idPrestador;
    private String nome;
    private String valor;
    private String prazo;
    private String descricao;
    private String galeriaFotos;
    private String diaSemana;
    private String horario;

    public Long getId() {
        return id;
    }

    public Long getIdPrestador() {
        return idPrestador;
    }

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    public String getPrazo() {
        return prazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getGaleriaFotos() {
        return galeriaFotos;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdPrestador(Long idPrestador) {
        this.idPrestador = idPrestador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGaleriaFotos(String galeriaFotos) {
        this.galeriaFotos = galeriaFotos;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
