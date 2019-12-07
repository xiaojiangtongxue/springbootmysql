CREATE TABLE user  (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(255) ,
  name varchar(255) ,
  age smallint(6) ,
  balance decimal(10, 0) ,
  PRIMARY KEY (`id`)
);