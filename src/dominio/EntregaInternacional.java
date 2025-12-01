package dominio;

public class EntregaInternacional extends Entrega{
    public EntregaInternacional(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularCusto() {
        System.out.println("Seu pedido será entregue em até 15 dias úteis");
        return (getDistancia() * 0.15) + (getPeso() * 3) + 30;

    }
}
