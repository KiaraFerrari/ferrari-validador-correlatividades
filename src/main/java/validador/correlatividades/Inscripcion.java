package validador.correlatividades;

import java.util.List;

public class Inscripcion {
  private Alumno alumno;
  private List<Materia> materias;

  public Inscripcion(Alumno alumno, List<Materia> materias) {
    this.alumno = alumno;
    this.materias = materias;
  }

  public boolean aprobada() {
    for (Materia materia : materias) {
      for (Materia correlativa : materia.getCorrelativas()) {
        if (!alumno.aprobo(correlativa)) {
          return false;
        }
      }
    }
    return true;
  }
}