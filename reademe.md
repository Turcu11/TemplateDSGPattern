## The template method pattern

Este un pattern care se refera la comportamentul obiectelor (behavioral) acesta prsupune impartirea algoritmului in mai multe metode
care sa fie toate apelate de o metoda mai mare, acestea vor fi intr-o clasa abstracta iar clasele concrete vor mosteni la randul lor aceasta clasa abstracta
toate metodele declarate in clasa abstracta vor fi supra-scrise de clasele concrete iar daca sunt anumite metode care sunt foarte similare ele pot fi implementate
direct la nivelul de clasa abstracta astfel se evita copiere de cod intre clasele concrete, la nevoie clasele concrete pot supra-scrie si aceste metode, dar daca nu se 
supra-scriu ele vor aplica implementarea din clasa abstracta
