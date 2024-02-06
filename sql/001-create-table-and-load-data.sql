DROP TABLE IF EXISTS music;

CREATE TABLE music (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  role VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO music (name, role) VALUES ('Dave Mustaine', 'lead vocal ＆ guitar');
INSERT INTO music (name, role) VALUES ('Kiko Loureiro', 'guitar');
INSERT INTO music (name, role) VALUES ('James LoMenzo', 'bass');
INSERT INTO music (name, role) VALUES ('Dirk Verbeuren', 'drums');
