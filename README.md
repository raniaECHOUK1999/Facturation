
+ Créer les classes ClientModel, FactureModel, LigneFactureModel.

+ Ajouter les annotations JPA (@Entity, @Table, @Id, @GeneratedValue, @OneToMany, @ManyToOne).

+ Ajouter les validations (@Email, @NotNull...)

+ Créer les interfaces ClientRepository, FactureRepository, LigneFactureRepository.

+ Ajouter des méthodes personnalisées avec HQL ou JPQL:

-> FactureModel findFactureModelByClientId(Long id);

-> List<FactureModel> findFactureModelByDate(Date date);

+ Implémenterles services.

+ Ajouter la logique métier :

Calcul totalHT, totalTVA, totalTTC dans FactureService.

+ Vérification des taux de TVA valides.

+ Vérification que chaque facture contient au moins une ligne.

+ Créer Controllers / Endpoints.

Ajouter les endpoints REST :

POST /api/client -> création client.

POST /api/facture -> création facture avec lignes.

GET /api/facture/byDate?date=2025-08-16T00:00:00.000+0000 -> récupération par date.

GET /api/facture/byClient?id=2 -> récupération par client.

+ Tester tous les endpoints via Postman.

+ Intégration Swagger

+ Ajouter dépendance Swagger/OpenAPI.

+ Configurer Swagger UI pour documenter toutes les API.
