package dominio;

public abstract class Entrega implements Relatorio{
    private double distancia;
    private double peso;

    public Entrega(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    public abstract double calcularCusto();

    @Override
    public void detalhesEntrega(){
        System.out.println("Distância: " + getDistancia());
        System.out.println("Peso " + getPeso());
        System.out.println("Custo: " + calcularCusto());
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
