package Modelo;
public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private int fiabilidad;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getFiabilidad() {
        return fiabilidad;
    }

    public void setFiabilidad(int fiabilidad) {
        this.fiabilidad = fiabilidad;
    }

    public Cliente(String cedula, String nombre, String apellido, String correo, int fiabilidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fiabilidad = fiabilidad;
    }

  
   
   

}
