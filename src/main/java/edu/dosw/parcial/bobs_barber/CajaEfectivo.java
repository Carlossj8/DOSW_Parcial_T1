package edu.dosw.parcial.bobs_barber;

public class CajaEfectivo implements AdaptadorPago {
    public RespuestaPago pagar(TurnoData turno) {
        if (turno.monto >= 10000) {
            return new RespuestaPago("CAJA-001", "APROBADO", "Efectivo recibido en caja");
        } else {
            return new RespuestaPago("CAJA-002", "RECHAZADO", "Monto insuficiente");
        }
    }
}
