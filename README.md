# Projeto Orientação a Objetos - Óculos

## Descrição

Este projeto foi desenvolvido como atividade prática da disciplina de Orientação a Objetos. O objetivo é representar um objeto do mundo real utilizando os conceitos fundamentais de Programação Orientada a Objetos (POO), como classes, atributos, métodos e encapsulamento.

A aplicação foi desenvolvida em Java e modelada utilizando um Diagrama de Classe UML.

## Objeto Representado

Óculos

A classe `Oculos` representa um par de óculos utilizado para melhorar a visão de uma pessoa. Ela possui características (atributos) e comportamentos (métodos) que simulam ações possíveis desse objeto no mundo real.

## Estrutura da Classe

### Atributos

| Atributo | Tipo   | Descrição                      |
| -------- | ------ | ------------------------------ |
| tamanho  | String | Representa o tamanho do óculos |
| modelo   | String | Indica o modelo do óculos      |
| grau     | double | Representa o grau da lente     |

### Métodos

#### ajustarGrau(double novoGrau)

Permite alterar o grau das lentes dos óculos. O método possui validação que impede valores negativos para manter o estado do objeto consistente.

#### trocarModelo(String novoModelo)

Permite alterar o modelo do óculos. O método possui validação para garantir que o modelo informado não esteja vazio.

## Exemplo de Uso

```java
Oculos oculos = new Oculos("Médio", "Esportivo", 2.0);

oculos.ajustarGrau(2.5);
oculos.trocarModelo("Clássico");
```

## Testes

No método `main` são realizados testes com valores válidos e inválidos para garantir que as validações dos métodos funcionem corretamente.

## Diagrama UML

O projeto inclui um Diagrama de Classe UML criado na ferramenta Astah. O arquivo do diagrama está disponível no repositório com o nome:

Oculos.asta

## Tecnologias Utilizadas

* Java
* Astah UML
* Git
* GitHub

## Estrutura do Projeto

```
projeto-oculos
│
├── Oculos.java
├── Oculos.asta
└── README.md
```

## Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Modelagem UML
* Versionamento de código



