/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanatalia28;


public class Cliente  extends Persona{
    private String listaCompras;
    private String metodoPago;
    private String TipoCliente;

    public String getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(String listaCompras) {
        this.listaCompras = listaCompras;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }
    
    
      public Cliente (String nombre, String apellido, int edad, String cedula, String telefono,String  direccion,String email, String listaCompras, String metodoPago,String tipoCliente){
              super(nombre, apellido, edad, cedula,  telefono,  direccion, email);

      this.listaCompras= listaCompras;
      this.metodoPago= metodoPago;
      this.TipoCliente= TipoCliente;
      
        
    }
    public void contactarRepresentante(){
        System.out.println("Usted ha contactado al representante");
    }
    public void solicitarInformacion(){
        System.out.println("Usted ha solicitado una informacion");
    }
          
    
}