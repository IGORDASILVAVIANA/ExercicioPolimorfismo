package dominio;

public class EntregaEconomica extends Entrega{
    public EntregaEconomica(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularCusto() {
        double custo = (getDistancia() * 0.05) + (getPeso() * 1);
        System.out.println("Seu pedido será entregue em 20 dias úteis");
        return custo;
    }
}
