# CQRS Event Sourcing Application with Spring Boot and Axon Framework

## Axon Framework
L'Axon Framework est un framework open-source conçu pour simplifier le développement de systèmes axés sur la CQRS (Command Query Responsibility Segregation) et les architectures basées sur les événements. Il offre une infrastructure et des composants prêts à l'emploi pour faciliter la mise en œuvre de modèles de domaine, de la gestion des commandes et des événements, ainsi que des projections pour la lecture de données.

Le CQRS est un modèle architectural dans lequel les opérations de lecture (queries) et d'écriture (commands) sont traitées de manière séparée, permettant une meilleure scalabilité et une gestion plus fine des aspects liés à la lecture et à l'écriture. Axon Framework prend en charge cette approche en fournissant des abstractions pour la gestion des commandes, des événements, et des bus d'événements, facilitant ainsi le développement de systèmes événementiels.

En résumé, l'Axon Framework vise à simplifier le développement d'applications basées sur des architectures événementielles et CQRS en fournissant des outils et des conventions pour gérer les commandes, les événements, et les projections de manière efficace et cohérente.

## Les concepts clés et les composants de l'Axon Framework
Les concepts clés et les composants de l'Axon Framework comprennent plusieurs éléments fondamentaux pour comprendre comment ce framework fonctionne :

- Commande (Command): Une commande représente une demande de modification de l'état du système. C'est une intention d'effectuer une action.

- Événement (Event): Un événement représente un fait survenu dans le système qui est significatif. Contrairement à une commande, un événement est une notification de ce qui s'est passé.

- Agrégat (Aggregate): Un agrégat est une racine d'entité cohérente qui encapsule un ensemble de règles métier et qui est responsable de la gestion de son propre état interne.

- Command Bus: Le bus de commandes est responsable de la transmission des commandes du point d'origine vers le gestionnaire de commande approprié. Il sépare la logique d'envoi des commandes de la logique de leur traitement.

- Événement Bus: Le bus d'événements est utilisé pour distribuer les événements générés par le système vers les composants intéressés. Il permet la communication asynchrone entre différentes parties du système.

- Gestionnaire de Commande (Command Handler): Un gestionnaire de commande est responsable du traitement d'une commande spécifique. Il contient la logique métier nécessaire pour exécuter la commande et modifier l'état du système en conséquence.

- Gestionnaire d'Événements (Event Handler): Un gestionnaire d'événements réagit aux événements en mettant à jour la vue ou en effectuant d'autres actions nécessaires en réponse à un changement dans le système.

- Projection: Une projection est une vue dénormalisée des données, généralement construite à partir d'événements, facilitant une récupération rapide et efficace des informations nécessaires à la lecture.

En résumé, l'Axon Framework utilise ces concepts et composants pour mettre en œuvre des architectures CQRS et événementielles, facilitant le développement d'applications distribuées et robustes.

## Axon Server Management Interface
Pour démarrer le serveur AXON : >java -jar axonserver.jar
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/6a733e96-b74e-4ff0-96d6-8d9106209ca5)

## L'idee générale de l'application
Cette application constitue un exemple concret de mise en œuvre des principes de Command Query Responsibility Segregation (CQRS) et d'Event Sourcing. Elle propose une API REST simple à travers laquelle les utilisateurs peuvent créer un compte bancaire et effectuer des transactions telles que des dépôts et des retraits. Élaborée en Java, l'application utilise le framework Spring Boot pour son infrastructure, en plus du framework Axon qui facilite son architecture orientée événements.

## Test de l'application 
- création du compte :
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/b4553dc0-3c45-465d-afbd-8715fcf56536)

- Récupération du event from event store
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/76151c89-2c64-4355-b98a-51f9b2c760ca)
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/f61596cf-3e0a-4358-9ad5-55267b389142)

- Teste de credit of an account
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/41aef017-9cf0-41f9-b60e-f36d8c58745f)


- Teste de debit of an account
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/8aa60fa4-8862-4df9-b3dc-c7a7b68fdc72)

- Récuperer les détails d'un compte
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/e93ffc15-9922-4a4e-88fb-ed56fc89f2bb)


- Récuperer les opération d'un compte
![image](https://github.com/salma-SABROU/compte-cqrses/assets/129564311/375c2293-8039-4bdc-996a-913a31a6b2dd)
