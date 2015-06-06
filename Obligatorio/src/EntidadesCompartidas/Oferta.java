package EntidadesCompartidas;

public class Oferta {
    private int id;
    private String cargo;
    private String titulo;
    private int vacantes;
    private String descr_cargo;
    private String descr_req;
    private Boolean activa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getDescr_cargo() {
        return descr_cargo;
    }

    public void setDescr_cargo(String descr_cargo) {
        this.descr_cargo = descr_cargo;
    }

    public String getDescr_req() {
        return descr_req;
    }

    public void setDescr_req(String descr_req) {
        this.descr_req = descr_req;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Oferta(int id, String cargo, String titulo, int vacantes, String descr_cargo, String descr_req, Boolean activa) {
        this.id = id;
        this.cargo = cargo;
        this.titulo = titulo;
        this.vacantes = vacantes;
        this.descr_cargo = descr_cargo;
        this.descr_req = descr_req;
        this.activa = activa;
    }
    
}
