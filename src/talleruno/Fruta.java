package talleruno;

/**
 * @author Jair Ortiz
 */
public class Fruta {
    
    /**
     * Se representa los siguientes atributos
     * Publicos: Nombre,color  ; Privados: Peso promedio
     */
    
    public String name;
    private float AverageWeight;
    public String colors;

    /**
     * Representa el metodo get/set para el atributo Color 
     */
    
    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
   
}
