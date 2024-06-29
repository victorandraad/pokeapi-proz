# PokeAPI

## Descrição
PokeAPI é um projeto Java que oferece uma API para acesso a dados de pokémons.

## Pré-requisitos
- JDK versão 17 ou superior instalado. Você pode baixar e instalar a partir de [BellSoft](https://bell-sw.com/pages/downloads/#/java-17-lts).

## Como Iniciar o Projeto
1. Clone este repositório para o seu ambiente local.
   
2. Abra um terminal na raiz do projeto.

3. Para rodar o servidor, utilize o seguinte comando:
   ```
   .\gradlew.bat bootRun
   ```

4. Após iniciar, o servidor estará disponível em:
   ```
   http://localhost:8080
   ```

## Endpoints Disponíveis
- `/pokemons`: Retorna uma lista de pokémons. Você pode definir o tamanho da lista através do parâmetro `size`.

   Exemplo de uso:
   ```
   http://localhost:8080/pokemons?size=10
   ```
   Isso retornará uma lista de 10 pokémons.
