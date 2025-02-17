package es.santander.ascender.ejerc004.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "color", nullable = false, unique = true)
    private String color;

    @Column (name = "peso", nullable = false)
    private double peso;

    @Column (name = "letras", nullable = false)
    private int Letras;

    @Column (name = "intel", nullable = false)
    private boolean intel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getLetras() {
        return Letras;
    }
    public void setLetras(int letras) {
        Letras = letras;
    }
    public boolean isIntel() {
        return intel;
    }
    public void setIntel(boolean intel) {
        this.intel = intel;
    }

}
