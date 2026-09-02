package edu.dosw.parcial.bobs_barber;

public class ValidadorServicio extends ValidadorBase {
    public ResultadoValidacion chequear(TurnoData t) {
        System.out.println("[OK] Servicio en catálogo");
        return chequearSiguiente(t);
    }
}
