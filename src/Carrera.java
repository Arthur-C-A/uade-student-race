public abstract class Carrera {
    protected String[] materiasGenerales;
    protected int duracionCarrera;
    protected String directorCarrera;
    protected int aplazosMaximos;
    protected int cantidadMaterias;

    public Carrera(String[] materiasGenerales, int duracionCarrera, String directorCarrera, int aplazosMaximos, int cantidadMaterias) {
        this.materiasGenerales = materiasGenerales;
        this.duracionCarrera = duracionCarrera;
        this.directorCarrera = directorCarrera;
        this.aplazosMaximos = aplazosMaximos;
        this.cantidadMaterias = cantidadMaterias;
    }

    public String[] getMateriasGenerales() {
        return materiasGenerales;
    }

    public int getDuracionCarrera() {
        return duracionCarrera;
    }

    public String getDirectorCarrera() {
        return directorCarrera;
    }

    public int getAplazosMaximos() {
        return aplazosMaximos;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }
}
