package co.edu.udistrital.service.model;


public class OEUsuario  {
    private String token;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;
    private String nombreAmor;
    private String correoAmor;
    private int telefonoAmor;
    private String facebookAmor;

    public OEUsuario(){}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreAmor() {
        return nombreAmor;
    }

    public void setNombreAmor(String nombreAmor) {
        this.nombreAmor = nombreAmor;
    }

    public String getCorreoAmor() {
        return correoAmor;
    }

    public void setCorreoAmor(String correoAmor) {
        this.correoAmor = correoAmor;
    }

    public int getTelefonoAmor() {
        return telefonoAmor;
    }

    public void setTelefonoAmor(int telefonoAmor) {
        this.telefonoAmor = telefonoAmor;
    }

    public String getFacebookAmor() {
        return facebookAmor;
    }

    public void setFacebookAmor(String facebookAmor) {
        this.facebookAmor = facebookAmor;
    }

   

}