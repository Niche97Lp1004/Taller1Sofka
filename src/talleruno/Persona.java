package talleruno;

/**
 * @author Jair Ortiz
 */
public class Persona {
    
    /**
     * Se representa los siguientes atributos
     * Publicos: Nombre,Apellido1, Apellido2, Cumpleaños, Altura
     */
    
    public String name;
    public String LastName1;
    public String LastName2;
    public String dateBirth;
    public float Heigt;

     /**
     * Representa el metodo get/set para el atributo Nombre  
     */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
