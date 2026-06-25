# 📖 Projeto JogaJunto

## Sobre o Projeto

O **JogaJunto** é um sistema desenvolvido em **Java** com o objetivo de gerenciar competições esportivas, permitindo o cadastro de equipes, criação de campeonatos e gerenciamento de partidas.

O projeto foi criado com foco na aplicação prática dos conceitos de **Programação Orientada a Objetos (POO)**, persistência de dados em banco de dados relacional e utilização de padrões de projeto para garantir maior organização, escalabilidade e manutenção do código.

---

# 🚀 Funcionalidades

O sistema oferece as seguintes funcionalidades:

* ✅ Cadastro de equipes (clubes);
* ✅ Listagem de equipes cadastradas;
* ✅ Remoção de equipes;
* ✅ Criação de competições;
* ✅ Associação de equipes a competições;
* ✅ Cadastro de partidas;
* ✅ Registro de súmulas (placares das partidas);
* ✅ Persistência dos dados em banco PostgreSQL.

---

# 🛠️ Tecnologias Utilizadas

* **Java**
* **PostgreSQL**
* **JDBC**
* **Programação Orientada a Objetos (POO)**
* **Padrão DAO (Data Access Object)**
* **Padrão Singleton**
* **Git e GitHub**

---

# 🏗️ Arquitetura do Projeto

O sistema foi estruturado seguindo uma arquitetura em camadas, visando maior organização, reutilização e manutenção do código.

## Camada de Entidades

Responsável por representar os objetos do sistema:

* **Equipe**
* **Competição**
* **Partida**

Cada entidade encapsula seus atributos e comportamentos utilizando os princípios da orientação a objetos.

## Camada DAO

Responsável pelo acesso ao banco de dados, contendo todas as operações de persistência:

* **EquipeDAO**
* **CompeticaoDAO**
* **PartidaDAO**

A utilização do padrão **DAO** promove a separação entre regras de negócio e acesso aos dados.

## Conexão com Banco de Dados

A conexão com o banco de dados é gerenciada pela classe **DBConnection**, implementada utilizando o padrão **Singleton**, garantindo a existência de apenas uma instância de conexão durante toda a execução da aplicação.

---

# 🗄️ Banco de Dados

O projeto utiliza o **PostgreSQL** como Sistema Gerenciador de Banco de Dados (SGBD).

## Principais Tabelas

### `equipe`

Armazena os clubes cadastrados.

### `competicao`

Armazena os campeonatos e torneios.

### `partida`

Armazena as partidas realizadas, relacionando equipes e competições.

---

# 📋 Exemplo de Fluxo do Sistema

1. Cadastrar equipes;
2. Criar uma competição;
3. Adicionar equipes à competição;
4. Cadastrar partidas entre as equipes;
5. Registrar o resultado das partidas através da súmula.

---

# 🎯 Objetivos Acadêmicos

Este projeto teve como principal objetivo consolidar conhecimentos em:

* Programação Orientada a Objetos;
* Persistência de dados utilizando JDBC;
* Modelagem relacional;
* Utilização de padrões de projeto;
* Organização de código em camadas;
* Desenvolvimento de aplicações Java integradas a banco de dados.

---

# 📈 Evolução do Projeto JogaJunto – 2º Bimestre

## Visão Geral

Durante este bimestre, a evolução do projeto **JogaJunto** foi significativa, demonstrando avanços importantes tanto na organização da aplicação quanto na qualidade do desenvolvimento.

O foco principal esteve na melhoria da arquitetura do sistema, na implementação de boas práticas de programação e na criação de uma base sólida para futuras expansões.

---

## 🔧 Melhorias Implementadas

### Estruturação das DAOs

Foi realizada a separação e organização dos arquivos responsáveis pelo acesso aos dados por meio da implementação das **DAOs (Data Access Objects)**.

Essa mudança proporcionou uma melhor divisão de responsabilidades dentro do projeto, tornando o código mais limpo, modular e de fácil manutenção.

### Implementação do Padrão Singleton

Outra melhoria relevante foi a adoção do padrão de projeto **Singleton** para o gerenciamento da conexão com o banco de dados.

Com essa abordagem, garante-se a existência de uma única instância de conexão durante a execução da aplicação, reduzindo o consumo de recursos e aumentando a eficiência do sistema.

### Aprimoramento da Arquitetura

O projeto passou por uma reestruturação arquitetural visando maior escalabilidade e organização.

Foram definidos padrões para a separação das camadas da aplicação, permitindo uma melhor comunicação entre interface, regras de negócio e persistência de dados.

### Regras de Negócio

Também foram implementadas e refinadas diversas regras de negócio essenciais para o funcionamento da plataforma.

Essa etapa contribuiu para aumentar a confiabilidade do sistema, garantindo que as funcionalidades operem de acordo com os requisitos estabelecidos.

---

## 📊 Resultados Obtidos

As melhorias realizadas neste bimestre resultaram em:

* Código mais organizado e de fácil manutenção;
* Maior reutilização de componentes;
* Melhor separação de responsabilidades entre as camadas do sistema;
* Maior eficiência no gerenciamento de conexões;
* Base arquitetural preparada para futuras funcionalidades;
* Aplicação mais robusta, escalável e alinhada às boas práticas de desenvolvimento de software.

---

## ✅ Conclusão

O desenvolvimento realizado durante este bimestre representou um importante avanço para o projeto **JogaJunto**.

A adoção de padrões de arquitetura, a organização das DAOs, a implementação do Singleton e o fortalecimento das regras de negócio contribuíram para elevar a qualidade técnica da aplicação, preparando-a para novas funcionalidades e para um crescimento sustentável ao longo do desenvolvimento.
