package EntidadesCompartidas;

import java.util.Date;

public class Entrevista {
    private int id;
    private Date fecha;
    private String resultado;

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Entrevista(int id, Date fecha, String resultado) {
        this.id = id;
        this.fecha = fecha;
        this.resultado = resultado;
    }
    
}
