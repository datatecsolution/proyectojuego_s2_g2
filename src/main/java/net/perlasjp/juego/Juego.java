package net.perlasjp.juego;

class Juego {
    
    private Jugador jugador;

    private Enemigo enemigo;

    private Combate combate;

    public void iniciar(){
        
        Scanner scanner = new Scanner(System.in);
        combate =new Combate ();
        Historia historia=new Historia();

        System.out.println("Bienvenido al juego de aventura");
        System.out.print("ingresa tu nombre:");
        String nombre = scanner.nextLine();
        jugador = new Jugador(nombre);

        historia.introduccion();

        while (true) {
            System.out.println("/n que deseas hacer?");
            System.out.println("1. Explorar");
            System.out.println("2. ver estado");
            System.out.println("3. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                Enemigo enemigo = new Enemigo("Goblin", 20);
                combate.iniciar(jugador, enemigo);
                break;
                case "2": 
                          //vamos a agregar otros metodos en jugador
                  break;
                case "3":
                   System.out.println("Gracias por jugar!");
                   return;
                default:
                System.out.println("opcion no valida.");   
            }
        
    }
    
}