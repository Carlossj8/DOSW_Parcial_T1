package edu.dosw.parcial.bobs_barber;

public class PsePago implements AdaptadorPago {
    public RespuestaPago pagar(TurnoData turno) {
        String cuenta = turno.cuentaNumero;
        String banco = turno.banco;
        
        if (banco != null && banco.equals("BANCOLOMBIA")) {
            return new RespuestaPago("PSE-1003", "PENDING", "Transaccion pendiente PSE");
        }
        
        if (cuenta != null) {
            if (cuenta.startsWith("1") || cuenta.startsWith("2") || cuenta.startsWith("3")) {
                return new RespuestaPago("PSE-OK", "APROBADO", "Pago exitoso PSE");
            } else if (cuenta.startsWith("4")) {
                return new RespuestaPago("PSE-1002", "RECHAZADO", "Cuenta no valida en PSE");
            }
        }
        
        return new RespuestaPago("PSE-ERROR", "RECHAZADO", "Error desconocido PSE");
    }
}
