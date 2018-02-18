# install the database in a docker container
Should be noted that this is very manual at this time but I hope to move this to ansible.

## install install tools for mac
sudo easy_install pip

pip install docker

sudo pip install docker-py


## install mariadb docker(this should start on mac startup)
### Review https://mariadb.com/kb/en/library/installing-and-using-mariadb-via-docker/
docker search mariadb

docker pull mariadb:10.2

docker images

docker run --name mariadb-locker -e MYSQL_ROOT_PASSWORD=mylockerpass  -p 3307:3306 -d mariadb:10.2 

docker ps

## import process
mysql -u root -p -h 0.0.0.0 -P 3307 < AllThree.sql

### We should create the app user when importing the data
mysql -u root -p -h 0.0.0.0 -P 3307

CREATE USER 'mylocker_app'@'localhost' IDENTIFIED BY 'mylockerpass_app';

GRANT ALL ON archieverecords.* TO 'mylocker_app'@'localhost';

GRANT ALL ON freezer.* TO 'mylocker_app'@'localhost';

GRANT ALL ON lockerdata.* TO 'mylocker_app'@'localhost';

use archieverecords;
alter table `cash report sheet` CHANGE `CURING & SEASONING` `CURINGANDSEASONING` decimal(19,4) DEFAULT NULL;
use lockerdata;
alter table `cash report sheet` CHANGE `CURING & SEASONING` `CURINGANDSEASONING` decimal(19,4) DEFAULT NULL;
alter table `xdeposits` change `xAction#` `xActionNumber` bigint(20) NOT NULL;

## how to access mysql from command line
mysql -u root -p -h 0.0.0.0 -P 3307

