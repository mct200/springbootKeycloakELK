# Projet Spring Boot avec Docker, ELK et Keycloak

Ce projet est une application Spring Boot intégrant Docker pour la gestion des conteneurs, ELK (Elasticsearch, Logstash, Kibana) pour la gestion des logs et Keycloak pour la gestion de l'authentification et de l'autorisation.

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les outils suivants :

- Docker
- Elasticsearch
- Logstash
- Kibana
- Keycloak

### Configuration

1. Cloner ce dépôt sur votre machine locale :

```bash
git clone https://github.com/mct200/springbootKeycloakELK.git

Configurer les paramètres d'accès à la base de données dans le fichier application.properties.

Configurer les paramètres d'authentification et d'autorisation dans le fichier application.properties et dans la configuration Keycloak.

Lancer les services Docker :
docker-compose up
Accéder à l'interface keycloak à l'adresse suivante :
http://localhost:8080
Faire les configurations necessaires( creation du realm, du client et de ses roles, creation de l'user et ses roles, generation du token pour ce user via postman
a travers l'url http://localhost:8080/realms/nom_du_realm/protocol/openid-connect/token avec le verbe post)

#### Utilisation
L'application Spring Boot fonctionnera à l'adresse http://localhost:8081/etudiant/*.
Les logs seront disponibles dans Kibana à l'adresse http://localhost:5601.
L'interface d'administration de Keycloak sera accessible à l'adresse http://localhost:8080/admin.

