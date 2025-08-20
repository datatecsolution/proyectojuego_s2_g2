package net.perlasjp.juego;

public class Enemigo {

    private String nombre;

    private int salud;

    private int fuerza;

    public int atacar() {
        return fuerza;
    }

    public void recibirDanio(int cantidad) {
        salud = salud - cantidad;
        if (salud < 0)
            salud = 0;
    }

    public boolean estarVivo() {
        return salud > 0;
    }

    public Enemigo(String nombre, int salud) {

      nombre= n;
      salud= s;
        fuerza = new Random().nextInt(bound:5)+ 5;

    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

}
