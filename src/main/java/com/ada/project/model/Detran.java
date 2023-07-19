package com.ada.project.model;

public class Detran {
    private String id;
    private String dataInversa;
    private String diaSemana;
    private String horario;
    private String uf;
    private String br;
    private String km;
    private String municipio;
    private String causaAcidente;
    private String tipoAcidente;
    private String classificacaoAcidente;
    private String faseDia;
    private String sentidoVia;
    private String condicaoMeteorologica;
    private String tipoPista;
    private String tracadoVia;
    private String usoSolo;
    private String ano;
    private String pessoas;
    private String mortos;
    private String feridosLeves;
    private String feridosGraves;
    private String ilesos;
    private String ignorados;
    private String feridos;
    private String veiculos;

    public String getDataInversa() {
        return dataInversa;
    }

    public void setDataInversa(String dataInversa) {
        this.dataInversa = dataInversa;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCausaAcidente() {
        return causaAcidente;
    }

    public void setCausaAcidente(String causaAcidente) {
        this.causaAcidente = causaAcidente;
    }

    public String getTipoAcidente() {
        return tipoAcidente;
    }

    public void setTipoAcidente(String tipoAcidente) {
        this.tipoAcidente = tipoAcidente;
    }

    public String getClassificacaoAcidente() {
        return classificacaoAcidente;
    }

    public void setClassificacaoAcidente(String classificacaoAcidente) {
        this.classificacaoAcidente = classificacaoAcidente;
    }

    public String getFaseDia() {
        return faseDia;
    }

    public void setFaseDia(String faseDia) {
        this.faseDia = faseDia;
    }

    public String getSentidoVia() {
        return sentidoVia;
    }

    public void setSentidoVia(String sentidoVia) {
        this.sentidoVia = sentidoVia;
    }

    public String getCondicaoMeteorologica() {
        return condicaoMeteorologica;
    }

    public void setCondicaoMeteorologica(String condicaoMeteorologica) {
        this.condicaoMeteorologica = condicaoMeteorologica;
    }

    public String getTipoPista() {
        return tipoPista;
    }

    public void setTipoPista(String tipoPista) {
        this.tipoPista = tipoPista;
    }

    public String getTracadoVia() {
        return tracadoVia;
    }

    public void setTracadoVia(String tracadoVia) {
        this.tracadoVia = tracadoVia;
    }

    public String getUsoSolo() {
        return usoSolo;
    }

    public void setUsoSolo(String usoSolo) {
        this.usoSolo = usoSolo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public String getMortos() {
        return mortos;
    }

    public void setMortos(String mortos) {
        this.mortos = mortos;
    }

    public String getFeridosLeves() {
        return feridosLeves;
    }

    public void setFeridosLeves(String feridosLeves) {
        this.feridosLeves = feridosLeves;
    }

    public String getFeridosGraves() {
        return feridosGraves;
    }

    public void setFeridosGraves(String feridosGraves) {
        this.feridosGraves = feridosGraves;
    }

    public String getIlesos() {
        return ilesos;
    }

    public void setIlesos(String ilesos) {
        this.ilesos = ilesos;
    }

    public String getIgnorados() {
        return ignorados;
    }

    public void setIgnorados(String ignorados) {
        this.ignorados = ignorados;
    }

    public String getFeridos() {
        return feridos;
    }

    public void setFeridos(String feridos) {
        this.feridos = feridos;
    }

    public String getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(String veiculos) {
        this.veiculos = veiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Detran detran = (Detran) o;

        return id != null ? id.equals(detran.id) : detran.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Detran{" +
                "id='" + id + '\'' +
                ", dataInversa='" + dataInversa + '\'' +
                ", diaSemana='" + diaSemana + '\'' +
                ", horario='" + horario + '\'' +
                ", uf='" + uf + '\'' +
                ", br='" + br + '\'' +
                ", km='" + km + '\'' +
                ", municipio='" + municipio + '\'' +
                ", causaAcidente='" + causaAcidente + '\'' +
                ", tipoAcidente='" + tipoAcidente + '\'' +
                ", classificacaoAcidente='" + classificacaoAcidente + '\'' +
                ", faseDia='" + faseDia + '\'' +
                ", sentidoVia='" + sentidoVia + '\'' +
                ", condicaoMeteorologica='" + condicaoMeteorologica + '\'' +
                ", tipoPista='" + tipoPista + '\'' +
                ", tracadoVia='" + tracadoVia + '\'' +
                ", usoSolo='" + usoSolo + '\'' +
                ", ano='" + ano + '\'' +
                ", pessoas='" + pessoas + '\'' +
                ", mortos='" + mortos + '\'' +
                ", feridosLeves='" + feridosLeves + '\'' +
                ", feridosGraves='" + feridosGraves + '\'' +
                ", ilesos='" + ilesos + '\'' +
                ", ignorados='" + ignorados + '\'' +
                ", feridos='" + feridos + '\'' +
                ", veiculos='" + veiculos + '\'' +
                '}';
    }
}