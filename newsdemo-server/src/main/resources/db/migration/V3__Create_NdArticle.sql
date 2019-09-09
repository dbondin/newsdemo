CREATE TABLE ND_ARTICLE (
  ID BIGINT NOT NULL,
  TITLE VARCHAR(255) NOT NULL,
  CONTENT VARCHAR(255) NOT NULL,
  POSTING_DATE DATE NOT NULL DEFAULT CURRENT_DATE,
  USER_ID BIGINT NOT NULL,
  CONSTRAINT ND_ARTICLE_PK PRIMARY KEY (ID),
  CONSTRAINT ND_ARTICLE_TITLE_UN UNIQUE (TITLE),
  CONSTRAINT ARTICLE_FK FOREIGN KEY (USER_ID)
  REFERENCES ND_USERS (ID)
 
);

CREATE SEQUENCE ND_ARTICLE_ID_SEQ OWNED BY ND_ARTICLE.ID;

