//Gabrielly Campos Macedo RM558962
import org.example.Apdex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {
    private Apdex apdex;
    @BeforeEach
    public void arrange(){
        this.apdex = new Apdex();
    }

    @Test
    public void testValidarApdexExcelente(){
        //Apdex apdex = new Apdex();
        double result = apdex.validarApdex(558962,0,558962);
        assertEquals(1, result, 0.01);
    }

    @Test
    public void testValidarApdexBom(){
        //Apdex apdex = new Apdex();
        double result = apdex.validarApdex(490000,68962,558962);
        assertEquals(0.93, result, 0.01);
    }

    @Test
    public void testValidarApdexRazoavel(){
        //Apdex apdex = new Apdex();
        double result = apdex.validarApdex(330000,228962,558962);
        assertEquals(0.79, result, 0.01);
    }

    @Test
    public void testValidarApdexRuim(){
        //Apdex apdex = new Apdex();
        double result = apdex.validarApdex(200000,358962,558962);
        assertEquals(0.67, result, 0.01);
    }

    @Test
    public void testValidarApdexInaceitavel(){
        //Apdex apdex = new Apdex();
        double result = apdex.validarApdex(0,500000,558962);
        assertEquals(0.44, result, 0.01);
    }

}

