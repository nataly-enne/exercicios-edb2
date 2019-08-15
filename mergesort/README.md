### Aula 8 de agosto de 2019

#### Criando um algoritmo de ordenação Merge Sort e criando a classe de testes.

´´´
COMPLEXIDADE:

T(1) = c
T(n) = c + T(n/2) + T(n/2) + c.n
T(n) = c + 2T(n/2) + c.n

Expandindo:
T(n/2) = 2T(n/4) + (c.n)/2
T(n/4) = 2T(n/8) + (c.n)/4

Aplicando na forma original:
T(n) = 2 = [2t(n/4) + (c.n)/2] + c.n
T(n) = 4T(n/4) + c.n
= 4 [2T(n/8) + (c.n)/4] + 2.c.n
= 8T(n/8) + 3.c.n

T(n) = 2^k.T(n/2^k) + k.c.n

´´´
