import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.example.Calculo;

public class CalculadoraTeste {
    @Test
    public void testeSomaDoisNumeros() {
        Calculo calc = new Calculo();

        double soma = calc.somar(12, 13);
        assertEquals(25.0, soma, 0.0001); // Compara valores do tipo double com precisão
    }

    @Test
    public void testeSubtracaoDoisNumeros() {
        Calculo calc = new Calculo();

        double subtracao = calc.subtrair(12, 2);
        assertEquals(10, subtracao, 0.00000001); // Compara valores do tipo double com precisão
    }

    @Test
    public void testeMultiplicacaoDoisNumeros() {
        Calculo calc = new Calculo();

        double multiplicacao = calc.multiplicar(12, 2);
        assertEquals(24, multiplicacao, 0.000000001); // Compara valores do tipo double com precisão
    }

    @Test
    public void testeDivisaoDoisNumeros() {
        Calculo calc = new Calculo();

        double divisao = calc.dividir(12, 2);
        assertEquals(6, divisao, 0.00000001); // Compara valores do tipo double com precisão
    }

    @Test
    public void testePotenciaoDoisNumeros() {
        Calculo calc = new Calculo();

        double potenciacao = calc.potenciar(2, 2);
        assertEquals(4, potenciacao, 0.0000001); // Compara valores do tipo double com precisão
    }
}
