package talleruno;

/**
 * @author Jair Ortiz
 */
public class Personaje {
    
    /**
     * Se representa los siguientes atributos
     * Publicos: Nombre,Ataque, Defensa; Prvados: Ataquefinal
     * protegidos: Apariencia
     */
    
    public String Name;
    public String attackskill;
    public String defenseskill;
    private String ultimateskill;
    protected String appearance;

    /**
     * Representa el metodo get/set para el atributo Nombre 
     */
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
