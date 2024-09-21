package segundoParcial;

public class Rerservacion {
    private Evento evento;
    private Servicio servicio;
    private int cantidadParticipantes;

    public Rerservacion(Evento evento, Servicio servicio) {
        this.evento = evento;
        this.servicio = servicio;
        this.cantidadParticipantes = 0;
    }

    public void agregarParticipantes(int cantidad) {
        if (cantidadParticipantes + cantidad <= evento.getSalon().getCapacidad()) {
            cantidadParticipantes += cantidad;
        } else {
            System.out.println("Capacidad máxima alcanzada");
        }
    }

    public void mostrarReservacion() {
        System.out.println("Evento: " + evento.getNombre());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Salon: " + evento.getSalon().getNombre());
        System.out.println("Cantidad de Participantes: " + cantidadParticipantes);
    }
}
