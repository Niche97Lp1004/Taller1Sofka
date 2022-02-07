package talleruno;

/**
 * @author Jair Ortiz 
 */
public class Carro {
    
    /**
     * Se representa los siguientes atributos
     * Publicos: Marca, cilindraje, color, rin; Privados: Placa
     * Protegidos: Nombre del dueño
     */
    
    public String mark;
    public int cylinercapacity;
    public String color;
    public int rhine;
    private String licenseplate;
    protected String NameUser;

    /**
     * Representa el metodo get/set para el atributo Marca 
     */
    
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    
}
