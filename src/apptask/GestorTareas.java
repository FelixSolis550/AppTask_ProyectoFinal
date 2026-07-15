package apptask;

import java.util.ArrayList;

public class GestorTareas {
    
    private ArrayList<TareaBase> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }


    public void agregarTarea(TareaBase nuevaTarea) throws Exception {
        if (nuevaTarea == null) {
            throw new Exception("Error fatal: Se intentó guardar una tarea vacía.");
        }
        listaTareas.add(nuevaTarea);
    }
    
    public ArrayList<TareaBase> obtenerTodasLasTareas() {
        return listaTareas;
    }
    
    public void completarTarea(int indice) throws Exception {
        if (indice < 0 || indice >= listaTareas.size()) {
            throw new Exception("Error: La tarea seleccionada no existe en el sistema.");
        }
        listaTareas.get(indice).marcarComoCompletada();
    }
}