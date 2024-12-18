FROM postgres:latest

# Set environment variables
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD="12345"
ENV POSTGRES_DB=cardeditor


# Copy the initialization script
COPY init-db.sh /docker-entrypoint-initdb.d/

# Ensure the script is executable
RUN chmod +x /docker-entrypoint-initdb.d/init-db.sh


# Use Portmapping to ensure that the container is discoerable outside the container network
# 