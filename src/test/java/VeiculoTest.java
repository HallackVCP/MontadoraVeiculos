import example.CaminhaoAbstractFactory;
import example.CarroAbstractFactory;
import example.Veiculo;
import example.VeiculoAbstractFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {

    @Test
    void devePintarCarroceriaCaminhao() {
        VeiculoAbstractFactory factory = new CaminhaoAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Carroceria do caminhao pintada", veiculo.pintarCarroceria());
    }

    @Test
    void devePintarCarroceriaCarro() {
        VeiculoAbstractFactory factory = new CarroAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Carroceria do carro pintada", veiculo.pintarCarroceria());
    }

    @Test
    void deveMontarMotorCaminhao() {
        VeiculoAbstractFactory factory = new CaminhaoAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Motor do caminhao montado", veiculo.montarMotor());
    }

    @Test
    void deveMontarMotorCarro() {
        VeiculoAbstractFactory factory = new CarroAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Motor do carro montado", veiculo.montarMotor());
    }

    @Test
    void deveEncherPneusCaminhao() {
        VeiculoAbstractFactory factory = new CaminhaoAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Pneus do caminhao cheios", veiculo.encherPneus());
    }

    @Test
    void deveEncherPneusCarro() {
        VeiculoAbstractFactory factory = new CarroAbstractFactory();
        Veiculo veiculo = new Veiculo(factory);
        assertEquals("Pneus do carro cheios", veiculo.encherPneus());
    }


}
