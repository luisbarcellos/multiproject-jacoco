# multiproject-jacoco

### Utilizado no projeto:
    *   Spring boot
    *   Gradle
    *   Jacoco
    *   Sonar

### Passos para rodar o projeto
## 1- Entrar na pasta raiz do projeto pelo terminal e rodar o comando abaixo:
    ./gradlew clean build
    
## 2- Ainda na pasta rodar o comando abaixo:
    ./gradlew jacocoRootTestReport

## 3- Acessar o arquivo gerado:    
    /multiproject-jacoco/build/jacocoHtml/index.html

Obs.: Necessário acesso a rede para download das dependências.

## Recursos

### 1. Hello World

Retorna uma mensagem do módulo de multiproject-jacoco-impl.

#### 1.1 Exemplo de Consumo
* Método:
 
        GET
        
* URL:

        http://localhost:8080/multiproject-jacoco/hello-world/impl

### 2. Hello World

Retorna uma mensagem do módulo de integracao.

#### 2.1 Exemplo de Consumo
* Método:
 
        GET
        
* URL:

        http://localhost:8080/multiproject-jacoco/hello-world/integracao
        
## Conclusão:

        Foi necessário gerar o relatório do Jacoco para cada módulo, e unir o resultado através da task jacocoRootTestReport.