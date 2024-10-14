/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanatalia28;




public class Empleado extends Persona {
    private String carnet_empleado;
    private String uniforme;
    private String puestoTrabajo;
    private int HorasExtra;

    

    public String getCarnet_empleado() {
        return carnet_empleado;
    }

    public void setCarnet_empleado(String carnet_empleado) {
        this.carnet_empleado = carnet_empleado;
    }

    public String getUniforme() {
        return uniforme;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public int getHorasExtra() {
        return HorasExtra;
    }

    public void setHorasExtra(int HorasExtra) {
        this.HorasExtra = HorasExtra;
    }

    
    public Empleado( String nombre, String apellido, int edad,String cedula, String telefono,String  direccion,String email,String carnet_empleado, String uniforme,String puestoTrabajo,int HorasExtra){
       super(nombre, apellido, edad, cedula,  telefono,  direccion, email);
        this.carnet_empleado=carnet_empleado;
        this.uniforme=uniforme;
        this.puestoTrabajo=puestoTrabajo;
        this.HorasExtra = HorasExtra;
        
    }

   
    public void solicitudPermiso(){
        System.out.println("usted ha solicitado un permiso ");
    }
     public void ReporteHorasExtras(){
        System.out.println("usted ha reportado sus horas extra ");
    }
    
}