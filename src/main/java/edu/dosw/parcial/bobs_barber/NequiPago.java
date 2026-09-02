package edu.dosw.parcial.bobs_barber;

public class NequiPago implements AdaptadorPago {
    public RespuestaPago pagar(TurnoData turno) {
        boolean exitoso = false;
        if (turno.telefono != null && turno.telefono.endsWith("88")) {
            exitoso = true;
        }
        
        if (exitoso) {
            return new RespuestaPago("NQ-1001", "APROBADO", "Pago exitoso con Nequi");
        } else {
            return new RespuestaPago("NQ-ERROR", "RECHAZADO", "Error en Nequi");
        }
    }
}
