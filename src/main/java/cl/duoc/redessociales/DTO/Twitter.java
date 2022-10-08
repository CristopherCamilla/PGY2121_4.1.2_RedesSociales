package cl.duoc.redessociales.DTO;

import java.time.LocalDate;

public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private LocalDate fecha;

    public Twitter(int id, String noticia, LocalDate fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public Twitter() {
        super();
        this.id = 0;
        this.noticia = "";
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nUsuario Conectado: ").append(super.getUsuario());
        sb.append("\nNoticia: ").append(this.getNoticia());
        return sb.toString();
    }
}
