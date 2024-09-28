
# Projeto de Transporte com WebFlux

## Descrição
Este projeto é uma aplicação de Transporte
desenvolvida em Java Spring utilizando WebFlux, Swagger, Docker e Kubernetes. 
Ele inclui funcionalidades de CRUD utilizando `CrudRepository` e `JpaRepository`.

## Tecnologias Utilizadas
- **Java**
- **Spring WebFlux**
- **Swagger**
- **Docker**
- **Kubernetes**
- **Maven**
- **SQL**

## Estrutura do Projeto
- `veiculos-gj-eureka-server`: Serviço Eureka para descoberta de serviços.
- `transporte-webflux-gj`: Serviço principal utilizando WebFlux.
- `veiculos-k8s-gj-spring`:Serviço que gerencia veiculos

## Pré-requisitos
- Docker
- Kubernetes
- Maven********
- JDK 17

## Como Executar

### Usando Docker
1. Navegue até o diretório `veiculos-gj-eureka-server` e construa a imagem Docker:
    ```sh
    docker build -t veiculos-gj-eureka-server .
    ```

2. Navegue até o diretório `transporte-webflux-gj` e construa a imagem Docker:
    ```sh
    docker build -t transporte-webflux-gj .
    ```

3. Execute os containers:
    ```sh
    docker run -p 8761:8761 veiculos-gj-eureka-server
    docker run -p 8080:8080 transporte-webflux-gj
    ```

### Usando Kubernetes
1. Aplique o arquivo de deployment:
    ```sh
    kubectl apply -f kubernet-deploy.yaml
    ```

## Documentação da API
A documentação da API pode ser acessada via Swagger na seguinte URL:
```
http://localhost:8080/swagger-ui.html
```

## Repositórios
### CrudRepository
Utilizado para operações CRUD básicas.

### JpaRepository
Utilizado para operações CRUD avançadas e consultas personalizadas.


## Imagem Docker
A imagem Docker pode ser encontrada no seguinte link:
[Imagem Docker](https://hub.docker.com/r/gabj/webflux-eureka-server-imagem)

