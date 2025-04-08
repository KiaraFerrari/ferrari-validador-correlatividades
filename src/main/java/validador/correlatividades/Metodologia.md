
-> Use la plantilla que nos dieron para projectos de java en dds del año pasado. 

1) Clase Materia:

    Atributos
        -nombre 
        -correlativas (es una lista de otras materias)

    Métodos
        -agregarCorrelativa(Materia)
        -getCorrelativas()

Cada materia sabe cuales son sus correlatividades, asi cada una sabe cuales son sus requisitos, facilitando la verificación

2) Clase Alumno

    Atributos
        -materiasAprobadas (es una lista de materias q el alumno aprobó)

    Métodos
        -aprobarMateria(Materia) 
        -aprobo(Materia) (verifica si una materia esta en la lista de las aprobadas)

El alumno solo sabe que materias tiene aprobadas, no conoce la relacion entre esas materias y sus correlatividades.

3) Clase Inscripción

    Atributos
        -alumno
        -materias

    Métodos
        -aprobada() (retorna true o false dependiendo de si el alumno cumple con todas las correlatividades)

Esta clase es la que posee la logica de validacion de correlatividades

* En los test se cubre los 2 casos posibles, que la isncripcion sea válida (todas las correlativas estan aprobadas) o que sea invalida (cuando falta al menos una correlativa.)

