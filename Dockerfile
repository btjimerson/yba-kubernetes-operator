FROM eclipse-temurin:19
RUN apt-get update
RUN wget https://get.helm.sh/helm-v3.9.3-linux-amd64.tar.gz
RUN tar xvf helm-v3.9.3-linux-amd64.tar.gz
RUN mv linux-amd64/helm /usr/local/bin
RUN rm helm-v3.9.3-linux-amd64.tar.gz
RUN rm -rf linux-amd64
WORKDIR /opt
EXPOSE 8080
COPY target/*.jar /opt/app.jar
CMD java -jar /opt/app.jar