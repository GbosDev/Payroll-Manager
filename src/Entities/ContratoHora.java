package Entities;

import java.util.Date;

public class ContratoHora {

    private Date date;
    private Double valorPorHora;
    private Integer horas;

    public ContratoHora() {

    }

    public ContratoHora(Date date, Double valorPorHora, Integer horas) {
        this.date = date;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal() {
        return valorPorHora * horas;

    }
}
