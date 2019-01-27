create database example;
use `example`;
drop table if exists `queue`;
drop table if exists `employee`;
drop table if exists `averagetimeout`;

CREATE TABLE `averagetimeout` (
                                id int(11) NOT NULL AUTO_INCREMENT,
                                servicecode int(11) NOT NULL,
                                averagetime int(11) NOT NULL,
                                PRIMARY KEY (id)
);

CREATE TABLE `employee` (
                          id int(255) NOT NULL AUTO_INCREMENT,
                          firstname char(100) NOT NULL,
                          lastname char(100) NOT NULL,
                          middlename char(100) NOT NULL,
                          numbergoodestimation int not null ,
                          numbermiddleestimation int not null,
                          numberbadestimation int not null ,

                          PRIMARY KEY (id)
);

CREATE TABLE `queue` (
                       id int(11) NOT NULL AUTO_INCREMENT,
                       averagetimeoutid int(11) NOT NULL,
                       departmentcode int(11) NOT NULL,
                       operationindex char(1) NOT NULL,
                       queueno int(11) NOT NULL,
                       jointime datetime NOT NULL,
                       codestatus int(11) NOT NULL,
                       employeeid int(255) NOT NULL,
                       PRIMARY KEY (id),
                       foreign key(averagetimeoutid) references averagetimeout(id),
                       foreign key(employeeid) references employee(id)
);

INSERT INTO `employee` VALUES (1,'Ivanov','Ivan','Ivanovich', 1,1,1);

INSERT INTO `averagetimeout` VALUES (1,1,7);
INSERT INTO `averagetimeout` VALUES (2,2,5);
INSERT INTO `averagetimeout` VALUES (3,3,6);
INSERT INTO `averagetimeout` VALUES (4,4,3);
INSERT INTO `averagetimeout` VALUES (5,5,4);

INSERT INTO `queue` VALUES (1,1,13370,'A',153,'2019-01-26 14:49:16',1,1);
INSERT INTO `queue` VALUES (2,1,13370,'A',154,'2019-01-26 14:51:10',1,1);
INSERT INTO `queue` VALUES (3,3,13370,'C',75,'2019-01-26 14:52:14',1,1);
INSERT INTO `queue` VALUES (4,2,13370,'B',27,'2019-01-26 14:56:26',1,1);
INSERT INTO `queue` VALUES (5,1,13370,'A',155,'2019-01-26 15:01:11',1,1);
INSERT INTO `queue` VALUES (6,1,13370,'A',156,'2019-01-26 15:03:37',1,1);
INSERT INTO `queue` VALUES (7,4,13370,'D',15,'2019-01-26 15:06:23',1,1);
INSERT INTO `queue` VALUES (8,2,13370,'B',28,'2019-01-26 15:09:56',1,1);
INSERT INTO `queue` VALUES (9,3,13370,'C',76,'2019-01-26 15:12:29',1,1);
INSERT INTO `queue` VALUES (10,5,13370,'E',85,'2019-01-26 15:13:16',2,1);
INSERT INTO `queue` VALUES (11,5,13370,'E',86,'2019-01-26 15:15:43',1,1);
INSERT INTO `queue` VALUES (12,3,13370,'C',77,'2019-01-26 15:15:48',1,1);
INSERT INTO `queue` VALUES (13,2,13370,'B',29,'2019-01-26 15:16:11',1,1);
INSERT INTO `queue` VALUES (14,4,13370,'D',16,'2019-01-26 15:19:33',1,1);
INSERT INTO `queue` VALUES (15,1,13370,'A',157,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (16,1,13370,'A',158,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (17,1,13370,'A',159,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (18,1,13370,'A',160,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (19,1,13370,'A',161,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (20,1,13370,'A',162,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (21,1,13370,'A',163,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (22,1,13370,'A',164,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (23,1,13370,'A',165,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (24,1,13370,'A',166,'2019-01-26 15:25:01',1,1);
INSERT INTO `queue` VALUES (25,1,13370,'A',167,'2019-01-26 15:25:01',1,1);