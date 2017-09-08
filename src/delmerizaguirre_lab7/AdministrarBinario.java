/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delmerizaguirre_lab7;

import java.util.ArrayList;
import java.io.*;

public class AdministrarBinario {

    private ArrayList<Persona> ListaPersonas = new ArrayList();
    private File archivo = null;

    public AdministrarBinario(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return ListaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> ListaUsuarios) {
        this.ListaPersonas = ListaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //Extra mutador
    public void addPersona(Persona u) {
        this.ListaPersonas.add(u);

    }

    public void CargarArchivo() {
        try {
            ListaPersonas = new ArrayList();
            Persona temp;
           
            if (archivo.exists()) {
                FileInputStream entrada = null;
                ObjectInputStream objeto = null;
                
                try {
                    entrada
                            = new FileInputStream(archivo);
                    objeto
                            = new ObjectInputStream(entrada);
                    
                    while ((temp = (Persona) objeto.readObject()) != null) {
                        ListaPersonas.add(temp);
                        
                    }
                } catch (EOFException e) {
                    //Encontro el final del archivo
                }
                
                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {
            
        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona u : ListaPersonas) {
                bw.writeObject(u);

            }
            bw.flush();
        } catch (IOException e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
            }
        }

    }

}
