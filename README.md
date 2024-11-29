# Cloud Gym

Este é um sistema simples de gerenciamento de academia desenvolvido em Java, sem o uso de frameworks, utilizando conceitos básicos de Programação Orientada a Objetos (POO). Ele permite realizar operações de **CRUD** para alunos, treinadores e treinos, além de associar alunos a treinadores e gerenciar treinos atribuídos.



## 📋 **Funcionalidades**

1. Adicionar, atualizar, listar e remover **alunos**.
2. Adicionar, atualizar, listar e remover **treinadores**.
3. Associar **alunos a treinadores**.
4. Gerenciar **treinos** e atribuí-los a alunos.
5. Exibir lista de treinos de um aluno ou listar alunos de um treinador.



## 🛠️ **Tecnologias Utilizadas**

- **Java**: Linguagem principal.
- **POO (Programação Orientada a Objetos)**: Conceitos como herança, polimorfismo, encapsulamento e abstração.
- Estruturas simples: `ArrayList`, `Scanner` para entrada de dados.



## 🗂️ **Estrutura do Projeto**

O projeto é composto por 7 classes e 1 interface:

1. **Main**  
   Ponto de entrada do sistema que chama o menu principal.

2. **Menu**  
   Gerencia a interação com o usuário por meio de um menu no terminal.

3. **Academia**  
   Classe que implementa a interface `Cadastro` para gerenciar alunos e treinadores.

4. **Pessoa (abstract)**  
   Classe abstrata que define atributos e métodos comuns entre `Aluno` e `Treinador`.

5. **Aluno**  
   Classe que herda de `Pessoa` e adiciona o atributo `objetivo`.

6. **Treinador**  
   Classe que herda de `Pessoa` e gerencia uma lista de alunos.

7. **Treino**  
   Classe que representa os treinos atribuídos aos alunos.

8. **Cadastro (interface)**  
   Interface genérica que define operações básicas de CRUD.



## 🚀 **Como Executar**

1. **Pré-requisitos**:
    - Java Development Kit (JDK) 8+ instalado.
    - Um IDE ou editor de texto (como IntelliJ IDEA, Eclipse ou VS Code) para rodar o código.

2. **Passos**:
    - Clone o repositório ou copie os arquivos do projeto.
    - Abra o projeto em sua IDE preferida.
    - Compile e execute a classe `Main` para iniciar o programa.
    - Interaja com o menu para realizar as operações.



## 📖 **Exemplo de Uso**

### Menu Principal


### Criar um Aluno
1. Escolha a opção **1. Adicionar Aluno**.
2. Digite o nome, idade e objetivo do aluno.
3. O aluno será adicionado à lista e poderá ser associado a um treinador.

### Associar um Aluno a um Treinador
1. Escolha a opção **6. Associar Aluno a Treinador**.
2. Informe os índices do treinador e do aluno desejados.
3. O aluno será associado ao treinador selecionado.

### Criar e Gerenciar Treinos
1. Escolha a opção **8. Criar Treino** para adicionar um treino a um aluno.
2. Escolha a opção **9. Listar Treinos de um Aluno** para visualizar os treinos atribuídos a um aluno específico.


## 📌 **Conceitos de POO Aplicados**

- **Encapsulamento**: Uso de modificadores de acesso para proteger os atributos das classes.
- **Herança**: Classes `Aluno` e `Treinador` herdando de `Pessoa`.
- **Polimorfismo**: Uso de classes genéricas e sobrescrita de métodos.
- **Abstração**: Criação da classe `Pessoa` e da interface `Cadastro` para gerenciar diferentes tipos de objetos.

