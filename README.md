# Sistema de Controle de Vendas

Projeto desenvolvido em Java utilizando Programação Orientada a Objetos (POO), interface gráfica Swing e banco de dados Microsoft Access através da biblioteca UCanAccess.

## 📋 Descrição

O sistema permite realizar o gerenciamento de vendas de produtos, possibilitando:

- Consultar produtos cadastrados
- Inserir novas vendas
- Alterar informações de vendas
- Excluir registros
- Calcular automaticamente o valor total a pagar

O projeto foi desenvolvido como atividade prática da disciplina de Programação Orientada a Objetos da FATEC.

---

## 🛠 Tecnologias Utilizadas

- Java SE
- Java Swing
- JDBC
- Microsoft Access (.accdb)
- UCanAccess
- NetBeans IDE 8.2

---

## 📂 Estrutura do Projeto

```
src
│
├── fatec.poo.basedados
│   └── BD_Vendas.accdb
│
├── fatec.poo.control
│   ├── DaoVenda.java
│   └── PreparaConexao.java
│
├── fatec.poo.model
│   └── Venda.java
│
└── fatec.poo.view
    └── VendaGui.java
```

---

## 📌 Funcionalidades

### Consultar

Permite localizar uma venda através do código informado.

### Incluir

Cadastra uma nova venda contendo:

- Código
- Descrição
- Preço Unitário
- Quantidade Vendida

### Alterar

Atualiza o preço unitário e a quantidade vendida de um produto já cadastrado.

### Excluir

Remove uma venda do banco de dados mediante confirmação do usuário.

### Cálculo Automático

O valor total é calculado pela fórmula:

```java
Valor Total = Preço Unitário × Quantidade Vendida
```

---

## 🗄 Banco de Dados

Tabela utilizada:

### tblVendas

| Campo | Tipo |
|---------|---------|
| Codigo_Vend | Inteiro |
| Descricao_Vend | Texto |
| PrecUnit_Vend | Moeda/Número |
| QtdeVendida_Vend | Inteiro |

---

## 🔌 Configuração da Conexão

A conexão é realizada através da classe `PreparaConexao`.

Exemplo:

```java
prepCon = new PreparaConexao("", "");
prepCon.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
prepCon.setConnectionString(
"jdbc:ucanaccess://caminho_do_banco/BD_Vendas.accdb");
```

---

## 📦 Bibliotecas Necessárias

Adicionar ao projeto:

- ucanaccess-3.0.3.1.jar
- jackcess-2.1.3.jar
- commons-lang-2.6.jar
- commons-logging-1.1.1.jar
- hsqldb.jar

---

## ▶ Como Executar

1. Abrir o projeto no NetBeans.
2. Adicionar todas as bibliotecas necessárias.
3. Ajustar o caminho do banco de dados na classe `VendaGui`.
4. Executar a classe:

```java
VendaGui.java
```

---

## 🖥 Interface

A aplicação possui uma interface gráfica simples desenvolvida com Java Swing contendo:

- Campo Código
- Campo Descrição
- Campo Preço Unitário
- Campo Quantidade Vendida
- Campo Valor a Pagar
- Botões:
  - Consultar
  - Incluir
  - Alterar
  - Excluir
  - Sair

---

## 📚 Conceitos Aplicados

- Programação Orientada a Objetos
- Encapsulamento
- Classes e Objetos
- MVC Simplificado
- JDBC
- CRUD
- Tratamento de Exceções
- Interface Gráfica com Swing

---

## 👨‍💻 Autor

**Matheus Lourenço Duarte**

Estudante de Análise e Desenvolvimento de Sistemas – FATEC Itu.

GitHub: https://github.com/Matheus5404
