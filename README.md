# `Consulta de Filmes`

Boas-vindas ao repositório do exercício `Consulta de Filmes`

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Neste exercício você irá fazer manipulação de coleções, de forma a buscar certas informações a respeito de filmes.

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

- Utilizar a interface List e suas implementações;
- Utilizar a interface Set e suas implementações;
- Utilizar a interface Map e suas implementações;
- Utilizar a API Stream do Java.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos


## Consultas de filmes

Este exercício é para quem gosta de cinema (e de manipular umas listas em Java vez ou outra 🤪)!

No arquivo `Movie.java` nós temos uma classe que representa um filme.

Os campos `categories`, `directors`, `actors` e `characters` são todos conjuntos de _Strings_ porque cada um deles pode ter múltiplos valores. Por exemplo, um filme pode se encaixar em múltiplas categorias (ação, comédia etc.) e também pode ter mais de uma pessoa diretora (em alguns filmes da Marvel, os irmãos Russo, Joe e Anthony, por exemplo).

O campo `actorsByCharacters` é um _Map_ que associa o nome de um personagem (`String`) a um conjunto de artistas (`Set<String>`). Por exemplo, em Space Jam (2021), o personagem LeBron James é interpretado pelo próprio jogador da NBA em sua fase adulta, mas é também interpretado mais jovem pelo ator Stephen Kankole.

Seu objetivo é implementar uma classe que realiza as seguintes queries sobre uma dada coleção de filmes:

<details>
<summary>Consulta 1. Retorne uma lista com os filmes lançados em um ano específico.</summary>
Será testado:
    Consulta 1 - consulta com base em coleção vazia deve retornar um conjunto vazio
    Consulta 1 - consulta deve retornar resultados corretos
</details>

<details>
<summary>Consulta 2. Retorna uma lista ordenada com os nomes de todos os atores e atrizes.</summary>
Será testado:
    Consulta 2 - consulta com base em coleção vazia deve retornar um conjunto vazio
    Consulta 2 - consulta deve retornar resultados corretos
</details>

<details>
<summary>Consulta 3. Retorna um Map que tem como chave os atores ou atrizes e como valor um conjunto com os filmes que eles interpretaram.</summary>
Será testado:
    Consulta 3 - consulta com base em coleção vazia deve retornar um conjunto vazio
    Consulta 3 - consulta deve retornar resultados corretos
</details>

<details>
<summary>Consulta 4. Artistas que interpretaram a si próprios.</summary>
Será testado:
    Consulta 4 - consulta com base em coleção vazia deve retornar um conjunto vazio
    Consulta 4 - consulta deve retornar um conjunto vazio quando nenhum artista atende ao requisito
    Consulta 4 - consulta deve retornar resultados corretos
</details>

<details>
<summary>Consulta 5. Artistas que atuaram em filmes de uma determinada pessoa diretora, por ordem alfabética.</summary>
Será testado:
    Consulta 5 - consulta com base em coleção vazia deve retornar uma lista vazia
    Consulta 5 - consulta deve retornar uma lista vazia quando nenhum artista atende ao requisito
    Consulta 5 - consulta deve retornar resultados corretos na ordem correta
    Consulta 5 - nenhum artista deve aparecer mais de uma vez na lista de resultados
</details>

<details>
<summary>Consulta 6. Filmes em que a pessoa diretora atuou (ou pelo menos um deles), por ordem de lançamento (mais recentes primeiro).</summary>
Será testado:
    Consulta 6 - consulta com base em coleção vazia deve retornar uma lista vazia
    Consulta 6 - consulta deve retornar uma lista vazia quando nenhum filme atende ao requisito
    Consulta 6 - consulta deve retornar resultados corretos na ordem correta
    Consulta 6 - nenhum filme deve aparecer mais de uma vez na lista de resultados
</details>

<details>
<summary>Consulta 7. [Bônus] Filmes lançados num determinado ano, agrupados por categoria.</summary>
Será testado:
Consulta 7 - consulta com base em coleção vazia deve retornar um Map vazio
Consulta 7 - consulta deve retornar um Map vazio quando nenhum filme atende ao requisito
Consulta 7 - consulta deve retornar resultados corretos
Consulta 7 - filme que atende os requisitos e pertence a mais de uma categoria deve aparecer em todas elas
</details>



Observações:

- "Artistas que interpretaram a si próprios" se refere a atores ou atrizes que, em pelo menos um filme, têm o seu nome como uma das chaves do Map `actorsByCharacters` e também como um dos itens pertencentes ao conjunto associado a esta mesma chave.

- "Artistas que atuaram em filmes de uma determinada pessoa diretora" se refere a artistas que, em pelo menos um filme, têm o seu nome como um dos itens do campo `actors`, simultaneamente, em que a pessoa diretora em questão tem o seu nome como um dos itens do campo `directors`.

- "Filmes em que a pessoa diretora atuou (ou pelo menos um deles)" se refere a filmes em que pelo menos um dos itens do campo `directors` também é um item do campo `actors`.

## Requisitos do código

<details>
<summary>Detalhes</summary>
Você deve escrever seu código no arquivo `Queries.java`.

Cada método equivale a uma das queries. Cada método deve retornar dados obtidos do atributo `movies` que pertence à classe, atendendo ao requisito de cada consulta. Repare nos tipos retornados:

- A primeira consulta retorna um `Set<>`, pois os resultados não têm uma ordem definida.
- A segunda consulta retorna `List<>`, pois os resultados são dispostos em ordem alfabética.
- A terceira consulta retorna `List<>`, pois os resultados são dispostos em ordem de lançamento.
- A quarta consulta retorna um `Map<String, Set<Movie>>`. As chaves (`String`) do Map representam uma categoria, enquanto os valores (`Set<Movie>`) representam o conjunto de filmes que se encaixam nessa categoria.

⚠️ **Importante!** Você nunca deve retornar `null`. Se nenhum dos itens atende aos requisitos da consulta, retorne uma coleção (Set, List ou Map) vazia.

Você também deve prestar atenção à possibilidade de um item ser incluso mais de uma vez na coleção retornada:
- A coleção Set não muda quando se adiciona um item que já pertencia ao conjunto. Portanto, você não precisa se preocupar com duplicidade na consulta 1, em que o tipo retornado é Set.
- A coleção List permite a existência de itens duplicados. Porém, **as queries 2 e 3 (que retornam Lists) não devem retornar coleções contendo itens duplicados**. Certifique-se de que cada artista/filme apareça na lista no máximo uma vez.
- Na consulta 4, se um mesmo filme se encaixa em mais de uma categoria, ele deve estar presente em todos os conjuntos correspondentes. Por consequência, o filme vai aparecer mais de uma vez dentro do Map.

Você pode implementar os métodos da classe `Queries` de duas formas:

- Por meio de manipulação direta de coleções, construindo Lists, Sets e Maps manualmente, iterando coleções usando `for` e chamando métodos como `add()`, `addAll()` e `get()`.
- Por meio da API `java.util.stream`, chamando métodos como `stream`, `filter`, `map`, `flatMap` e `collect`.

As duas formas são válidas, sendo possível inclusive utilizar as duas ao mesmo tempo. O importante é que os dados sejam retornados conforme o requisito de cada consulta.
</details>

## Validação do código

<details>
<summary>Detalhes</summary>
Para conseguir rodar o seu código e verificar se ele funciona, você pode usar a classe do arquivo `Main.java`.

A classe `Movies` contém alguns filmes que possuem dados incompletos, mas que servem bem ao propósito de validar o resultado das queries. Essa classe estará disponível para você utilizar e também ler o código fonte, caso necessite. Existe outra classe auxiliar, `MovieConstructor`, que também será disponibilizada, mas você não precisa se preocupar com ela, já que sua função é facilitar o carregamento dos dados da classe `Movies`.

</details>

Para garantir a experiência completa, não tire os olhos da tela. Bom filme! Quer dizer... boa sorte no desafio! 🍿

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-consulta-filmes).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->
