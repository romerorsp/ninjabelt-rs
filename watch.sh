#!/usr/bin/env bash

# watch the java files and continuously deploy the service
mvn clean install
skaffold run -p local
reflex -r "\.java$" -- bash -c 'mvn install && skaffold run -p local'
