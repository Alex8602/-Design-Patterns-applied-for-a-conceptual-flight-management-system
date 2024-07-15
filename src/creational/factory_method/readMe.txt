Factory Method:
Se consideră faptul că fiecare loc din avion aparține unei clase (FirstClass, Business, Premium Economy sau Economy),
iar acestea trebuie create pe baza preferinței utilizatorului, preferințe care sunt considerate volatile, astfel fiind
necesară abstractizarea procesului de creare (adică selecție) al clasei dorite, permițând extensibilitatea sistemului
pentru încorporarea uterioară a altor clase, dar și permițând reseleția rapidă a unei alte clase.

După principiile SOLID:
S - Se asigură faptul că fiecare clasă are o singură responsabilitate, fiind încapsulată, iar clasa SeatFactory este responsabilă de crearea instanțelor necesare
O - Extinderea tipurilor de clase se poate face prin creare unor noi clase fără modificarea codului sursă existent
L - Orice clasă care implementează interfețele aferente pot fi interschimbate
I - Interfețele sunt client-specific, adică sunt utilizate de cei care operează generarea de o clasă necesară
D - Modulele de nivel înalt care manipulează clasele depind de interfața creată, nu de clase concrete