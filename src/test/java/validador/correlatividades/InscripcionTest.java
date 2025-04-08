package validador.correlatividades;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class InscripcionTest {
  @Test
  public void inscripcionAprobadaCuandoCumpleCorrelativas() {
    Materia algoritmos = new Materia("Algoritmos");
    Materia paradigmas = new Materia("Paradigmas");
    paradigmas.agregarCorrelativa(algoritmos);
    Materia diseño = new Materia("Diseño de Sistemas");
    diseño.agregarCorrelativa(paradigmas);

    Alumno alumna = new Alumno();
    alumna.aprobarMateria(algoritmos);
    alumna.aprobarMateria(paradigmas);

    Inscripcion inscripcion = new Inscripcion(alumna, Arrays.asList(diseño));
    assertTrue(inscripcion.aprobada());
  }

  @Test
  public void inscripcionRechazadaSiFaltaUnaCorrelativa() {
    Materia algoritmos = new Materia("Algoritmos");
    Materia paradigmas = new Materia("Paradigmas");
    paradigmas.agregarCorrelativa(algoritmos);
    Materia diseño = new Materia("Diseño de Sistemas");
    diseño.agregarCorrelativa(paradigmas);

    Alumno alumna = new Alumno();
    alumna.aprobarMateria(algoritmos); // No aprobó Paradigmas

    Inscripcion inscripcion = new Inscripcion(alumna, Arrays.asList(diseño));
    assertFalse(inscripcion.aprobada());
  }
}
