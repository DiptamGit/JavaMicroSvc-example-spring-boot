# JavaMicroSvc-example-spring-boot
Basic starter Spring Boot project, with web dependency : https://start.spring.io/  
It has two controller one for a standalone REST svc another to call backend svc as a microsvc architecture  
First download and start backend service on port 8080
download current project and start with mvn clean install spring-boot:run -Dserver.port=9090 as default start on sprint boot is on 8080  
Go to http://localhost:9090/api/gethost to get response from standalone svc, basic spring security is enabled, username and password is admin , admin , you can remove that  
To pass parameter : http://localhost:9090/api/gethost?fname=Diptam&lname=Sarkar  
To call backend service : http://localhost:9090/api/greetingbackend  
