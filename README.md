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

mysql > CREATE USER 'matchday'@'localhost' IDENTIFIED BY 'matchday';
