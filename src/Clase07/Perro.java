package Clase07;

public class Perro {
    private String apodo;

    public Perro(String apodo){
        this.apodo = apodo;
    }

    public void ladrar(){
        System.out.println("Guau!, Guau!, Guau!");
    }

    public String getApodo() {
        return apodo;
    }
}
