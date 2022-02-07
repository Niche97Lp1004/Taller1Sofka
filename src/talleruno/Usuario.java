package talleruno;

/**
 * @author Jair Ortiz
 */
public class Usuario {
    
    /**
     * Se representa los siguientes atributos (usuario de app para deporte)
     * Publicos: Nombre, Direccion, Edad, Altura, Peso ; Prvados: Rutas
     * protegidos: Contraseña
     */
    
    public String Name;
    public String Location;
    private String route;
    protected String Password;
    public int age;
    public int height;
    public int weight;

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
