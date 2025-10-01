## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Arquitetura do Projeto

Arquitetura em Camadas. Esta escolha foi feita para organizar o código de forma lógica, separando as diferentes responsabilidades do sistema, o que é essencial 
para a manutenção e crescimento do projeto.

## Definição das Camadas

O sistema está organizado nas seguintes camadas lógicas:

Camada de Apresentação (View / UI): Responsável pela interação com o usuário. Em nosso projeto, a classe 
Main.java representa o início dessa camada, que futuramente poderá conter uma interface gráfica ou de console mais elaborada.
Camada de Negócio (Service): Contém a lógica, as regras de negócio e as validações do sistema. A classe 
Clinica.java, com seus métodos de cadastro e agendamento, atua nesta camada.
Camada de Dados (Model / Repository): Composta pelas classes de entidade que representam os dados (Animal, Tutor, Consulta) e, futuramente, pelas classes
que farão o acesso ao meio de armazenamento (arquivos ou banco de dados).
