package edu.dosw.parcial.bobs_barber;

public class TurnoData {
    public String idTurno;
    public String clienteNombre;
    public String correo;
    public String telefono;
    public String servicioCodigo;
    public String diaHora;
    public String barberoReq;
    public String metodoPago;
    public String banco;
    public String cuentaNumero;
    public int monto;

    public TurnoData(String idTurno, String clienteNombre, String correo, String telefono, 
                     String servicioCodigo, String diaHora, String barberoReq, 
                     String metodoPago, String banco, String cuentaNumero, int monto) {
        this.idTurno = idTurno;
        this.clienteNombre = clienteNombre;
        this.correo = correo;
        this.telefono = telefono;
        this.servicioCodigo = servicioCodigo;
        this.diaHora = diaHora;
        this.barberoReq = barberoReq;
        this.metodoPago = metodoPago;
        this.banco = banco;
        this.cuentaNumero = cuentaNumero;
        this.monto = monto;
    }
}
