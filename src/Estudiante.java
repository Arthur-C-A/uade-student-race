public class Estudiante {
    private Carrera carrera;
    private String[] materiasAprobadas;
    private int cantidadAplazos;
    private int anio;
    private int velocidadAlumno;
    private int posicionX;
    private int posicionY;

    public Estudiante(Carrera carrera) {
        this.carrera = carrera;
        this.materiasAprobadas = new String[0]; // Inicializa con un array vacío
        this.cantidadAplazos = 0;
        this.anio = 1;
        this.velocidadAlumno = 5; // Valor por defecto
        this.posicionX = 0;
        this.posicionY = 0;
    }

    public void moverJugador(int posX, int posY) {
        this.posicionX += posX * velocidadAlumno;
        this.posicionY += posY * velocidadAlumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public int getCantidadAplazos() {
        return cantidadAplazos;
    }

    public void setCantidadAplazos(int cantidadAplazos) {
        this.cantidadAplazos = cantidadAplazos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String[] getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(String[] materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
