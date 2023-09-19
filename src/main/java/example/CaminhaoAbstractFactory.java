package example;

public class CaminhaoAbstractFactory implements VeiculoAbstractFactory{
    @Override
    public Motor createMotor() {
        return new MotorCaminhao();
    }

    @Override
    public Carroceria createCarroceira() {
        return new CarroceriaCaminhao();
    }

    @Override
    public Pneus createPneus() {
        return new PneusCaminhao();
    }
}
