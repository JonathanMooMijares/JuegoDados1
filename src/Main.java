public class Main {
    public static void main(String[] args) {

        JuegoDado juego = new JuegoDado("Pedro", "José");
        juego.iniciarJuego();
        //juego.jugador1.nombre = "Pedro";
        //juego.jugador1.nombre = "José";
/*
        while (juego.vencedor != null){

        }
 */
        juego.iniciarJuego();
        if (juego.vencedor == null)
            System.out.println ("¡¡Empate!! No hay un vencedor");
        else
            System.out.println  ("El vencedor es: " +juego.vencedor.nombre);
    }
}