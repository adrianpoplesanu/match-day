# match-day
Match Day sources

# AWS EC2 commands: ubuntu 20.04, free-tier machine

sudo apt install unzip
  
sudo apt install zip

curl -s "https://get.sdkman.io" | bash

sdk install java 8.0.292-open

sudo apt install mysql-server

sudo systemctl start mysql.service

sudo mysql_secure_installation

sudo mysql -u root

mysql> CREATE USER 'matchday'@'localhost' IDENTIFIED BY 'matchday';

mysql> GRANT CREATE, ALTER, DROP, INSERT, UPDATE, DELETE, SELECT, REFERENCES, RELOAD on *.* TO 'matchday'@'localhost' WITH GRANT OPTION;

mysql> FLUSH PRIVILEGES;

// grant did not work in this form in the docker container, however this worked: GRANT ALL PRIVILEGES ON *.* TO 'matchday'@'localhost';

// also had to run this in the container:
mysql> CREATE USER 'matchday'@'172.19.0.1' IDENTIFIED BY 'matchday';
Query OK, 0 rows affected (0.01 sec)

mysql> GRANT ALL PRIVILEGES ON *.* TO 'matchday'@'172.19.0.1';
Query OK, 0 rows affected (0.01 sec)

mysql> FLUSH PRIVILEGES;
Query OK, 0 rows affected (0.01 sec)

