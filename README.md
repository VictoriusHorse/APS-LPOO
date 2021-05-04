# APS Linguagem de Programação Orientada a Objetos Java

## Crie um Banco de dados

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
DROP TABLE IF EXISTS quiz;
CREATE TABLE questions (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternativeID int NOT NULL UNIQUE,
  themeID int,
  question varchar(30) NOT NULL,
  answer tinyint NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (alternativeID) REFERENCES alternatives(ID),
  FOREIGN KEY (themeID) REFERENCES themes(ID),
);
CREATE TABLE alternatives (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternative varchar(30),
);
CREATE TABLE themes (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  theme varchar(30),
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