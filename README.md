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

##### Apercu sur image
Keycloak-dashboad
<img width="955" alt="keycloak-dashboad" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/24eee065-13f4-48a4-9a01-afb235e2e28f">

Kibana-dashboad
<img width="939" alt="Screenshot 2024-03-06 235223" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/4103eda7-9b10-4a63-8bff-2179f8b9df2d">

postman generation token
<img width="640" alt="Screenshot 2024-03-06 235324" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/b7f66838-f16e-426f-9560-29c9a8ef4a72">

postman essaye d'authentification a une methode le droit d'acces admin
<img width="635" alt="cas_nonAuhenticate" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/24293ba0-f5a3-44b4-aac7-bdf6beeca9ff">
postman cas d'authentification reussie
<img width="643" alt="authentificationReussie" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/5b1d8756-4e0c-4324-83a1-5483496e7e5d">



<img width="955" alt="keycloak-dashboad" src="https://github.com/mct200/springbootKeycloakELK/assets/97558185/ca584530-c0d6-41ad-8641-e9e287c58ff6">


