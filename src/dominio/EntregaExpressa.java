package dominio;

public class EntregaExpressa extends Entrega{
    public EntregaExpressa(double distancia, double peso) {
        super(distancia, peso, "Entrega Expressa");
    }

    @Override
    public double calcularCusto() {
        System.out.println("Seu pedido será entregue em até 2 dias úteis");
        return (getDistancia() * 0.10) + (getPeso() * 2) + 10;
    }
}
