package cl.duoc.redessociales.DTO;

public class RedSocial {
    private String usuario;
    private String password;

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    public RedSocial() {
        this.usuario = "";
        this.password = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
