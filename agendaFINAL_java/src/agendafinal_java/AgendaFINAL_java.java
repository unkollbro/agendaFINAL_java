/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendafinal_java;

import java.util.Scanner;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class AgendaFINAL_java {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p;
        String nombre;
        Agenda a = new Agenda("hola");
        
        int opcion=6;
        Menu.pintarMenu(opcion);
        do{
        opcion = leer.nextInt();
        Menu.pintarMenu(opcion);
        switch (opcion){
            //AÑADIR UN CONTACTO
            case 1: 
                    System.out.println("Dime el nombre, telefono y edad del contacto");
                    p = new Persona(leer.next(), leer.next(), leer.nextInt());
                    a.añadirPersona(p);
                    break;
            //BORRAR UN CONTACTO
            case 2:
                    System.out.println("Dime el nombre del contacto");
                    nombre = leer.nextLine();
                    a.borrarPersona(nombre);
                    break;
            //MOSTRAR MAYORES DE EDAD
            case 3:
                    System.out.println("Estos son los mayores de edad");
                    System.out.println(a.mostrarMayorEdad());
                    break;
            //MOSTRAR TODOS
            case 4: System.out.println(a.mostrarPersonas().toString());
                    break;
            //RANGO DE EDADES
            case 5: 
                    System.out.println(a.rangoEdades());
                    break;  
            case 0: break;
        }
        
        }while(opcion!=0);
    }
    
    
}
