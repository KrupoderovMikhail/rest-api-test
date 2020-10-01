# Тестовое задание

### Запуск приложения
- Создать базу данных PostgreSQL используя команду `CREATE DATABASE <name>;`
- Добавить пользователей последовательно запустив [schema.sql](scripts/schema.sql) и [data.sql](scripts/data.sql) используя
команды(в корне проекта): 
```shell script
psql -U <username> -d <database-name> -f scripts/schema.sql
psql -U <username> -d <database-name> -f scripts/data.sql
```
- Заполнить данные в [application.yml](src/main/resources/application.yml)
- Запустить приложение с помощью команды `mvn spring-boot:run`

### Данные для входа
- Admin: `username: admin` `password: admin`
- User: `username: user` `password: user`

### Примеры запросов

Добавление пользователя

```shell script
curl --header "Content-Type: application/json" \
     --request POST \
     --data '{
            "firstName": "Michael",
            "lastName": "Smith",
            "age": 34,
            "gender": "MALE",
            "position": "Java Developer",
            "salary": 3000,
            "hireDate": "2020-04-25",
            "active": true
            }' \
     http://localhost:8080/api/v1/users
```

Удаление пользователя
```shell script
curl -X DELETE http://localhost:8080/api/v1/users/1
```

Получить конкретного пользователя
```shell script
curl -X GET http://localhost:8080/api/v1/users/1
```

Список пользователей
```shell script
curl -X GET http://localhost:8080/api/v1/users
```
