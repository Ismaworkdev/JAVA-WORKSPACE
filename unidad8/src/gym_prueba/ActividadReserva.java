package gym_prueba;

class ActividadReservada {
    private String nombreActividad;
    private double hora;
    private int códigoMonitor;
    private int númeroMáximoParticipantes;
    private int númeroParticipantes;

    public ActividadReservada(String nombreActividad, double hora, int códigoMonitor, int númeroMáximoParticipantes, int númeroParticipantes) {
        this.nombreActividad = nombreActividad;
        this.hora = hora;
        this.códigoMonitor = códigoMonitor;
        this.númeroMáximoParticipantes = númeroMáximoParticipantes;
        this.númeroParticipantes = númeroParticipantes;
    }

    // Getters y setters

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public int getCódigoMonitor() {
        return códigoMonitor;
    }

    public void setCódigoMonitor(int códigoMonitor) {
        this.códigoMonitor = códigoMonitor;
    }

    public int getNúmeroMáximoParticipantes() {
        return númeroMáximoParticipantes;
    }

    public void setNúmeroMáximoParticipantes(int númeroMáximoParticipantes) {
        this.númeroMáximoParticipantes = númeroMáximoParticipantes;
    }

    public int getNúmeroParticipantes() {
        return númeroParticipantes;
    }

    public void setNúmeroParticipantes(int númeroParticipantes) {
        this.númeroParticipantes = númeroParticipantes;
    }

    @Override
    public String toString() {
        return "Actividad: " + nombreActividad + ", Hora: " + hora + ", Monitor: " + códigoMonitor + ", Participantes: " + númeroParticipantes + "/" + númeroMáximoParticipantes;
    }
}
