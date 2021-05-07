# APS Linguagem de Programação Orientada a Objetos Java

## Crie um Banco de dados

Crie um banco chamado "quiz".

No terminal do mysql utilize o comando mais o caminho do arquivo Quiz.sql:
```
source "[path]"
```
No terminal utilize o comando mais o caminho do arquivo Quiz.sql:
```
mysql -u root -p quiz < "[path]"
```
## Arquivo Quiz.sql
```
DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS alternatives;
DROP TABLE IF EXISTS themes;
DROP TABLE IF EXISTS answers;
CREATE TABLE themes (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  theme varchar(30),
  PRIMARY KEY (ID)
);
CREATE TABLE alternatives (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternative1 varchar(60),
  alternative2 varchar(60),
  alternative3 varchar(60),
  alternative4 varchar(60),
  alternative5 varchar(60),
  PRIMARY KEY (ID)
);
CREATE TABLE questions (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternative_ID int NOT NULL UNIQUE,
  theme_ID int DEFAULT '0',
  question varchar(80) NOT NULL,
  answer int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (alternative_ID) REFERENCES alternatives(ID),
  FOREIGN KEY (theme_ID) REFERENCES themes(ID)
);
```