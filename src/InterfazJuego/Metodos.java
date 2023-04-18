package InterfazJuego;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import juegocartas.Juego;
import juegocartas.Jugador;
import juegocartas.RegistroJugadores;

/**
 * Clase Metodos, contiene métodos estaricos sueltos
 * @author Disco Duro de Roer
 */
public class Metodos {

    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    
    public static void mostrarImagen(JLabel lbl, String ruta){
        
        lbl.setIcon(new ImageIcon(ruta));
        
    }
    
    public static void desactivarBotones(JButton btnPasarTurno, JButton btnTomarCarta ){
        btnPasarTurno.setEnabled(false);
        btnTomarCarta.setEnabled(false);
    }
    public static void ganar(Juego juego, double puntos, int MAZO, int JUGADOR, InterfazJuego fm, RegistroJugadores lista){
        if(juego.listaJugadores.getRegistroJugadores().get(JUGADOR-1).getPuntos() == juego.limitePuntos(MAZO)){
            Jugador jugadorG = juego.ganador();
            JDialog dialog = new JDialog(fm, "Ganador");
            JLabel mensaje = new JLabel("FELICIDADES JUGADOR "+jugadorG+" HAS GANADO CON "+jugadorG.getPuntos()+" puntos");
            dialog.add(mensaje);
            dialog.setSize(500, 500);
            dialog.setVisible(true);
            fm.desactivarBotones();
            //jugadorGanador.datosGanador(1, 10.5);
            
        }
        else if(juego.listaJugadores.getRegistroJugadores().get(JUGADOR-1).getPuntos() > juego.limitePuntos(MAZO)){
            juego.listaJugadores.getRegistroJugadores().remove(JUGADOR-1);
            Jugador jugadorG = juego.ganador();
            //GanadorJuego jugadorGanador = new GanadorJuego(fm, true);
            
            fm.desactivarBotones();
            JDialog dialog = new JDialog(fm, "Ganador");
            JLabel mensaje = new JLabel("FELICIDADES JUGADOR "+JUGADOR+" HAS GANADO CON "+jugadorG.getPuntos()+" puntos");
            dialog.add(mensaje);
            dialog.setSize(500, 500);
            dialog.setVisible(true);
            //jugadorGanador.datosGanador(1, 10.5);
        }
       /*if(juego.puntosSobrepasados(puntos, MAZO1, JUGADOR, lista)==true){
            //juego.ganador();
            //desactivarBotones();
            //InterfazGanador ganador = new InterfazGanador();
            //ganador.setVisible(true);
            GanadorJuego jugadorGanador = new GanadorJuego(fm, true);
            jugadorGanador.setVisible(true);
            jugadorGanador.datosGanador(JUGADOR, puntos);
            fm.desactivarBotones();
        }
        else if(juego.puntosExactos(puntos, MAZO1, JUGADOR)){
            //desactivarBotones();
            //InterfazGanador ganador = new InterfazGanador();
            //ganador.setVisible(true);
            GanadorJuego jugadorGanador = new GanadorJuego(fm, true);
            jugadorGanador.datosGanador(JUGADOR, puntos);
            jugadorGanador.setVisible(true);
            fm.desactivarBotones();
        }*/
    }

}
