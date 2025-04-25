# Prova01
Prova 01 - Arquitetura de Aplicações Web

# Sistema de Gerenciamento de Produtos e Categorias

## Tecnologias Utilizadas:
- Java 21
- Spring Boot
- Spring Data JPA
- Lombok
- MariaDB
- Postman para testes

## Configuração XAMPP:
- Verificar se o MariaDB está sendo usado.
- Start "Apache" e "MySQL".

## Relacionamento:
- Um Produto pertence a uma Categoria.
- Uma Categoria pode conter vários Produtos (One-to-Many).

## Estrutura:
- "Produto.java" e "Categoria.java": Entidades JPA
- "ProdutoController" e "CategoriaController": Endpoints RESTful
- "ProdutoRepository" e "CategoriaRepository": Camada de persistência

## Como rodar:
1. Inicie o MariaDB via XAMPP.
- Start "Apache" e "MySQL".
2. Crie o banco "db_produtocategoria".
- Clicar em Admin do MySQL no XAMPP.
- Será aberto o link da interfaxce na web do phpMyAdmin.
- Clique em "Novo" no canto superior esquerdo.
- Adicione o nome do banco(db_produtocategoria).
- Criar.
3. Adicione o endereço do banco no "application.properties".
- java/com/exemplo/demo/resources
4. Execute a aplicação com "mvn spring-boot:run".
5. Teste os endpoints com ferramentas como Postman da seguinte forma:
- Criar uma Categoria
POST: http://localhost:8080/categorias
Body(JSON):
{
  "nome": "...",
  "descricao": "..."
}

- Criar um Produto vinculando a Categoria
POST: http://localhost:8080/produtos
Body(JSON):
{
  "nome": "...",
  "preco": ...,
  "descricao": "...",
  "categoria": {
    "id": 1
  }
} 

- Listar Produtos
GET: http://localhost:8080/produtos

- Atualizar um Produto
PUT: http://localhost:8080/produtos/1
Body(JSON):
{
  "nome": "...",
  "preco": ...,
  "descricao": "...",
  "categoria": {
    "id": 1
  }
}
  
- Deletar um Produto
DELETE: http://localhost:8080/produtos/1

6. Verificar pelo phpMyAdmin as movimentações através dos endpoints sendo feitas no banco.
