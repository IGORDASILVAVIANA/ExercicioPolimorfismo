package dominio;

public abstract class Entrega implements Relatorio{
    private double distancia;
    private double peso;
    private String tipo;

    public Entrega(double distancia, double peso, String tipo) {
        this.distancia = distancia;
        this.peso = peso;
        this.tipo = tipo;
    }

    public abstract double calcularCusto();

    @Override
    public void detalhesEntrega(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Distância: " + getDistancia());
        System.out.println("Peso " + getPeso());
        System.out.println("Custo: R$ " + calcularCusto());
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
