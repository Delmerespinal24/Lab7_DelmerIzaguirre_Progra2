
package delmerizaguirre_lab7;

import java.io.Serializable;

public class Lugar implements Serializable {
       private String nombre;
       private String clima;
       private double extension;
       private int habitantes;
       private String tipoZona;

    public Lugar() {
    }
 
    public Lugar(String nombre, String clima, double extension, int habitantes, String tipoZona) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.habitantes = habitantes;
        this.tipoZona = tipoZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }
    
    public boolean CompararLugar(Lugar l){
        return this.nombre.equals(l.getNombre()) && this.tipoZona.equals(l.getTipoZona()) && (this.extension == l.getExtension());
        
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
       
       
    
    
}
