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
  question varchar(60) NOT NULL,
  answer int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (alternative_ID) REFERENCES alternatives(ID),
  FOREIGN KEY (theme_ID) REFERENCES themes(ID)
);
-- CREATE TABLE answers (
--   ID int NOT NULL UNIQUE AUTO_INCREMENT,
--   created_date date,
--   question_ID int NOT NULL,
--   answered tinyint NOT NULL,
--   is_right bool NOT NULL,
--   FOREIGN KEY (question_ID) REFERENCES questions(ID),
-- );
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Solar');
INSERT INTO alternatives VALUES
  (DEFAULT, 'Matutino e Vespertino', 'Madrugada e Noite', 'Madrugada e Vespertino', 'Noite e Vespertino', 'Dia e Madrugada');
INSERT INTO questions VALUES
  (DEFAULT, '1', '1', 'Em quais turnos do dia um painel solar funciona?', '1');
