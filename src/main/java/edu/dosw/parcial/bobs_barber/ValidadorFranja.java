package edu.dosw.parcial.bobs_barber;

public class ValidadorFranja extends ValidadorBase {
    public ResultadoValidacion chequear(TurnoData t) {
        System.out.println("[OK] Franja disponible");
        return chequearSiguiente(t);
    }
}
