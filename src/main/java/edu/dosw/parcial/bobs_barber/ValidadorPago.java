package edu.dosw.parcial.bobs_barber;

public class ValidadorPago extends ValidadorBase {
    public ResultadoValidacion chequear(TurnoData t) {
        String metodo = t.metodoPago;
        AdaptadorPago adaptador = null;
        
        if (metodo != null) {
            if (metodo.equals("NEQUI")) {
                adaptador = new NequiPago();
                System.out.println("[OK] Pasarela NEQUI");
            } else if (metodo.equals("PSE")) {
                adaptador = new PsePago();
                if (t.banco != null && t.banco.equals("BANCOLOMBIA")) {
                    System.out.println("[OK] Pasarela PSE BANCOLOMBIA");
                } else {
                    System.out.println("[OK] Pasarela PSE");
                }
            } else if (metodo.equals("STRIPE")) {
                adaptador = new StripePago();
                System.out.println("[OK] Pasarela STRIPE");
            } else if (metodo.equals("EFECTIVO")) {
                adaptador = new CajaEfectivo();
                System.out.println("[OK] Pasarela EFECTIVO");
            }
        }
        
        if (adaptador != null) {
            RespuestaPago respuesta = adaptador.pagar(t);
            System.out.println("PAGO: " + respuesta.idPago + " - " + respuesta.estado);
            
            if (respuesta.estado.equals("APROBADO") || respuesta.estado.equals("PENDING")) {
                return chequearSiguiente(t);
            } else {
                return new ResultadoValidacion(false, respuesta.mensaje);
            }
        }
        
        System.out.println("[RECHAZADO] Pasarela no valida");
        return new ResultadoValidacion(false, "Pasarela no valida");
    }
}
