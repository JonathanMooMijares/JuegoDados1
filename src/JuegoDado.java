public class JuegoDado {
    int cantidadJugada;
    Jugador jugador1;
    Jugador jugador2;
    int marcadorJugador1;
    int marcadorJugador2;
    Dado dado1;
    Dado dado2;
    private boolean bandJugador; //true = Jugador 1, false = Jugador2

    public void elegirPrimerLanzador(){
        if ((byte) (Math.random() * (3 - 1)) == 1){
            // jugador 1
            bandJugador = true;
        }
        else {
            // jugador 2
            bandJugador = false;
        }
    }

    public void iniciarJugada() {
        Jugada jugadaActual = new Jugada();

        if (this.bandJugador) {


            jugadaActual.iniciarJugada(this.jugador1, this.jugador2, this.dado1, this.dado2);
                this.dado1, this.dado2);
        }
    }
    public void iniciarJuego() {
        //Crear jugadores, dados, inicializar variables
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();

        this.dado1 = new Dado();
        this.dado2 = new Dado();

        this.cantidadJugada = 0;
        this.marcadorJugador1 = 0;
        this.marcadorJugador2 = 0;

        //Ciclo infinito de juego
        do {
            iniciarJugada();

            cantidadJugada++;
        } while ();

        elegirPrimerLanzador();



    }
}

//hacer un ciclo, iniciar primero con iniciar juego, luego elegirPrimerlanzador de manera aleatoria
//en elegirprimerlanzador hacer un ciclo, de ahí usar