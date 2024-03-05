package uabc.mx;

public class Formato {
    ListaDeCursos listaDeCursos;
    public Formato() {
        listaDeCursos = new ListaDeCursos();
    }
    public void actualizarFormato(String materia) {
        listaDeCursos.inscribir(materia);
    }
}
