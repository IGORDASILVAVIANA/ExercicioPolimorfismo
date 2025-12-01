package dominio;

public class EntregaEconomica extends Entrega{
    public EntregaEconomica(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularCusto() {
        System.out.println("Seu pedido será entregue em 20 dias úteis");
        return (getDistancia() * 0.05) + (getPeso() * 1);
    }
}
