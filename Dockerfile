FROM jenkins/inbound-agent:latest

USER root

# Instalar Java (OpenJDK 17) y Maven
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven && \
    apt-get clean

# Establecer JAVA_HOME y MAVEN_HOME
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH
ENV MAVEN_HOME=/usr/share/maven
ENV PATH=$MAVEN_HOME/bin:$PATH

# Crear directorio de trabajo para Jenkins
RUN mkdir -p /home/jenkins/agent

USER jenkins
