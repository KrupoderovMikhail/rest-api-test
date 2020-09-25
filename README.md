#Тестовое задание

###Запуск приложения
1. Создать базу данных PostgreSQL используя команду `CREATE DATABASE <name>;`
2. Заполнить данные в [application.yml](src/main/resources/application.yml)
3. Запустить приложение с помощью команды `mvn spring-boot:run`

###Примеры запросов

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