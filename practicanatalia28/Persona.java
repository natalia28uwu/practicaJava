      
package practicanatalia28;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String telefono;
    private String  direccion;
    private String email;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Persona (String nombre, String apellido, int edad,String cedula, String telefono,String  direccion,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula=cedula;
        this.telefono= telefono;
        this.direccion=direccion;
        this.email=email;
        
    }
    
}
