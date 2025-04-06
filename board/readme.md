## Board de tarefas✅

Board de tarefas(jira/trello) com persistência no postgres e apresentação no console, criado com base no repo [da DIO](https://github.com/digitalinnovationone/board/tree/master) de um projeto prático.

---

### 💫Alterações:
* Alguns refactorings
* Remoção do lombok
* Alteração de MySQL para Postgres

---

### 🐋Pg no docker

Execução do comando para criar o docker:
```
docker run --name pg-board -e POSTGRES_USER=board -e POSTGRES_PASSWORD=board -p 5432:5432 -d postgres:16.2-alpine3.19
```