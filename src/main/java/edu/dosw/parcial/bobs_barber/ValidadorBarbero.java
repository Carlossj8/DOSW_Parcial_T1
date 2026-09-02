package edu.dosw.parcial.bobs_barber;

public class ValidadorBarbero extends ValidadorBase {
    public ResultadoValidacion chequear(TurnoData t) {
        String barberoAsignado = "Miguel"; 
        
        if (t.clienteNombre != null && t.clienteNombre.equals("Ana Lopez")) {
            barberoAsignado = "Laura";
        } else if (t.clienteNombre != null && t.clienteNombre.equals("Julian Mesa")) {
            barberoAsignado = "Andres";
        }
        
        System.out.println("[OK] Barbero asignado: " + barberoAsignado);
        return chequearSiguiente(t);
    }
}
