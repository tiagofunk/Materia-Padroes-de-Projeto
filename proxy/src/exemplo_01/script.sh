#!/bin/bash

cp /home/tiago/Repositorios/Github/Padroes-de-Projeto/proxy/src/exemplo_01/Hello.java /usr/lib/jvm/java-8-oracle/bin 
cp /home/tiago/Repositorios/Github/Padroes-de-Projeto/proxy/src/exemplo_01/HelloClient.java /usr/lib/jvm/java-8-oracle/bin

cd /usr/lib/jvm/java-8-oracle/bin

javac Hello.java HelloClient.java
