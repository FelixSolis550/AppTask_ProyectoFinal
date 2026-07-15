package apptask;

public class TareaProyecto extends TareaBase {
    
    private String integrantesGrupo;

    public TareaProyecto(String materia, String descripcion, String fechaEntrega, String integrantesGrupo) {
        super(materia, descripcion, fechaEntrega);
        this.integrantesGrupo = integrantesGrupo;
    }

    @Override
    public String obtenerDetalles() {
        return "TIPO PROYECTO | Materia: " + materia + " | Integrantes: " + integrantesGrupo;
    }
}