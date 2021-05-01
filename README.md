# APS Linguagem de Programação Orientada a Objetos Java

## Create a Database

```
CREATE DATABASE quiz;
CREATE TABLE questions (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternativeID int NOT NULL UNIQUE,
  theme varchar(20),
  question varchar(30) NOT NULL,
  answer tinyint NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (alternativeID) REFERENCES alternatives(ID),
);
CREATE TABLE alternatives (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternative varchar(30),
);
CREATE TABLE answers (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  created_date date,
  questionID int NOT NULL,
  answered tinyint NOT NULL,
  is_right bool NOT NULL,
  FOREIGN KEY (questionID) REFERENCES questions(ID),
);
```