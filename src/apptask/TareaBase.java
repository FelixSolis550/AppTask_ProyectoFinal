package apptask;

import java.io.Serializable;


public abstract class TareaBase implements Serializable {
    protected String materia;
    protected String descripcion;
    protected String fechaEntrega;
    protected boolean estadoCompletada;

  
    public TareaBase(String materia, String descripcion, String fechaEntrega) {
        this.materia = materia;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.estadoCompletada = false; 
    }

    public abstract String obtenerDetalles();

 
    public String getMateria() { return materia; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEntrega() { return fechaEntrega; }
    
  
    public String getEstado() { 
        return estadoCompletada ? "Completada" : "Pendiente"; 
    }
    

    public void marcarComoCompletada() {
        this.estadoCompletada = true;
    }
}