DROP DATABASE IF EXISTS student;
CREATE DATABASE student DEFAULT CHARACTER SET utf8;
CREATE TABLE student(
  id int(11) NOT NULL AUTO_INCREMENT,
  student_id int(11) NOT NULL UNIQUE,
  name varchar(255) NOT NULL,
  age int(11) NOT NULL,
  sex varchar(255) NOT NULL,
  birthday date DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;