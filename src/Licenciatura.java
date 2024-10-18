public class Licenciatura extends Carrera {
    private int aniosLicenciatura;
    private String[] materiasPropiasLicenciatura;

    public Licenciatura(String[] materiasGenerales, int duracionCarrera, String directorCarrera, int aplazosMaximos, int cantidadMaterias, int aniosLicenciatura, String[] materiasPropiasLicenciatura) {
        super(materiasGenerales, duracionCarrera, directorCarrera, aplazosMaximos, cantidadMaterias);
        this.aniosLicenciatura = aniosLicenciatura;
        this.materiasPropiasLicenciatura = materiasPropiasLicenciatura;
    }

    public int getAniosLicenciatura() {
        return aniosLicenciatura;
    }

    public String[] getMateriasPropiasLicenciatura() {
        return materiasPropiasLicenciatura;
    }
}
