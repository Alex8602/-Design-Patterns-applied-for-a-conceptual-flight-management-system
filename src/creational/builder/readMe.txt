Builder:
În procesul de rezervare al biletelor de zbor, adeseori intervin diferite atribute adiționale, care pot genera
relații complexe între diferitele obiecte. De aceea, prin utilizarea unui pattern Builder, se permite setarea inițială
doar a atributelor cheie și opțiunea de setarea ale altor atribute (non-cheie) prin intermediul metodelor, în construirea
obiectului necesar, pas cu pas, permițând o flexibilitate mare în diferitele situații. Astfel, este lesne a crea
obiecte din clasa Booking cu diferite configurații, fără a pierde din vedere diferite combinații de atribute.

După principiile SOLID:
S - Clasa internă BookingBuilder este resposnabilă pentru construcția clasei Booking pas cu pas
O - Se pot adăuga noi atribute în Booking fără modificarea codului sursă existent
L - Clasele Bookign și BookingBuilder pot fi utilizate interschimbabil, întrucât builder-ul crează instanțe ale clasei Booking
I - Utilizatorii pot interacționa cu BookingBuilder prin intermediul metodelor care setează atributele necesare și opționale, segregând astfel interfața (expunând doar datele necesare)
D - Utilizatorii interacționează cu Booking prin intermediul BookingBuilder, adică Booking depinde de Builder, și nu se afectează codul sursă prin schimbarea clasei