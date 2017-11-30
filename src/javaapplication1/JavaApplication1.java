/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paris
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando un objeto tipo  Scanner
        
        Scanner input=new Scanner(System.in);
     
        System.out.println("EXAMEN PARCIAL");
        System.out.println("Moises Cabello");
        System.out.println("");
        System.out.println("    !!Catalogo de ventas moviles A9 !!");
        System.out.println("Telefonos Moviles Disponibles: ");
        System.out.println(" 1  Samsung S7.");
        System.out.println(" 2  HTC A9.");
        System.out.println(" 3  Huawei P8.");
        System.out.println("");
        System.out.print("Seleccione un modelo de telefono para vizualizar sus caracteristicas: ");
        
        int opcion = input.nextInt();
        
                
        if (opcion == 1){
            System.out.println("");
            System.out.println("Pantalla       : 4.7'   ");
            System.out.println("Camara         : 8 Mp ");
            System.out.println("Procesador     : 2.4 Ghz QuadCore ");
            System.out.println("Memoria RAM    : 3 Gb ");
            System.out.println("Almacenamiento : 16 Gb");
            System.out.println("");
            System.out.println(" Operadoras Disponibles ");
            System.out.println("");
            System.out.println(" 1 Movistar");
            System.out.println(" 2 Entel");
            System.out.println("");
       
            System.out.print("Selecciona Operadora para vizualizar los planes: ");
            int opcion21 = input.nextInt();
            if ( opcion21 ==1){
                System.out.println("");
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Movistar Total 109");
                System.out.println(" 2 Plan Movistar Total 119");
                System.out.println(" 3 Plan Movistar Full");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion211 =input.nextInt();
                if (opcion211 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Movistar Total 109--");
                    System.out.println("");
                    System.out.println("Precio    : 109 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 6 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                if (opcion211 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Movistar Total 119--");
                    System.out.println("");
                    System.out.println("Precio    : 119 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 8 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                
                if (opcion211 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Movistar Full--");
                    System.out.println("");
                    System.out.println("Precio    : 145 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 16 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                    System.out.println("Redes Sociales Ilimitadas");
                }
            }
            
            if ( opcion21 ==2 ){
                System.out.println("");
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Entel 79");
                System.out.println(" 2 Plan Entel 99");
                System.out.println(" 3 Plan Entel Plus 109");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion111 =input.nextInt();
                if (opcion111 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Entel 79--");
                    System.out.println("");
                    System.out.println("Precio    : 79 $ ");
                    System.out.println("Minutos   : 500 (Todo destino) ");
                    System.out.println("Internet  : 8 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("Redes Sociales Ilimitadas");
                    
                }
                if (opcion111 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Entel 99--");
                    System.out.println("");
                    System.out.println("Precio    : 89 $ ");
                    System.out.println("Minutos   : 700 (Todo Destino) ");
                    System.out.println("Internet  : 10 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("Redes Sociales Ilimitadas");
                    
                }
                
                if (opcion111 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Entel Plus 109--");
                    System.out.println("");
                    System.out.println("Precio    : 109 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 20 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("Redes Sociales Ilimitadas");
                    
                }
            }
        }
        if (opcion == 2){
            System.out.println("");
            System.out.println("Pantalla       : 6.7' ");
            System.out.println("Camara         : 16 Mp ");
            System.out.println("Procesador     : 3.6 Ghz ARX  ");
            System.out.println("Memoria RAM    : 2.5 Gb ");
            System.out.println("Almacenamiento : 32 Gb");
            
            System.out.println("");
            System.out.println(" Operadoras Disponibles ");
            System.out.println("");
            System.out.println(" 1 Claro");
            System.out.println(" 2 Bitel");
            System.out.println("");
       
            System.out.print("Selecciona Operadora para vizualizar los planes: ");
            int opcion21 = input.nextInt();
            if ( opcion21 ==1){
                System.out.println("");
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Claro Max 99");
                System.out.println(" 2 Plan Claro Max 101");
                System.out.println(" 3 Plan Claro Full 115");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion211 =input.nextInt();
                if (opcion211 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Claro Max 99--");
                    System.out.println("");
                    System.out.println("Precio    : 99 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 6 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                if (opcion211 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Claro Max 101--");
                    System.out.println("");
                    System.out.println("Precio    : 101 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 8 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                
                if (opcion211 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Claro Full 115--");
                    System.out.println("");
                    System.out.println("Precio    : 115 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 16 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
            }
            
            if ( opcion21 ==2 ){
                System.out.println("");
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Bitel Pro 69");
                System.out.println(" 2 Plan Bitel Pro 89");
                System.out.println(" 3 Plan Bitel Plus 105");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion211 =input.nextInt();
                if (opcion211 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Bitel Pro 69--");
                    System.out.println("");
                    System.out.println("Precio    : 69 $ ");
                    System.out.println("Minutos   : 500 (Todo destino) ");
                    System.out.println("Internet  : 8 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    
                }
                if (opcion211 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Bitel Pro 89--");
                    System.out.println("");
                    System.out.println("Precio    : 89 $ ");
                    System.out.println("Minutos   : 700 (Todo Destino) ");
                    System.out.println("Internet  : 10 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    
                }
                
                if (opcion211 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Bitel Plus 105--");
                    System.out.println("");
                    System.out.println("Precio    : 105 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 20 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    
                }
            }
        }
        if (opcion == 3){
            System.out.println("");
            System.out.println("Pantalla       : 5'   ");
            System.out.println("Camara         : 13 Mp ");
            System.out.println("Procesador     : 2.4 Ghz Snapdragon ");  
            System.out.println("Memoria RAM    : 4 Gb ");
            System.out.println("Almacenamiento : 16 Gb");
            
            System.out.println("");
            System.out.println(" Operadoras Disponibles ");
            System.out.println("");
            System.out.println(" 1 Claro");
            System.out.println(" 2 Movistar");
            System.out.println("");
       
            System.out.print("Selecciona Operadora para vizualizar los planes: ");
            int opcion31 = input.nextInt();
            if ( opcion31 ==1){
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Claro Max 99");
                System.out.println(" 2 Plan Claro Max 101");
                System.out.println(" 3 Plan Claro Full 115");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion311 =input.nextInt();
                if (opcion311 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Claro Max 99--");
                    System.out.println("");
                    System.out.println("Precio    : 99 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 6 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                if (opcion311 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Claro Max 101--");
                    System.out.println("");
                    System.out.println("Precio    : 101 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 8 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
                
                if (opcion311 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Claro Full 115--");
                    System.out.println("");
                    System.out.println("Precio    : 115 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 16 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPC Ilimitado");
                }
            }
            
            if ( opcion31 ==2 ){
                System.out.println("Planes Disponible:");
                System.out.println(" 1 Plan Movistar Total 69");
                System.out.println(" 2 Plan Movistar Total 89");
                System.out.println(" 3 Plan Movistar Pro 105");
                System.out.println("");
                System.out.println("Seleccione un plan para ver sus paquetes: ");
                
                int opcion311 =input.nextInt();
                if (opcion311 == 1 ){
                    System.out.println("");
                    System.out.println("--Plan Movistar Total 69--");
                    System.out.println("");
                    System.out.println("Precio    : 69 $ ");
                    System.out.println("Minutos   : 600 (Todo destino) ");
                    System.out.println("Internet  : 6 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPM Ilimitado");
                }
                if (opcion311 == 2 ) {
                    System.out.println("");
                    System.out.println("--Plan Movistar Total 89--");
                    System.out.println("");
                    System.out.println("Precio    : 89 $ ");
                    System.out.println("Minutos   : 900 (Todo Destino) ");
                    System.out.println("Internet  : 9 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPM Ilimitado");
                }
                
                if (opcion311 == 3 ) {
                    System.out.println("");
                    System.out.println("--Plan Movistar Pro 105--");
                    System.out.println("");
                    System.out.println("Precio    : 105 $ ");
                    System.out.println("Minutos   : Ilimitado ");
                    System.out.println("Internet  : 16 Gb ");
                    System.out.println("SMS       : Ilimitado");
                    System.out.println("RPM Ilimitado");
                }
            }
        }
        System.out.println("");
        System.out.println("Gracias por su visita!!");
    }
}
      
            
        
        
       
        
        
        
        
        
        
        
        
  