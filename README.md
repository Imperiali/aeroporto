# Java - Programação Orientada a Objetos

> ASSESSMENT
> Professor Douglas

_Seu cliente é a Agência Nacional de Aviação Civil (ANAC), que apresentou a seguinte
demanda:_

Cadastrar aeronaves, vôos, aeroportos e cidades e inseri-los no sistema para que
possa ser realizado um melhor gerenciamento do transporte aéreo no Brasil;
Uma aeronave pode ser um helicóptero ou avião, sendo que cada aeronave é
representada pelo seu prefixo, pelo nome do seu modelo, pelo nome do seu fabricante.
Um avião possui a quantidade de assentos e o nome da empresa. Um helicóptero possui
um tipo que pode ser: Resgate, Taxi aéreo e Guarda costeira. Implemente as classes que
representem tais aeronaves e seus tipos e desenvolva os respectivos construtores e um
método que informe qual o prefixo da aeronave.

Um voo possui número, data de partida, horário de partida, horário de chegada e número
de vagas. Além disso, um vôo está associado aos aeroportos de origem, de destino e a
aeronave. Todos os voos de aviões ocorrem uma vez para cada dia da semana. O
sistema deve permitir incluir, remover e editar voos. A partir do número de um voo, obter o
número de vagas disponíveis, a data de partida, o horário de partida, o horário de
chegada, a descrição da aeronave empregada, os códigos e os nomes dos aeroportos de
origem e de destino. Implemente uma classe que contemple os atributos e métodos
apresentados.

Um aeroporto é representado pelo seu código, seu nome e a cidade (ex.: GIG: Aeroporto
Internacional Tom Jobim, Rio de Janeiro), por um status que informa se ele é um
aeroporto internacional ou não, uma lista de outros aeroportos para os quais partam vôos
diretos à partir dele e uma lista de outros aeroportos de onde venham vôos para ele. Além
disto possui uma lista de aeronaves que estão atualmente no pátio. Implemente uma
classe que contemple os atributos apresentados e mais os seguintes membros:

- Um construtor que inicialize o código do aeroporto e seu nome.
- Métodos que verifiquem e alterem a situação relativa ao fato do aeroporto ser
internacional ou não.
- Um método que verifique e informe se um aeroporto é igual a ele:
    - public boolean equals (Aeroporto aeroposto)
    - Dois aeroportos são iguais se o seu código for coincidente.
- Um método que receba um prefixo de uma aeronave como parâmetro e informe se a
ela está pousada nele.
- Um método que receba um outro aeroporto como parâmetro e verifique se existe
alguma forma de se chegar nele. Para isto, o aeroporto deve verificar se ele possui vôo
partindo para o aeroporto desejado, e caso não saia, se existe alguma forma de chegar
nele à partir dos aeroportos de onde sai
    - public boolean possuiRota(Aeroporto aeroporto)
- A partir do código de um aeroporto obter o seu nome.
- A partir das cidades de origem e de destino, obter os números dos voos em uma
determinada data;
Obs 1: A quantidade máxima de aeronaves que um aeroporto pode ter em terra é igual a
100 e a quantidade máxima de outros aeroportos com os quais o aeroporto pode ter
linhas saindo e chegando é 100. Gerar exceções caso isso tente ser “burlado”.
Implemente uma classe que represente uma cidade. Uma cidade tem como atributos o
seu nome e a sua dimensão em Km2
 e uma lista de cidades com as quais ela faz
fronteira. Deve ser implementado:
- Construtor que inicialize o nome e a dimensão da cidade;
- Métodos de acesso (get) para a propriedade dimensão da cidade;
- Um método que permita verificar se duas cidades são iguais. Duas cidades são iguais
se tiverem o mesmo nome e a mesma dimensão. A assinatura deste método deve ser:
    - public boolean equals(Cidade outra);
- Um método que informe se uma outra cidade é limítrofe (faz fronteira);
- Um método que receba uma outra cidade como parâmetro e retorne uma lista de
vizinhos comuns as duas cidades.
Obs: Considere que uma cidade tem no máximo 40 outras cidades com as quais faz
fronteira. Gerar uma exceção caso isso tente ser “burlado”.
Você deve executar seu programa no BlueJ, NetBeans ou Eclipse e:
- Criar pelo menos 3 objetos do tipo Aeronave;
- Criar pelo menos 2 objetos do tipo Cidade;
- Criar pelo menos 3 objetos do tipo Aeroporto;
- Criar pelo menos 2 objetos do tipo Vôo;
- Realizar os testes necessários de integração entre os objetos das diferentes classes
para verificar se atendem aos critérios pré-estabelecidos neste projeto;