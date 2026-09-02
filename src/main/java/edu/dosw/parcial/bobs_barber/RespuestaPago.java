package edu.dosw.parcial.bobs_barber;

public class RespuestaPago {
    public String idPago;
    public String estado;
    public String mensaje;

    public RespuestaPago(String idPago, String estado, String mensaje) {
        this.idPago = idPago;
        this.estado = estado;
        this.mensaje = mensaje;
    }
}
