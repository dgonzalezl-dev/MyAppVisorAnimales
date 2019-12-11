/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myappvisoranimales;

public class Animal {
    String nombre;
    String imagenMini;
    String imagenG;
    public  Animal(String nombre,String imagenMini,String imagenG){
        this.nombre=nombre;
        this.imagenMini=imagenMini;
        this.imagenG=imagenG;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagenMini() {
        return imagenMini;
    }

    public String getImagenG() {
        return imagenG;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagenMini(String imagenMini) {
        this.imagenMini = imagenMini;
    }

    public void setImagenG(String imagenG) {
        this.imagenG = imagenG;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
