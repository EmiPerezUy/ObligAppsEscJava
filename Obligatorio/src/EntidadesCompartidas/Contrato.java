package EntidadesCompartidas;

import java.util.*;

public class Contrato {
    private int id;
    private Date fecha;
    private int sueldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Contrato(int id, Date fecha, int sueldo) {
        this.id = id;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }
    
}
