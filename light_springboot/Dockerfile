FROM tomcat:10

ADD ./target/SmartHomeApp.war /usr/local/tomcat/webapps/

CMD chmod +x /usr/local/tomcat/bin/catalina.sh
CMD ["catalina.sh", "run"]