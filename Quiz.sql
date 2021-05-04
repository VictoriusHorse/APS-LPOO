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
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Hidraulica');
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Eolica');
INSERT INTO alternatives VALUES
  (DEFAULT, 'Minas Gerais', 'Sao Paulo', 'Rio de Janeiro', 'Santa Catarina', 'Amazonas');
INSERT INTO questions VALUES
  (DEFAULT, '1', '1', 'Qual pais do brasil produz mais energia solar?', '1');
INSERT INTO alternatives VALUES
  (DEFAULT, '1950', '1830', '1954', '1902', '1754');
INSERT INTO questions VALUES
  (DEFAULT, '2', '1', 'Em que ano surgiu a energia solar?', '3');
INSERT INTO alternatives VALUES
  (DEFAULT, 'E.U.A', 'Brasil', 'Russia', 'Equador', 'China');
INSERT INTO questions VALUES
  (DEFAULT, '3', '1', 'Qual e o pais que mais produz energia solar no Mundo?', '5');
INSERT INTO alternatives VALUES
  (DEFAULT, 'Eolica', 'Hidrica/hidraulica', 'Geotermica', 'Oceanica', 'Todas as alternativas');
INSERT INTO questions VALUES
  (DEFAULT, '4', '2', 'Quais das alternativas a seguir sao uma fonte de energia renovavel?', '5');
