package edu.dosw.parcial.bobs_barber;

public class ServicioItem {
    public String codigo;
    public int precio;
    public String especialidadReq;

    public ServicioItem(String codigo, int precio, String especialidadReq) {
        this.codigo = codigo;
        this.precio = precio;
        this.especialidadReq = especialidadReq;
    }
}
