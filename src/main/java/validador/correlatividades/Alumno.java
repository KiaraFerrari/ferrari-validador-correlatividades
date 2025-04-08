package validador.correlatividades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
  private List<Materia> materiasAprobadas = new ArrayList<>();

  public void aprobarMateria(Materia materia) {
    materiasAprobadas.add(materia);
  }

  public List<Materia> getMateriasAprobadas() {
    return materiasAprobadas;
  }

  public boolean aprobo(Materia materia) {
    return materiasAprobadas.contains(materia);
  }
}