package talleruno;

/**
 * @author Jair Ortiz
 */
public class Cuentabancaria {
    
    /**
     * Se representa los siguientes atributos
     * Publicos: Numero de cuenta 
     * Protegidos: Activacion
     */
    
    public int accontNumber;
    protected boolean activated;

     /**
     * Representa el metodo get/set para el atributo Activado 
     */
    
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
