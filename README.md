Перед запуском программы нужно поднять Docker-контейнер Постгреса с параметрами, указанными в `application.yml`:
```
docker run -d \
  --name postgres_container \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=12345 \
  -e POSTGRES_DB=data_jpa \
  -p 5432:5432 \
  postgres
```
