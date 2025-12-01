package dominio;

public class EntregaExpressa extends Entrega{
    public EntregaExpressa(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularCusto() {
        double custo = (getDistancia() * 0.10) + (getPeso() * 2) + 10;
        System.out.println("Seu pedido será entregue em até 2 dias úteis");
        return custo;
    }
}
