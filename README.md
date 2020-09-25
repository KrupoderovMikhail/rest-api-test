#�������� �������

###������ ����������
1. ������� ���� ������ PostgreSQL ��������� ������� `CREATE DATABASE <name>;`
2. ��������� ������ � [application.yml](src/main/resources/application.yml)
3. ��������� ���������� � ������� ������� `mvn spring-boot:run`

###������� ��������

���������� ������������

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

�������� ������������
```shell script
curl -X DELETE http://localhost:8080/api/v1/users/1
```

�������� ����������� ������������
```shell script
curl -X GET http://localhost:8080/api/v1/users/1
```

������ �������������
```shell script
curl -X GET http://localhost:8080/api/v1/users
```