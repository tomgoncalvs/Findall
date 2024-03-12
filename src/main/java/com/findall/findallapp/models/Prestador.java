package com.findall.findallapp.models;

public class Prestador {
    private Long id;
    private String nomeCompleto;
    private String cnpj;
    private String telefone;
    private String descricaoServico;
    private String categorias;
    private String custoMedioPorHora;
    private String diaSemana;
    private String horarioInicial;
    private String horarioFinal;

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public String getCategorias() {
        return categorias;
    }

    public String getCustoMedioPorHora() {
        return custoMedioPorHora;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHorarioInicial() {
        return horarioInicial;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public void setCustoMedioPorHora(String custoMedioPorHora) {
        this.custoMedioPorHora = custoMedioPorHora;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setHorarioInicial(String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
}
