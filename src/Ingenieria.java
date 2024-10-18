public class Ingenieria extends Carrera {
    private int aniosIngenieria;
    private String[] materiasPropiasIngenieria;

    public Ingenieria(String[] materiasGenerales, int duracionCarrera, String directorCarrera, int aplazosMaximos, int cantidadMaterias, int aniosIngenieria, String[] materiasPropiasIngenieria) {
        super(materiasGenerales, duracionCarrera, directorCarrera, aplazosMaximos, cantidadMaterias);
        this.aniosIngenieria = aniosIngenieria;
        this.materiasPropiasIngenieria = materiasPropiasIngenieria;
    }

    public int getAniosIngenieria() {
        return aniosIngenieria;
    }

    public String[] getMateriasPropiasIngenieria() {
        return materiasPropiasIngenieria;
    }
}
