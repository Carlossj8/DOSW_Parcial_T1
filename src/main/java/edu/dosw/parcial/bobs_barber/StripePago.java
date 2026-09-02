package edu.dosw.parcial.bobs_barber;

public class StripePago implements AdaptadorPago {
    public RespuestaPago pagar(TurnoData turno) {
        // En un caso real se pasarian los datos de tarjeta, aca se simula
        boolean pagado = false;
        String cvvSimulado = "555"; 
        
        if (cvvSimulado.equals("555")) {
            pagado = true;
        }
        
        if (pagado) {
            return new RespuestaPago("STR-1001", "APROBADO", "Pago con Stripe exitoso");
        } else {
            return new RespuestaPago("STR-ERROR", "RECHAZADO", "Pago rechazado en Stripe");
        }
    }
}
