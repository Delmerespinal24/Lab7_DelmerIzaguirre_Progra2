
package delmerizaguirre_lab7;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String profesion;
    private Lugar lugar;
    private int ID;
    private int edad;
    private float estatura;

    public Persona() {
    }

    public Persona(String nombre, String profesion, Lugar lugar, int ID, int edad, float estatura) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.lugar = lugar;
        this.ID = ID;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
