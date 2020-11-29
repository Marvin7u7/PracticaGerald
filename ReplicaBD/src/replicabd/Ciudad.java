
package replicabd;

/**
 * @author @soy_megh
 */
public class Ciudad {
    
    private int id_Ciudad;
    private String Nombre_Ciudad;
    private int Poblacion;
    private float Extension;

    public Ciudad() {
    }

    public Ciudad(String Nombre_Ciudad, int Poblacion, float Extension) {
        this.Nombre_Ciudad = Nombre_Ciudad;
        this.Poblacion = Poblacion;
        this.Extension = Extension;
    }

    public float getExtension() {
        return Extension;
    }

    public void setExtension(float Extension) {
        this.Extension = Extension;
    }

    public int getId_Ciudad() {
        return id_Ciudad;
    }

    public void setId_Ciudad(int id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }

    public String getNombre_Ciudad() {
        return Nombre_Ciudad;
    }

    public void setNombre_Ciudad(String Nombre_Ciudad) {
        this.Nombre_Ciudad = Nombre_Ciudad;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

}
