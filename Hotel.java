package segundoParcial;

public class Hotel {
    public static void main(String[] args) {
        // Creacion de  salones
        Salon salonA = new Salon("Salon A", 50);
        Salon salonB = new Salon("Salon B", 30);

        // Creacion de  eventos
        Evento evento1 = new Evento("Cumpleaños", "2023-12-01", salonA);
        Evento evento2 = new Evento("Reunión Corporativa", "2023-12-15", salonB);

        // Creacion de  servicio
        Servicio servicio1 = new Servicio("Juan Pérez");

        // Creacion de  reservación
        Rerservacion reservacion1 = new Rerservacion(evento1, servicio1);
        
        // Agregar cantidad de participantes
        reservacion1.agregarParticipantes(20);
        reservacion1.agregarParticipantes(35); // Esto debería imprimir un mensaje de capacidad máxima

        // Mostrar reservación
        reservacion1.mostrarReservacion();
    }
}
