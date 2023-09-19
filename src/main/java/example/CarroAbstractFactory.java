package example;

public class CarroAbstractFactory implements VeiculoAbstractFactory{
    @Override
    public Motor createMotor() {
        return new MotorCarro();
    }

    @Override
    public Carroceria createCarroceira() {
        return new CarroceiraCarro();
    }

    @Override
    public Pneus createPneus() {
        return new PneusCarro();
    }
}
