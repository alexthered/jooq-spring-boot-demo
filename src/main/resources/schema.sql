DROP TABLE IF EXISTS POSTS;

CREATE TABLE POSTS (
                       ID int(11) NOT NULL AUTO_INCREMENT,
                       TITLE varchar(200) NOT NULL,
                       CONTENT LONGTEXT DEFAULT NULL,
                       CREATED_ON datetime DEFAULT NULL,
                       PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS COMMENTS;

CREATE TABLE COMMENTS (
                          ID int(11) NOT NULL AUTO_INCREMENT,
                          POST_ID int(11) NOT NULL,
                          NAME varchar(200) NOT NULL,
                          EMAIL varchar(200) NOT NULL,
                          CONTENT LONGTEXT DEFAULT NULL,
                          CREATED_ON datetime DEFAULT NULL,
                          PRIMARY KEY (ID),
                          FOREIGN KEY (POST_ID) REFERENCES POSTS(ID)
);