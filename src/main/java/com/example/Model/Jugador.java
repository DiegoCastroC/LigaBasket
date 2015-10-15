package com.example.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jhipster on 8/10/15.
 */

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private Date fechadenacimiento;
    private int canastast;
    private int asistenciast;
    private int rebotest;
    private String posicion;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getAsistenciast() {
        return asistenciast;
    }

    public int getCanastast() {
        return canastast;
    }

    public int getRebotest() {
        return rebotest;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setCanastast(int canastast) {
        this.canastast = canastast;
    }

    public void setAsistenciast(int asistenciast) {
        this.asistenciast = asistenciast;
    }

    public void setRebotest(int rebotest) {
        this.rebotest = rebotest;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre +
                ", fecha de nacimiento=" + fechadenacimiento +
                ", canastas totales=" + canastast +
                ", asistencias totales=" + asistenciast +
                ", rebotes totales=" + rebotest +
                ", posicion=" + posicion +
                '}';
    }
}
