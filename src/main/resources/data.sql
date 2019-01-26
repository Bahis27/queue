create database example;
use example;
drop table if exists queue;
drop table if exists averagetimeout;

CREATE TABLE averagetimeout (
                              id int(11) NOT NULL AUTO_INCREMENT,
                                servicecode int(11) NOT NULL,
                                averagetime int(11) NOT NULL,
                                PRIMARY KEY (id)
);

CREATE TABLE `queue` (
                       id int(11) NOT NULL AUTO_INCREMENT,
                       servicecode int(11)  NOT NULL,
                       departmentcode int(11) NOT NULL,
                       operationindex char(1) NOT NULL,
                       queueno int(11) NOT NULL,
                       jointime datetime NOT NULL,
                       codestatus int(11) NOT NULL,
                       PRIMARY KEY (id),
                       foreign key(id) references averagetimeout(id)
);

INSERT INTO `averagetimeout` VALUES (1,1,1000);

INSERT INTO `queue` VALUES (1,1,13370,'A',153,'2019-01-26 14:49:16',1);


