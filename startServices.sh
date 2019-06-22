#!/bin/sh
cd travel
mvn package docker:build
cd../package
mvn package docker:build
cd../service-discovery
mvn package docker:build
cd../config-server
mvn package docker:build
cd../docker
docker-compose up
