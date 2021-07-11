# pet project
sudo docker run -p 5432:5432 --name postgres postgres:latest
sudo docker start postgres
sudo docker exec -it postgres bash
psql -d mydb -U admin
