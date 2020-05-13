FROM postgres:9.6

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres

ENV POSTGRES_HOST_AUTH_METHOD=trust

# init db sql
COPY init.sql /docker-entrypoint-initdb.d/

CMD ["postgres", "-D", "/var/lib/postgresql/data"]
