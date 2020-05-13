CREATE DATABASE test_db;
GRANT ALL PRIVILEGES ON DATABASE test_db TO postgres;

\connect test_db;

DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
                       id BIGSERIAL PRIMARY KEY,
                       title varchar(200) NOT NULL,
                       content TEXT DEFAULT NULL,
                       created_on TIMESTAMP DEFAULT NULL
);

DROP TABLE IF EXISTS comments;

CREATE TABLE comments (
                          id BIGSERIAL PRIMARY KEY,
                          post_id BIGINT NOT NULL,
                          name varchar(200) NOT NULL,
                          email varchar(200) NOT NULL,
                          content TEXT DEFAULT NULL,
                          created_on TIMESTAMP DEFAULT NULL,
                          FOREIGN KEY (post_id) REFERENCES posts(id)
);

insert into posts(id, title, content, created_on) values(1, 'Post 1', 'This is post 1', '2016-01-03');
insert into posts(id, title, content, created_on) values(2, 'Post 2', 'This is post 2', '2016-01-05');
insert into posts(id, title, content, created_on) values(3, 'Post 3', 'This is post 3', '2016-01-07');

insert into comments(id, post_id, name, email, content, created_on)
values(1, 1, 'User1', 'user1@gmail.com', 'This is comment 1 on post 1', '2016-01-07');

insert into comments(id, post_id, name, email, content, created_on)
values(2, 1, 'User2', 'user2@gmail.com', 'This is comment 2 on post 1', '2016-01-07');

insert into comments(id, post_id, name, email, content, created_on)
values(3, 2, 'User1', 'user1@gmail.com', 'This is comment 1 on post 2', '2016-01-07');