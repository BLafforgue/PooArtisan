# TP Final  : ARTISAN

Créer un projet JAVA nommé permettant de gérer une liste de artisans en respectant les principes de conception abordés dans ce cours.
Un artisan est caractérisé par un code, nom, prénom et une date de début de carrière.
Un artisan peut être un électricien caractérisé par un nombre de puissance maitrisée.
Un artisan peut être un plombier caractérisé par un nombre de marque certifiée.

### Exercice 1 : Modèle
Créer les classes schématisant le modèle ci-dessus : Héritage, Constructeur, Getters Setters

### Exercice 2 : IHM
Ecrire l’interface IHM en mode console permettant d’afficher par choix multiples.
Le code de cette interface sera stocké dans une classe nommée « Main »
1-	Ajouter un électricien
2-	Supprimer un électricien
3-	Lister les électriciens existants
4-	Ajouter un plombier
5-	Supprimer un plombier
6-	Lister les plombiers existants
7-	Lister les artisans existants en mettant en évidence la fonction (Électricien ou Plombier)
Faites votre choix (1, 2, 3) :

Quand l’utilisateur a fait son choix (1, 2, 3) : 

Traitement 1 : Le système affiche « Saisir le code, nom, prénom, date de début de carrière et nombre de puissance maitrisée : »
L’utilisateur saisi alors ses données
Les données sont ajoutées à votre application.

Traitement 2 : Le système affiche « Saisir le code : ».
L’utilisateur saisie 0002

Traitement 3 : Liste tous les électriciens les uns en dessous des autres. Créer des objets via des valeurs en dur dans le code pour le moment dans un objet de type ArrayList.
Code, Nom, prénom, Date début carrière, Nombre d’année formation
Nota : utiliser une fonction toString() qui sera redéfinie pour chaque classe fille.

Traitement 4 : Idem pour les plombiers (Cf Traitement 1)

Traitement 5 : Idem pour les plombiers (Cf Traitement 2)

Traitement 6 : Idem pour les plombiers (Cf Traitement 3)

Traitement 7 : Exemple d’affichage attendu
Pestana Cyril possède l’agrément de 10000 volts
Lucas Denis est certifié de 7 marques
ORTI Chris possède l’agrément de 3000 volts

### Exercice 3 : Optimisation

Traitement A : Contrôler que le code saisi par l’utilisateur n’existe pas pour un artisan. Un message sera envoyé à l’utilisateur.
Traitement B : Lors de la suppression, si le code saisi par l’utilisateur n’existe pas, un message est envoyé à l’utilisateur.
Traitement C : Trier la liste des artisans par ordre croissant sur le code.
