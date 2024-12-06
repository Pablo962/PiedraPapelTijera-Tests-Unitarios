import org.junit.*;

public class testsPiedraPapelTijera {

    // Estrategia usando caminos

    @Test
    public void VictoriaJugador2PapelJugador1Piedra(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PIEDRA, PiedraPapelTijera.Jugada.PAPEL);
        Assert.assertEquals("Victoria Jugador 2", resultado);
    }

    @Test
    public void VictoriaJugador1PiedraJugador2Tijera(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PIEDRA, PiedraPapelTijera.Jugada.TIJERA);
        Assert.assertEquals("Victoria Jugador 1", resultado);
    }

    @Test
    public void EmpateConPiedra(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PIEDRA, PiedraPapelTijera.Jugada.PIEDRA);
        Assert.assertEquals("Empate", resultado);
    }

    @Test
    public void VictoriaJugador2TijeraJugador1Papel(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.TIJERA);
        Assert.assertEquals("Victoria Jugador 2", resultado);
    }

    @Test
    public void VictoriaJugador1PapelJugador2Piedra(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.PIEDRA);
        Assert.assertEquals("Victoria Jugador 1", resultado);
    }

    @Test
    public void EmpateConPapel(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PAPEL,PiedraPapelTijera.Jugada.PAPEL);
        Assert.assertEquals("Empate", resultado);
    }

    @Test
    public void VictoriaJugador2PiedraJugador1Tijera(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.TIJERA,PiedraPapelTijera.Jugada.PIEDRA);
        Assert.assertEquals("Victoria Jugador 2", resultado);
    }

    @Test
    public void VictoriaJugador1TijeraJugador2Papel(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.TIJERA,PiedraPapelTijera.Jugada.PAPEL);
        Assert.assertEquals("Victoria Jugador 1", resultado);
    }

    @Test
    public void EmpateConTijera(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.TIJERA,PiedraPapelTijera.Jugada.TIJERA);
        Assert.assertEquals("Empate", resultado);
    }

    @Test 
    public void testDefaultCase(){
        Assert.assertThrows(IllegalArgumentException.class, () ->{
            PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.valueOf("valorNoValido"), PiedraPapelTijera.Jugada.PIEDRA);
        });
    }

    // Estrategia usando particiones

    /*
        Particion 1 = Jugador 1 Valido y Jugador 2 Null
        Particion 2 = Jugador 1 Null y Jugador 2 Valido
        Particion 3 = Jugador 1 Valido y Jugador 2 valor Invalido
        Particion 4 = Jugador 1 Invalido y Jugador 2 Valido
     */

    @Test
    public void EmpateConJugador2Null(){
        String resultado = PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PIEDRA, null);
        Assert.assertEquals("Empate", resultado);
    }

    @Test
    public void ErrorConJugador1Nulo() {
        Assert.assertThrows(NullPointerException.class, () -> PiedraPapelTijera.jugar(null, PiedraPapelTijera.Jugada.PIEDRA));
    }

    @Test
    public void ErrorConJugador2Invalido() {
        Assert.assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.PIEDRA, PiedraPapelTijera.Jugada.valueOf("valorNoValido")));
    }

    @Test
    public void ErrorConJugador1Invalido() {
        Assert.assertThrows(IllegalArgumentException.class, () -> PiedraPapelTijera.jugar(PiedraPapelTijera.Jugada.valueOf("valorNoValido"), PiedraPapelTijera.Jugada.PIEDRA));
    }

}
