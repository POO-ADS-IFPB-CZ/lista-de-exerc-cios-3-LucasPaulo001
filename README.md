## Questões abertas

1) Explique a diferença entre um array de tipos primitivos (int[], double[]) e um array de objetos (Aluno[], Produto[]) em Java.
- a) Como a memória é alocada em cada caso?
> Em arrays de tipo primitivo a memória é alocada de maneira direta, ou seja quando não instanciado a memória ocupa 0 para int e 0.0 para float, já em objs a memória é alocada apenas o endereço de memória, em caso de não instanciado fica como null.
- b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?
> Ao acessar a memória em arrays de tipo primitivos, sempre verificar se a posição realmente existe ex: array de tamanho 5, você querer acessar a posição 6 acontecerá erro de memória alocada, já em objetos tentar acessar um objeto em uma posição que não existe, também dará erro.
