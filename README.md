<h1 align="center">
  TODO List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=LinkedIN&message=Lucas Meira&color=8257E5&labelColor=000000" alt="@Lucasomeira" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

<p align="center">
  API para gerenciar Clientes(CRUD)
</p>


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [PostgreSQL](https://www.postgresql.org/download/)

## Práticas adotadas

- SOLID, DRY
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências


## API Endpoints

- Criar Client 
```
$ POST :8080/client 

[
  {
    "name" : "ExampleName"
  }
]
```

- Listar Client
```
$ http GET :8080/client/{id}

```
- Listar todos Clients
```
$ http GET :8080/client/

```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1
[
  {
    "name" : "ExampleName"
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```
