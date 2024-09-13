# Web Services com Spring Boot, JPA e Hibernate

Este projeto é uma aplicação de exemplo para a criação de serviços web usando **Spring Boot**, **JPA** e **Hibernate**, seguindo as melhores práticas de desenvolvimento.

## Objetivos

- Criar um projeto Spring Boot Java.
- Implementar um modelo de domínio completo.
- Estruturar camadas lógicas: resource, service, repository.
- Configurar um banco de dados de teste (H2).
- Povoar o banco de dados automaticamente.
- Realizar operações CRUD (Create, Retrieve, Update, Delete).
- Implementar tratamento de exceções padronizado.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **JPA/Hibernate**
- **H2 Database** para testes
- **PostgreSQL** (opcional para produção)
- **Maven** como gerenciador de dependências

## Estrutura do Projeto

O projeto está organizado em camadas para promover a separação de responsabilidades:

- **Resource**: Controladores REST que expõem as APIs.
- **Service**: Regras de negócio.
- **Repository**: Comunicação com o banco de dados através do JPA.
- **Model**: Entidades do domínio.

## Funcionalidades

- Cadastro de usuários, produtos, categorias e pedidos.
- Relacionamentos entre entidades (one-to-many, many-to-many).
- Tratamento de exceções customizado.
- Inserção automática de dados para testes.
- Implementação de CRUD para entidades principais.


### Pré-requisitos

- Java 17+
- Maven 3+
- Banco de dados H2 (já configurado para ambiente de testes).


## Contato

Autor: Derek Rabelo  
E-mail: [drk.diniz@gmail.com](mailto:drk.diniz@gmail.com)  
GitHub: [https://github.com/drkdiniz](https://github.com/drkdiniz)


