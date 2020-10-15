# Bus_reservationApp

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is developed in Spring BootApplication. The requirement of application is to create a Microservices backend to securely store data in a file format and allow the user to read and update when required.
This application should contain 2 Microservices projects which have to be independently built & deployed in STS and by making somechanges in code, can be deployed in GCP by creating Kubernete clusters and importing database to XLX format has been done through inbuild feature in GCP.

	
## Technologies 
Project is created with:
* SpringBootApplication(STS)
* Java 8
* HTML
* Maven
* MySQLWorkBench
	
## Setup
To run this project, install SpringBootApplication(STS) and MySQLWorkBench in your PC/Laptop.Create a Database Schema as given in the uploaded format.Then import two microservices projects named (Bus_reservationApp and Buscheckin ) in SpringBootApplication(STS).Make sure the files are error free after importing.Then Run two projects as Spring Boot Application(Select the project >> RightClick >> RunasSpringBootapplication) at a time. Use any browser to run the URL as mention below.

```
1.Bus_reservationApp (service1)=>(Select the project >> RightClick >> RunasSpringBootapplication)
2.URL(service1)http://localhost:8080/Bus_reservationApp/index.html
3.Buscheckin (service1)=>(Select the project >> RightClick >> RunasSpringBootapplication)
4.URL(service2)http://localhost:9090/Buscheckin/showCheckin
```
#This URL can also be change to encriptive and discriptive format by using GCP-> Kubernetcluster sequrity.
