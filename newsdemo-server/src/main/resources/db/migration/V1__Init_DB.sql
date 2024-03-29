CREATE TABLE ND_USERS (
  ID BIGINT NOT NULL,
  USERNAME VARCHAR(255) NOT NULL,
  PASSWORD VARCHAR(255) NOT NULL,
  CONSTRAINT ND_USERS_PK PRIMARY KEY (ID),
  CONSTRAINT ND_USERS_USERNAME_UN UNIQUE (USERNAME)
);

CREATE SEQUENCE ND_USERS_ID_SEQ OWNED BY ND_USERS.ID;

