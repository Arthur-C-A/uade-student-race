public class Tecnicatura extends Carrera {
    private int aniosTecnicatura;
    private String[] materiasPropiasTecnicatura;

    public Tecnicatura(String[] materiasGenerales, int duracionCarrera, String directorCarrera, int aplazosMaximos, int cantidadMaterias, int aniosTecnicatura, String[] materiasPropiasTecnicatura) {
        super(materiasGenerales, duracionCarrera, directorCarrera, aplazosMaximos, cantidadMaterias);
        this.aniosTecnicatura = aniosTecnicatura;
        this.materiasPropiasTecnicatura = materiasPropiasTecnicatura;
    }

    public int getAniosTecnicatura() {
        return aniosTecnicatura;
    }

    public String[] getMateriasPropiasTecnicatura() {
        return materiasPropiasTecnicatura;
    }
}
