package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    public int nivel;

    public Agente(int id, String nombre, String habilidadEspecial, int nivel) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivel = 0;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void incrementarNivel() {
        this.nivel ++;
        System.out.println("Nivel subido");
        System.out.println("El nuevo nivel es: " + this.nivel);
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
