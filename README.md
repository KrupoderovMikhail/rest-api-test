# �������� �������

### ������ ����������
- ������� ���� ������ PostgreSQL ��������� ������� `CREATE DATABASE <name>;`
- �������� ������������� ��������������� �������� [schema.sql](scripts/schema.sql) � [data.sql](scripts/data.sql) ���������
�������(� ����� �������): 
```shell script
psql -U <username> -d <database-name> -f scripts/schema.sql
psql -U <username> -d <database-name> -f scripts/data.sql
```
- ��������� ������ � [application.yml](src/main/resources/application.yml)
- ��������� ���������� � ������� ������� `mvn spring-boot:run`

### ������ ��� �����
- Admin: `username: admin` `password: admin`
- User: `username: user` `password: user`

### ������� ��������

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
     http://localhost:8080/api/v1/employees
```

�������� ������������
```shell script
curl -X DELETE http://localhost:8080/api/v1/employees/1
```

�������� ����������� ������������
```shell script
curl -X GET http://localhost:8080/api/v1/employees/1
```

������ �������������
```shell script
curl -X GET http://localhost:8080/api/v1/employees
```