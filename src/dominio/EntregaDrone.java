package dominio;

public class EntregaDrone extends Entrega{
    public EntregaDrone(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularCusto() {
        if (getDistancia() <= 50.0 && getPeso() <= 10.0){
            double custo = (getDistancia() * 4.00) + (getPeso() * 0.15);
            System.out.println("Entrega em até 1 dia útil");
            return custo;
        } else {
            return 0.0;
        }
    }
}
