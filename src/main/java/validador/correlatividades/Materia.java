package validador.correlatividades;

import java.util.ArrayList;
import java.util.List;

public class Materia {
  private String nombre;
  private List<Materia> correlativas = new ArrayList<>();

  public Materia(String nombre) {
    this.nombre = nombre;
  }

  public void agregarCorrelativa(Materia materia) {
    correlativas.add(materia);
  }

  public List<Materia> getCorrelativas() {
    return correlativas;
  }

  public String getNombre() {
    return nombre;
  }
}