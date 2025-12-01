package test;

import dominio.*;

import java.util.ArrayList;

public class SistemaDeEntregas {
    public static void main(String[] args) {
        Entrega entregaDrone = new EntregaDrone(50, 5);
        Entrega entregaExpressa = new EntregaExpressa(1000, 10.0);
        Entrega entregaInternacional = new EntregaInternacional(1000, 10.0);
        Entrega entregaEconomica = new EntregaEconomica(1000, 10.0);

        ArrayList<Entrega> listaEntregas = new ArrayList<>();
        listaEntregas.add(entregaExpressa);
        listaEntregas.add(entregaEconomica);
        listaEntregas.add(entregaInternacional);
        listaEntregas.add(entregaDrone);

        for (Entrega entregas : listaEntregas) {
            entregas.detalhesEntrega();
            System.out.println("==============");
        }

    }
}
