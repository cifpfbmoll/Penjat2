package test;

import com.jaume.penjat.Puntuacio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PuntuacioTest {

    private Puntuacio puntuacio = new Puntuacio();
    @Test
    void getParaulaSecretaDificultatNumeroForaDeRang() {
        assertEquals("err", puntuacio.getParaulaSecretaDificultat(4), "Ha hagut un error, s'esperava: err");
    }

}