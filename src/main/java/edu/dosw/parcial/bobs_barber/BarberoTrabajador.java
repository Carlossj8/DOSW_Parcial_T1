package edu.dosw.parcial.bobs_barber;

import java.util.ArrayList;

public class BarberoTrabajador {
    public String nombre;
    public ArrayList<String> especialidades;
    public String dias;
    public int horaInicio;
    public int horaFin;

    public BarberoTrabajador(String nombre, ArrayList<String> especialidades, String dias, int horaInicio, int horaFin) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
}
