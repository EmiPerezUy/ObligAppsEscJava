package EntidadesCompartidas;

public class Aspirante {
    private int ci;
    private String nombre;
    private int edad;

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Aspirante(int ci, String nombre, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
    }
    
}
