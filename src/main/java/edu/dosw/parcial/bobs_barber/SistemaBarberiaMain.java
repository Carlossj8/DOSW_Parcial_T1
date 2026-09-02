package edu.dosw.parcial.bobs_barber;

public class SistemaBarberiaMain {
    public static void main(String[] args) {
        
        ValidadorFranja valFranja = new ValidadorFranja();
        ValidadorBarbero valBarbero = new ValidadorBarbero();
        ValidadorCliente valCliente = new ValidadorCliente();
        ValidadorServicio valServicio = new ValidadorServicio();
        ValidadorPago valPago = new ValidadorPago();
        
        valFranja.setSiguiente(valBarbero);
        valBarbero.setSiguiente(valCliente);
        valCliente.setSiguiente(valServicio);
        valServicio.setSiguiente(valPago);
        
        // Escenario 1
        TurnoData turno1 = new TurnoData(
            "TURNO #001", "Carlos Ruiz", "carlos@gmail.com", "3208872188",
            "SER-002", "Martes 10:00 AM", "Sin preferencia", 
            "NEQUI", null, "3208872165", 38000
        );
        
        // Escenario 2
        TurnoData turno2 = new TurnoData(
            "TURNO #002", "Ana Lopez", "ana@gmail.com", "312345",
            "SER-005", "Lunes 10:00 AM", "Sin preferencia", 
            "PSE", null, "423456", 45000
        );
        
        // Escenario 3
        TurnoData turno3 = new TurnoData(
            "TURNO #003", "Julian Mesa", "julian@gmail.com", "3112145678",
            "SER-001, SER-004", "Sabado 1:00 PM", "Sin preferencia", 
            "PSE", "BANCOLOMBIA", "123456789", 45000
        );
        
        System.out.println("Procesando " + turno1.idTurno);
        ResultadoValidacion r1 = valFranja.chequear(turno1);
        if (r1.pasoBien) {
            System.out.println("TURNO CONFIRMADO");
            System.out.println("Total: $38.000");
        } else {
            System.out.println("TURNO NO CONFIRMADO");
        }
        
        System.out.println("\nProcesando " + turno2.idTurno);
        ResultadoValidacion r2 = valFranja.chequear(turno2);
        if (r2.pasoBien) {
            System.out.println("TURNO CONFIRMADO");
            System.out.println("Total: $45.000");
        } else {
            System.out.println("TURNO NO CONFIRMADO");
        }
        
        System.out.println("\nProcesando " + turno3.idTurno);
        ResultadoValidacion r3 = valFranja.chequear(turno3);
        if (r3.pasoBien) {
            System.out.println("TURNO CONFIRMADO");
            System.out.println("Total: $45.000");
        } else {
            System.out.println("TURNO NO CONFIRMADO");
        }
    }
}
