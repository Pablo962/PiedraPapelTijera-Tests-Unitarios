import org.junit.*;

public class testsPiedraPapelTijera {

    @Test
    public void Empate(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.PAPEL);
        Assert.assertEquals("Empate", resultado);
    }

    @Test
    public void VictoriaJugador1(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.PIEDRA);
        Assert.assertEquals("Victoria Jugador 1", resultado);
    }

    @Test
    public void VictoriaJugador2(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.TIJERA);
        Assert.assertEquals("Victoria Jugador 2", resultado);
    }


}
