package example;


public class Veiculo {

    private Carroceria carroceria;

    private Motor motor;

    private Pneus pneus;


    public Veiculo(VeiculoAbstractFactory factory) {
        this.carroceria = factory.createCarroceira();
        this.motor = factory.createMotor();
        this.pneus = factory.createPneus();
    }

    public String encherPneus(){
        return this.pneus.encherPneus();
    }

    public String montarMotor(){
        return this.motor.montarMotor();
    }

    public String pintarCarroceria(){
        return this.carroceria.pintarCarroceria();
    }
}
