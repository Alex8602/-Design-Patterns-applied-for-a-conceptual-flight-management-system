Adapter:
În contextul rezervării de bilete de călătorii cu avionul, există numeroase modalități de plată (aici Card sau Wire),
care au specificul lor, iar un adaptor este necesar întrucât permite crearea unei interfețe consistente
(BookingPaymentAPI), prin care se pot manipula diferitele forme de plăți la care utilizatorul decurge, pentru o
validare ulterioară a plăților și obținerea informațiilor relevante la nevoie (precum status-ul plăților).

După principiile SOLID:
S - Adaptoarele au o singură responsabilitate, și anume, să adapteze metodele de plăți online după necesitatea specifică booking-ului
O - Se pot adăuga noi metode de plăți și adaptoare fără modificarea codului sursă existent
L - Oricare clasă care implementează interfața BookingPaymentAPI poate fi interschimbată
I - Interfața este client-specific, adică este utilizată de către client
D - Modulele de nivel înalt care manipulează sistemele, dar și adaptoarele de plată depind de interfețele create în acest sens
