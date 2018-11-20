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
public class Agenda {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private Persona[] vAgenda;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.vAgenda = new Persona[10];
    }
    
    public void inicializarAgenda(){
        for (int i = 0; i < vAgenda.length; i++) {
            vAgenda[i]=null;
        }
    }
    
    public void añadirPersona(Persona p){
        for (int i = 0; i < vAgenda.length; i++) {
            if(vAgenda[i]==null){
                vAgenda[i]=p;
                break;
            }
        }
    }
    
    public void borrarPersona(String nombre){
        for (int i = 0; i < vAgenda.length; i++) {
            if(nombre.equals(vAgenda[i].getNombre())){
                vAgenda[i]=null;
            }
        }
    }
    
    public String mostrarPersonas(){
        String persona="";
        for (Persona p : vAgenda) {
            if(p!=null){
                persona +="\n"+p.toString();
            }
        }
        return persona;
    }
    
    public int mostrarMayorEdad(){
        int contador=0;
        for (Persona p: vAgenda){
            if(p!=null && p.getEdad()>=18){
                contador++;
            }
        }
        return contador;
    }
    
    public Persona[] rangoEdades(){
        String persona="";
        Persona[] aux = new Persona[10];
        
        int edadMin = 0 ,edadMax = 0;
        
        System.out.println("Dime la edad minima");
        edadMin = leer.nextInt();
        System.out.println("Dime la edad maxima");
        edadMax = leer.nextInt();
        
        for (int i = 0; i < vAgenda.length; i++) {
            
        }
        
        for (Persona p: vAgenda){
            if(p!=null && edadMin<=p.getEdad() && edadMax>=p.getEdad()){
                aux[huecoLibre(aux)] = p;
            }
        }
        
        return aux;
    }
    
    private int huecoLibre(Persona[] vector){
        int libre = 0;
        for (Persona p: vector){
            if(p!=null){
                
            }
        }
        return libre;
    }
}
