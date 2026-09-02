package edu.dosw.parcial.bobs_barber;

public abstract class ValidadorBase {
    protected ValidadorBase siguiente;

    public void setSiguiente(ValidadorBase siguiente) {
        this.siguiente = siguiente;
    }

    public abstract ResultadoValidacion chequear(TurnoData t);

    protected ResultadoValidacion chequearSiguiente(TurnoData t) {
        if (siguiente == null) {
            return new ResultadoValidacion(true, "Todas las validaciones pasaron");
        }
        return siguiente.chequear(t);
    }
}
