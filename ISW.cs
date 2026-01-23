public class Competicion{
    private string nombre;
    private ICollection<Evento> eventos;
    private ICollection<Promotor> promotores;
}

public class Promotor : Participante{
    private string empresa;
    private Competicion competicion;
}

public class Participante{
    private string DNI;
    private string nombre;
    private ICollection<Inscripcion> inscripciones;
}

public class Evento{
    private string nombre;
    private Competicion competicion;
    private ICollection<Inscripcion> inscripciones;
    private Participante ganador;
}

public class Inscripcion{
    private int numInscripcion;
    private DateTime fechaHora;
    private double puntuacion;
    private Participante participante;
    private Evento evento;
}

public class Sesion{
    private string lugar;
    private DateTime fechaHora;
    private Evento evento;
    private ICollection<Sesion> sesiones;
}
