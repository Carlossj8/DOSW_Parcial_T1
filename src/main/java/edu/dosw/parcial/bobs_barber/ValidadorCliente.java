package edu.dosw.parcial.bobs_barber;

public class ValidadorCliente extends ValidadorBase {
    public ResultadoValidacion chequear(TurnoData t) {
        if (t.telefono == null || t.telefono.length() != 10) {
            System.out.println("[RECHAZADO] Telefono invalido");
            System.out.println("Error: teléfono debe tener 10 dígitos");
            return new ResultadoValidacion(false, "Telefono invalido");
        }
        
        System.out.println("[OK] Datos del cliente válidos");
        return chequearSiguiente(t);
    }
}
