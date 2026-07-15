package apptask;

public class TareaExamen extends TareaBase {
    
  
    private String temasAEstudiar;

    public TareaExamen(String materia, String descripcion, String fechaEntrega, String temasAEstudiar) {
       
        super(materia, descripcion, fechaEntrega); 
        this.temasAEstudiar = temasAEstudiar;
    }

    @Override
    public String obtenerDetalles() {
        return "TIPO EXAMEN | Materia: " + materia + " | Temas a evaluar: " + temasAEstudiar;
    }
}