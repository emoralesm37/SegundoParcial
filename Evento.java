package segundoParcial;

public class Evento {
    private String nombre;
    private String fecha;
    private Salon salon;

    public Evento(String nombre, String fecha, Salon salon) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public Salon getSalon() {
        return salon;
    }
}
