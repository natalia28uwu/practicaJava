/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanatalia28;



import java.util.Scanner;

public class Main {
    
   
     public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
         
         
         
         Empleado empleado1 = new Empleado("nat","frias",15,"0-19877","849-098-1234","los prados","natliafriasgmail.com","Carnet uno","Uniforme formal","Cajera",5);
         Cliente cliente2 = new Cliente("mat","estre",16,"0-878876","809-876-9087","los prados", "matestres@gmail.com","Computadora","tarjeta","Regular");
         
         int opcion = 0;
         
         
         
         System.out.println("Elija una opcion");
         System.out.println("1.Solicitar permiso");
         System.out.println("2.Reportar horas extra");
         System.out.println("3.Contactar represemtantes");
         System.out.println("4.Solicitar informacion");
         opcion = lectura.nextInt();
        
    
    
     
     if (opcion == 1){
            empleado1.solicitudPermiso();
}
     else if (opcion ==2){
         empleado1.ReporteHorasExtras();
     }
     else if (opcion == 3){
         cliente2.contactarRepresentante();
     }
     else if (opcion == 4){
         cliente2.solicitarInformacion();
     }
     else {
         System.out.println("No hay mas opciones");
     }


     }
     }