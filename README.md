O programa em Java apresentado na classe `appTriangulo` cria e exibe informações sobre diferentes triângulos usando a classe `Triangulo`. 

Foram criados três triângulos (`t1`, `t2` e `t3`) com medidas de lados diferentes. Em seguida, o programa imprime as informações de cada triângulo, incluindo seus lados e tipo (baseado nas medidas fornecidas). Além disso, é calculado e exibido o perímetro de cada triângulo usando o método `perimetro()` da classe `Triangulo`.

Essa estrutura demonstra a capacidade do programa de manipular informações geométricas básicas, como triângulos e seus perímetros, utilizando conceitos de programação orientada a objetos em Java.



A classe `Triangulo` é responsável por representar triângulos e realizar operações relacionadas a eles. Ela possui dois construtores: um para criar um triângulo com medidas específicas para cada lado (`a`, `b`, `c`) e outro para criar um triângulo equilátero, onde todos os lados têm o mesmo tamanho.

O método `perimetro()` calcula e retorna o perímetro do triângulo, somando os valores dos três lados. O método `toString()` retorna uma representação em string dos lados do triângulo.

Além disso, a classe possui um método `setA(int n)` para modificar o valor do lado `a` do triângulo, desde que a nova medida seja válida para formar um triângulo (satisfazendo a desigualdade triangular).

No construtor e no método `setA(int n)`, há uma verificação para garantir que os valores dos lados formem um triângulo válido, evitando medidas inválidas que não obedecem à desigualdade triangular.

