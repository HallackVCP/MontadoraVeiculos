package example;

public interface VeiculoAbstractFactory {

    Motor createMotor();

    Carroceria createCarroceira();

    Pneus createPneus();
}
