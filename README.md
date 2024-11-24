# Spring Boot JPA Application

Este é um projeto desenvolvido com **Spring Boot** utilizando **JPA/Hibernate** para gerenciamento de banco de dados, com deploy realizado na plataforma **Railway**. A aplicação utiliza um banco de dados **MySQL** hospedado na nuvem.

## Funcionalidades

- Gerenciamento de entidades como usuários, produtos, pedidos, categorias, pagamentos e itens de pedido.
- Relacionamentos mapeados entre as entidades utilizando **JPA**.
- API REST para manipulação das entidades e seus relacionamentos.
- Deploy configurado para execução em ambiente cloud.

## Estrutura do Projeto

### Pacotes principais:

1. **config**: Configurações gerais do projeto.
2. **entities**: 
   - Classes de domínio, como `User`, `Product`, `Category`, `Order`, entre outras.
   - Gerenciamento de relacionamentos entre entidades (e.g., OneToMany, ManyToOne).
3. **repositories**: Interfaces do **Spring Data JPA** para acesso ao banco de dados.
4. **services**: Lógica de negócio para manipulação das entidades.

### Outras pastas relevantes:
- **resources**: Arquivos de configuração e scripts, como `application.properties`.

## Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3.0+**
- **JPA / Hibernate**
- **MySQL**
- **Railway** (deploy na nuvem)

## Como Rodar o Projeto Localmente

1. Clone este repositório:
   ```bash
   git clone <url-do-repositorio>
   
2. Configuração do Banco de Dados

   **Certifique-se de ter o MySQL instalado localmente** ou configure para utilizar a conexão remota.
   
   Atualize as propriedades em `application.properties` para refletir suas credenciais do banco de dados.


4. Execute a aplicação utilizando o Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run

5. Acesse a aplicação no navegador através do seguinte endereço:

```arduino
http://localhost:8080
```

## Configuração de Deploy

A aplicação está configurada para deploy no **Railway**.

Certifique-se de configurar as **variáveis de ambiente** no painel do Railway para conexão com o banco de dados MySQL.

