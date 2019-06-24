package entidades;
// Generated 23/06/2019 10:01:09 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idcliente;
     private String nombre;
     private String apellido;
     private Date fechanacimiento;
     private String direccion;
     private String telefono;
     private String email;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String apellido, Date fechanacimiento, String direccion, String telefono, String email) {
       this.idcliente = idcliente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechanacimiento = fechanacimiento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
    }
   
    public int getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}

