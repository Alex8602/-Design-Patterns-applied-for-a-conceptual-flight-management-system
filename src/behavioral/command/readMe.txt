Command:
Utilizatorul are posibilitatea să efectueze anumite operații pe rezervarea sa, adică își poate face checkIn, poate
solicita o restituire a banilor, sau poate anula rezervarea. Pentru integrarea acestor opțiuni s-a utilizat patternul
Command, care permite execuția diferită a unor comenzi după anumite scenarii prestabilite în funcție de necesități,
încapsulandu-se infomația necesară (și acțiunile) acestor tip de operații, adică permițând decuplarea claselor
care invocă operațiile de clasele care chiar le realizează.

După principiile SOLID:
S - Fiecare clasă de comandă are o singură resposabilitate, adică sa execute operația specificată
O - Se pot adăuga noi operații prin crearea unor noi clase de comandă fără alterarea codului existent
L - Oricare clasă ce implementează interfața Command poate fi utilizată interschimbabil
I - Interfața Command este client-specific, adică este utilizată de către utilizator pentru operațiile necesare
D - Modulele de nivel înalt depind de interfața Command, nu de clasele concrete