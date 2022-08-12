# lets-inject

Projeto para demonstração do princípio de inversão de dependências.

## Inversão (Injeção) de dependências
É muito importante desenvolver nosso código pensando na facilidade da manutenção, e na viabilidade de
realizarmos testes. 

Para isto temos diversos padrões de projeto para facilitar este processo. Um deles visa a remoção 
de instâncias desnecessárias entre as classes, que podem prejudicar tanto o desempenho quanto a aplicação de testes unitários.

É a **inversão de dependência**. 

Este padrão inclusive está dentro do SOLID, sendo a letra D do nosso quinteto! 

Ela visa colocar a responsabilidade da instância de dependências na classe que está
chamando e não nela própria. 

Vamos acompanhar nosso exemplo? Nosso exemplo possui o controle da dependência pelo campo, diretamente, que está fora da nossa inversão! 

Vamos arrumar isto!

https://github.com/paiva-thiago/lets-inject