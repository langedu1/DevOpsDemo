FROM openjdk:17-jdk-slim
RUN apt-get update && apt-get install -y curl \
  && curl -sL https://deb.nodesource.com/setup_18.x | bash - \
  && apt-get install -y nodejs \
  && curl -L https://www.npmjs.com/install.sh | sh

WORKDIR /usr/src/app

COPY . .

ENV NODE_OPTIONS=--openssl-legacy-provider
RUN cd frontend && npm install
RUN cd frontend && npm run build
COPY ./frontend/dist/* ./backend/src/main/resources/static
RUN cd backend && chmod +x gradlew
RUN cd backend && ./gradlew build

EXPOSE 8080
CMD ["java", "-jar", "/usr/src/app/backend/build/libs/demo-0.0.1-SNAPSHOT.jar"]