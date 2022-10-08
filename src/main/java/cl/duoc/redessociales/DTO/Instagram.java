package cl.duoc.redessociales.DTO;

public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;

    public Instagram(String usuario, String password, int id, String historia, boolean estado) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }
    
    public Instagram() {
        super();
        this.id = 0;
        this.historia = "";
        this.estado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nUsuario Conectado: ").append(super.getUsuario());
        sb.append("\nHistoria: ").append(this.getHistoria());
        return sb.toString();
    }
}
