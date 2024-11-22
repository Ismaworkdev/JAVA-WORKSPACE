package gym_prueba;

class Persona {
    private int código;
    private String nombre;
    private String apellidos;
    private String email;
    private String teléfono;

    public Persona(int código, String nombre, String apellidos, String email, String teléfono) {
        this.código = código;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.teléfono = teléfono;
    }

    // Getters y setters

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
}

class Dueño extends Persona {
    public Dueño(int código, String nombre, String apellidos, String email, String teléfono) {
        super(código, nombre, apellidos, email, teléfono);
    }

    @Override
    public String toString() {
        return "Dueño: " + super.getNombre() + " " + super.getApellidos();
    }
}

