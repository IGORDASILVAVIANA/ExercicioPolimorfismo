package dominio;

public class EntregaDrone extends Entrega{
    public EntregaDrone(double distancia, double peso) {
        super(distancia, peso, "Entrega por Drone");
    }

    @Override
    public double calcularCusto() {
        if (getDistancia() <= 50.0 && getPeso() <= 10.0){
            System.out.println("Entrega em até 1 dia útil");
            return (getDistancia() * 4.00) + (getPeso() * 0.15);
        } else {
//          -1 indica que o drone não pode fazer a entrega
            return -1;
        }
    }
}
