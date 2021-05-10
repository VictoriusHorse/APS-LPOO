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
  alternative1 varchar(140),
  alternative2 varchar(140),
  alternative3 varchar(140),
  alternative4 varchar(140),
  alternative5 varchar(140),
  PRIMARY KEY (ID)
);
CREATE TABLE questions (
  ID int NOT NULL UNIQUE AUTO_INCREMENT,
  alternative_ID int NOT NULL UNIQUE,
  theme_ID int DEFAULT '4',
  question varchar(140) NOT NULL,
  answer int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (alternative_ID) REFERENCES alternatives(ID),
  FOREIGN KEY (theme_ID) REFERENCES themes(ID)
);
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Eolica');
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Hidreletrica');
INSERT INTO themes VALUES
  (DEFAULT, 'Energia Solar');
INSERT INTO themes VALUES
  (DEFAULT, 'Outros');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Energia nao renovavel', 'E uma energia fossil', 'Mecanismo de desenvolvimento limpo', 'Energia nuclear', 'Energia organica');
INSERT INTO questions VALUES
  (DEFAULT, '1', '1', 'Energia eolica foi considerada pela ONU como o que?', '3');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Centro-Oeste', 'Sul', 'Norte', 'Nordeste', 'Sudeste');
INSERT INTO questions VALUES
  (DEFAULT, '2', '1', 'Qual regiao do brasil produz mais energia eolica?', '4');

INSERT INTO alternatives VALUES
  (DEFAULT, '3000', '2000', '5000', '1000', '550');
INSERT INTO questions VALUES
  (DEFAULT, '3', '1', 'Ha quantos anos a energia eolica e conhecida?', '1');

INSERT INTO alternatives VALUES
  (DEFAULT, 'E.U.A', 'Brasil', 'Russia', 'Equador', 'China');
INSERT INTO questions VALUES
  (DEFAULT, '4', '1', 'Qual e o pais que mais produz energia eolica no Mundo?', '5');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Emite gases que aumentam efeito estufa', 'Impactos a fauna e visual', 'Emite gases', 'Diminui a autonomia do pais em gerar energia', 'Instalacao demorada das turbinas');
INSERT INTO questions VALUES
  (DEFAULT, '5', '1', "Cite uma desvantagem da energia eolica?", '2');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Eolica', 'Hidrica/hidraulica', 'Geotermica', 'Oceanica', 'Todas as alternativas');
INSERT INTO questions VALUES
  (DEFAULT, '6', '2', 'Quais das alternativas a seguir sao uma fonte de energia renovavel?', '5');
  
INSERT INTO alternatives VALUES
  (DEFAULT, 'Aproveitamento do potencial hidraulico dos ventos', 'Aproveitamento do potencial hidraulico existente na queima de carvao', 'Aproveitamento do potencial hidraulico existente em um Oceano', 'Aproveitamento do potencial hidraulico existente em um rio', 'Outro');
INSERT INTO questions VALUES
  (DEFAULT, '7', '2', 'Qual o principio basico das hidreletricas?', '4');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Emite poluentes', 'Causam grande impacto ambiental e social', 'Deixa muito residuos poluentes', 'Atraves da represa e possivel regular a vazao do rio', 'Nenhuma das alternativas');
INSERT INTO questions VALUES
  (DEFAULT, '8', '2', 'Quais as vantagens das hidreletricas?', '4');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Itaipu (Brasil)', 'Belo Monte(Brasil)', 'Tucurui 1 e 2(Brasil)', 'Guri (Venezuela)', 'Tres Gargantas (China)');
INSERT INTO questions VALUES
  (DEFAULT, '9', '2', 'Qual a maior hidreletrica do mundo e capacidade maxima momentanea (p maximo de energia que pode se gerar em energia ao mesmo tempo)?', '1');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Sul-Sudeste-Centro-Oeste', 'Norte-nordeste', 'Sul-Sudoeste', 'Norte-oeste', 'Nenhuma das alternativas');
INSERT INTO questions VALUES
  (DEFAULT, '10', '2', 'Qual a regiao do Brasil que produz mais energia hidraulica?', '1');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Minas Gerais', 'Sao Paulo', 'Rio de Janeiro', 'Santa Catarina', 'Amazonas');
INSERT INTO questions VALUES
  (DEFAULT, '11', '3', 'Qual pais do brasil produz mais energia solar?', '1');

INSERT INTO alternatives VALUES
  (DEFAULT, '1950', '1830', '1839', '1902', '1754');
INSERT INTO questions VALUES
  (DEFAULT, '12', '3', 'Em que ano surgiu a energia solar fotovoltaica?', '3');

INSERT INTO alternatives VALUES
  (DEFAULT, 'E.U.A', 'Brasil', 'Russia', 'Equador', 'China');
INSERT INTO questions VALUES
  (DEFAULT, '13', '3', 'Qual e o pais que mais produz energia solar no Mundo?', '5');

INSERT INTO alternatives VALUES
  (DEFAULT, 'E uma energia fossil', 'Baixo impacto ambiental', 'Baixo custo de aquisicao inicial', 'Muitos estudos sobre o impacto que vem do descarte dos paineis velhos', 'Pode ser muito aproveitada durante a noite');
INSERT INTO questions VALUES
  (DEFAULT, '14', '3', 'Qual dessas e uma vantagem da energia solar?', '2');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Nova York', 'Sao Paulo', 'Rio de Janeiro', 'California', 'Hong Kong');
INSERT INTO questions VALUES
  (DEFAULT, '15', '3', 'Aonde foi realizado o primeiro voo a energia solar?', '4');

INSERT INTO alternatives VALUES
  (DEFAULT, 'fontes de energia nao renovavel', 'fontes de energia renovavel', 'Mecanismo de desenvolvimento limpo', 'Energia renovavel', 'Energia limpa');
INSERT INTO questions VALUES
  (DEFAULT, '16', '4', 'O que sao combustiveis fosseis?', '1');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Energia Solar', 'Energia Geotermica', 'Energia Nuclear', 'Energia ondomotriz', 'Energia da biomassa');
INSERT INTO questions VALUES
  (DEFAULT, '17', '4', 'Qual dessas abaixo nao e uma fonte de energia renovavel?', '3');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Energia Eolica', 'Energia Hidrica', 'Energia Nuclear', 'Petroleo', 'Energia Sismicas');
INSERT INTO questions VALUES
  (DEFAULT, '18', '4', 'Qual dessas e a energia renovavel mais usada no mundo?', '2');

INSERT INTO alternatives VALUES
  (DEFAULT, 'Reduz a emissao de gas CO2', 'Impacto ambiental menor', 'E inesgotavel', 'Custo elevado de investimento e infra - estrutura', 'Oferece mais risco que a energia nuclear');
INSERT INTO questions VALUES
  (DEFAULT, '19', '4', 'Quais dessas nao e uma vantagem da energia renovavel?', '4');

INSERT INTO alternatives VALUES
  (DEFAULT, '1987', '2000', '2005', '1994', '1970');
INSERT INTO questions VALUES
  (DEFAULT, '20', '4', 'Em que ano as energias renovaveis ganharam forcas no Brasil?', '5');
