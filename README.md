# lets-inject

Projeto para demonstração do princípio de injeção de dependências.

## Injeção de dependências
É muito importante desenvolver nosso código pensando na facilidade da manutenção, e na viabilidade de
realizarmos testes. 

Para isto temos diversos padrões de projeto para facilitar este processo. Um deles tem como objetivo a remoção 
de instanciamentos desnecessários  entre as classes. É a *injeção de dependência*. 

Ela visa colocar a responsabilidade do instanciamento de dependências na classe que está
chamando e não nela própria. 

Vamos acompanhar nosso exemplo?