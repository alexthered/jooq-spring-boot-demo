DROP TABLE IF EXISTS public.posts;

CREATE TABLE public.posts (
                       id BIGSERIAL PRIMARY KEY,
                       title varchar(200) NOT NULL,
                       content TEXT DEFAULT NULL,
                       created_on TIMESTAMP DEFAULT NULL
);

DROP TABLE IF EXISTS public.comments;

CREATE TABLE public.comments (
                          id BIGSERIAL PRIMARY KEY,
                          post_id BIGINT NOT NULL,
                          name varchar(200) NOT NULL,
                          email varchar(200) NOT NULL,
                          content TEXT DEFAULT NULL,
                          created_on TIMESTAMP DEFAULT NULL,
                          FOREIGN KEY (post_id) REFERENCES posts(id)
);