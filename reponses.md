url git:
https://github.com/gateau-chloe/moda-ttd-oct2021-GATEAU

réponse aux question:
Fack it:
5. Quelle duplication existe pour l'instant dans le code?

Translation:
2 Est-il possible de faire un test qui n’implique l’ajout que d’une seule de ces deux méthodes ?
Sans utiliser getTranslation on ne peut pas vérifier que l'ajout à bien eu lieu. Et on ne peut pas avoir la traduction d'un mot qui n'a pas été ajouté préalablement.

Traductions Multiples:
1 nous avons besoin d'une list de string qui correspond à un mot donné en français.

Chargement de fichier
1;

Free wheeling
2. le mock object sera un string car il va simuler le résultat d'une lecture de fichier où on attend de récupérer un String.

Couverture
1. on peut espérer un taux de couverture de 80%.

Conclusion:
L'avantage de faire un TDD c'est de voir directement si notre code fonction on voit en temps réeele notre avancé, l'acconvégnient on est toujours obligé de faire attention et mettre à jour nos testes si on fait des modification de code, il faut faire évoluer le test en mêm temps que le code