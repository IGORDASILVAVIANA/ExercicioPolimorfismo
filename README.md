📦 Sistema de Entregas — Exercício de Polimorfismo (Java)

Este projeto foi desenvolvido com o objetivo de praticar e reforçar conceitos de Polimorfismo em Java, utilizando herança, classes abstratas, sobrescrita de métodos e interfaces.
O sistema simula diferentes tipos de entregas, cada uma com sua própria forma de calcular o custo.

🎯 Objetivos do Projeto
Aplicar polimorfismo através da classe abstrata Entrega

Criar implementações específicas:

EntregaExpressa
EntregaEconomica
EntregaInternacional
EntregaDrone

Reforçar conceitos de:

Sobrescrita de métodos
Classes abstratas
Interface (utilizada para padronizar o método de detalhes)

🧩 Estrutura do Projeto
src/
 └── dominio/
      ├── Entrega.java               (classe abstrata base)
      ├── EntregaDrone.java
      ├── EntregaExpressa.java
      ├── EntregaEconomica.java
      ├── EntregaInternacional.java
 └── test/
      └── SistemaDeEntregas.java     (classe principal)

🛠 Como funciona

Cada classe filha sobrescreve:

calcularCusto()
detalhesEntrega()

A classe principal cria os objetos de cada tipo de entrega e exibe os detalhes de forma polimórfica.

Exemplo básico (já no seu código):

Entrega entregaDrone = new EntregaDrone(1000, 10.0);
entregaDrone.detalhesEntrega();

🚁 Regra especial: EntregaDrone

Só aceita entregas:
Até 50 km
Até 10 kg

Caso os critérios não sejam atendidos, retorna -1 no custo.

📌 Tecnologias Utilizadas
Java 17+
IntelliJ IDEA
Programação Orientada a Objetos (OOP)

📚 Aprendizados

Polimorfismo aplicado a cálculos diferentes com a mesma assinatura de método
Organização de pacotes
Interface + classe abstrata
Sobrescrita de métodos
Regras específicas por tipo de entrega
