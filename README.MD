# PALINDROMO
#### Projeto voltado para a utilização do método TDD, frameworks do Mockito e PiTest.

## Maneira 1 de rodar o projeto

* Faça o clone do projeto
```bash
https://github.com/CaioBastosImpacta/tdd-mutations-palindromo
```

* Execute as ações do maven para build na raíz do projeto
```bash
mvn clean
mvn install
```

* Execute a ação de execução do projeto web (spring-boot) dentro da pasta /palindromo
```bash
mvn spring-boot:run
```

* 1. Abrir o Postman
```bash
Metodo: GET
URL: localhost:8080/fit/v1/palindromos/{TEXTO A INSERIR}
```

* 2. LINHDA DE COMANDO
```bash
curl --request POST \
  --url localhost:8080/fit/v1/palindromos/{TEXTO A INSERIR}
```

## Maneira 2 de rodar o projeto

* Acessar o link e fazer o pull da imagem
```bash
https://github.com/CaioBastosImpacta/tdd-mutations-palindromo
```

* Execute as ações do maven para build na raíz do projeto
```bash
docker run <nome_imagem>
```

* 1. Abrir o Postman
```bash
Metodo: GET
URL: localhost:8080/fit/v1/palindromos/{TEXTO A INSERIR}
```

* 2. LINHDA DE COMANDO
```bash
curl --request POST \
  --url localhost:8080/fit/v1/palindromos/{TEXTO A INSERIR}
```

## Gerar o relatório teste mutante da aplicação
```bash
1. mvn org.pitest:pitest-maven:mutationCoverage
2. Pasta app/targer/pit-reports
3. Abrir o arquivo index.html
```
