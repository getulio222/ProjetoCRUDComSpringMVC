# Desafio CRUD - Cadastro de Usuário com Dígito Único.

Projeto Spring MVC demonstrando um cadastro simples de usuário com calculo de dígito único. 

A aplicação web foi elaborada utilizando o framework Spring MVC,
na camada de visão foi utilizado o Thymeleaf para capturar os valores de entrada e na organização e estilização o materizalize.
Na camada de persistência foi utilizado o JPA com Hibernate.

# Ferramentas que foram utilizadas

- Spring MVC
- Spring Data
- Thymeleaf
- Materizalize
- Maven
- Banco de dados em Memoria (H2)
- Spring Tool Suite(IDE)

# Observações Importantes

- O projeto contempla um scritp para criação do banco de dados (data.sql) na pasta resources.
- Informações de configuração do banco de dados no arquivo application.properties


# Como executar a aplicação  

1. Abra o Spring Tools Suite (STS)
2. No menu File > Import > Maven > Existing Mavem Projects
3. Selecione o diretório onde se encontra a pasta do projeto
4. Aguarde o Mavem fazer atualização das dependências
5. Na Aba Boot Dashboard > utilize o Devtools para inicializar
6. acesse o endereço http://localhost:8080/


Endpoints:
``` 
localhost:8080
localhost:8080/cadastros
localhost:8080/salvar
localhost:8080/editar
localhost:8080/excluir
```

#### ( Implementações Futuras )
 
 - Criação do cache para os resultados de dígito único
 - Criptografia das informações utilizando chave assimétrica (RSA) de tamanho 2048.
 - Implementar as validações dos métodos controller
 - Implementar as validações dos campos do formulário
 - Criar as classes para teste unitário.

