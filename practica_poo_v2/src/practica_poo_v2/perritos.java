package practica_poo_v2;

public class perritos {
    //atributos
    private String name;
    private String raza;
    private double altura;
    
    //constructores
    public perritos(String name, String raza) {
        this.name = name;
        this.raza = raza;
    }

    public perritos(String name, String raza, double altura) {
        this.name = name;
        this.raza = raza;
        this.altura = altura;
    }

    public perritos(String name, double altura) {
        this.name = name;
        this.altura = altura;
    }

    //set y get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //metodos de admi
    @Override
    public String toString(){
        return "Nombre: "+name+" raza: "+raza+" altura: "+altura;
    }
    
}
