Strategy:
În generarea prețurilor biletelor de avion se ține cont de diferite astpecte, factorul cel mai decisiv fiind sezonul,
acesta influențând metoda de calcul a tarifelor. Astfel, prin crearea unei strategii de calcul a prețurilor se poate
crea anumite standarde sezoniere care să ajusteze prețurile după anumite criterii. Este necesară această strategie
pentru manipularea tarifelor după factorii sezonieri, prin încapsularea fiecărei metode de calcul sezonier
în clase diferite.

După principiile SOLID:
S - Fiecare clasă are o singură responsabilitate, adică să implementeze calculul specific sezonier
O - Se pot adăuga alte strategii de calcul prin creare altor clase, fără modificarea codului existent (deschis la extindere)
L - Oricare clasă care implementează interfața FareCalculation poate fi interschimbată
I - Interfața FareCalculation este client-specific, adică este utilizată de către cel care operează metoda de calcul al tarifelor
D - Modulele de nivel înalt care manipulează calculul tarifelor depind de interfața creată, nu de clase concrete