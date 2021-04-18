# Trabalho 4 - Disciplina de Compiladores - UFSCar
O trabalho consiste em criar um compilador para alguma linguagem com as etapas de análise léxica, sintática, semântica e geração de código. 

# Membros do Grupo
Felipe Francisco Berreta RA 422649

# Video de Apresentação da Linguagem
https://youtu.be/qo39uRzM0Io

# Descrição da Linguagem
Para o desenvolvimento foi criada uma pequena linguagem para criação de personagens de rpg. Cada personagem contém três informações, nome, classe (animago, espadachim, necromante, bardo e paladino) e se ele pertence a classe especial. Neste momento todos são considerados classe especial mas, futuramente serão adicionados outras classes e as classes especiais serão apenas animago e necromante. Cada classe possui seus próprios encantamentos de ataque, defesa, fuga e cura, não sendo possível um personagem de determinada classe acessar os encatamentos de outras classes.

# Ambiente de Desenvolvimento e Dependências
* Apache NetBeans IDE 12.0
* JDK 11.0.10
* Maven 8
* ANTLR 4.7.2

# Execução do Projeto
O primeiro passo é baixar o projeto e abri-lo com o Apache NetBeans. Em seguida é necessário usar a opção "Clean and Build" para a compilação do projeto.
Após a compilação do projeto será criado arquivo executável do projeto na pasta target. O arquivo executável deverá ser executádo da seguinte mandeira em um terminal: 

java -jar arquivo_java arquivo_entrada.txt arquivo_saida.txt

Descrição dos arquivos:
* arquivo java(executável): caminho do arquivo executável do projeto.
* arquivo_entrada.txt: caminho do arquivo de entrada.
* arquivo_saida.txt: caminho do arquivo de saída.

Obs.: Lembre-se que são os caminhos absolutos.

Exemplo usando os arquivos de teste do projeto: 
java -jar C:\Users\Felipe\Documents\NetBeansProjects\rpg-maker\target\rpg-maker-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Users\Felipe\Documents\NetBeansProjects\rpg-maker\src\test\CasosDeTeste\entradaSemantico1.txt C:\Users\Felipe\Documents\NetBeansProjects\rpg-maker\src\test\CasosDeTeste\saidaSemantico1.txt

# Casos de Testes
O projeto possui alguns casos de testes predefinidos. Os arquivos de entrada são separados entre sintáticos e semânticos pois cada um deles demonstrará a captura dos erros sintáticos e semânticos nas entradas. Os arquivos de saída mostram as saídas esperadas pelos arquivos de entrada. Nos arquivos de saída foram gerados códigos HTML estilizados, onde os erros serão apresentados nos arquivos de saída. É possível visualizar o código gerado em um navegador.
Os casos de teste estão dentro da pasta Test/CasosDeTestes.

