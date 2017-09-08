package delmerizaguirre_lab7;

import javax.swing.JTable;

public class HiloLugar extends Thread {

    private final String Path = "./Personas.JP4";
    private final JTable tabla;
    private final Lugar lugar;

    public HiloLugar(JTable tabla, Lugar lugar) {
        this.tabla = tabla;
        this.lugar = lugar;
    }

    public void ActualizarTabla() {
        AdministrarBinario AB = new AdministrarBinario(Path);
        AB.CargarArchivo();

        int cont = 0;
        int tam = AB.getListaPersonas().size();
        for (int i = 0; i < AB.getListaPersonas().size(); i++) {
            if (lugar.CompararLugar(AB.getListaPersonas().get(i).getLugar())) {
                cont++;
            }
        }
        Object[][] matriz = new Object[cont][5];
        cont = 0;
        for (int i = 0; i < tam; i++) {
            if (lugar.CompararLugar(AB.getListaPersonas().get(i).getLugar())) {
                matriz[cont][0] = AB.getListaPersonas().get(i).getNombre();
                matriz[cont][1] = AB.getListaPersonas().get(i).getID();
                matriz[cont][2] = AB.getListaPersonas().get(i).getProfesion();
                matriz[cont][3] = AB.getListaPersonas().get(i).getEdad();
                matriz[cont][4] = AB.getListaPersonas().get(i).getEstatura();
                cont++;
            }
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "ID", "Profesion", "Edad", "Estatura"
                }
        ));

    }

    @Override
    public void run() {
        while (true) {
            try {
                ActualizarTabla();
            } catch (Exception e) {
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }

    }

}
