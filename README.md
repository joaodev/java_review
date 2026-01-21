# 📚 Java Review - Fundamentos e Controle de Fluxo

Um projeto educacional completo com exemplos práticos de fundamentos Java, estruturas de controle e desafios de programação.

## 📖 Sobre o Projeto

Este repositório contém uma revisão estruturada dos conceitos fundamentais de Java, com foco em:
- **Fundamentos**: Tipos primitivos, operadores, conversões e manipulação de strings
- **Estruturas de Controle**: Condicionais e loops com exemplos práticos
- **Desafios**: Exercícios práticos para consolidar o aprendizado

Perfeito para revisão de conceitos básicos ou como material de estudo para iniciantes em Java.

## 📁 Estrutura do Projeto

```
java_review/
│
├── src/
│   ├── fundamentals/           # Conceitos fundamentais de Java
│   │   ├── others/             # Exemplos gerais (programa inicial, console, etc)
│   │   ├── numbers/            # Conversão numérica e tipos primitivos
│   │   ├── operators/          # Operadores (aritmético, relacional, lógico, etc)
│   │   ├── strings/            # Manipulação de strings
│   │   └── challenges/         # Desafios de aritmética e operações
│   │
│   └── control/                # Estruturas de controle de fluxo
│       ├── conditionals/       # Condicionais (if, else, switch)
│       ├── loops/              # Estruturas de repetição (for, while, do-while)
│       └── challenges/         # Desafios envolvendo controle de fluxo
│
└── README.md                   # Este arquivo
```

## 🎓 Conteúdo por Módulo

### Fundamentals (Fundamentos)

#### Others
- `FirstProgram.java` - Primeiro programa: inicialização básica
- `Console.java` - Manipulação de console e saída
- `Import.java` - Uso de imports e bibliotecas
- `DotNotation.java` - Notação de ponto para acesso a membros
- `PrimitiveTypes.java` - Tipos de dados primitivos
- `ObjectVsPrimitive.java` - Diferenças entre objetos e primitivos
- `Wrappers.java` - Classes wrapper (Integer, Double, etc)
- `Inference.java` - Inferência de tipos (var)
- `Calculator.java` - Exemplo de calculadora
- `Temperature.java` - Conversão de temperaturas
- `CircumferenceArea.java` - Cálculo de perímetro e área

#### Numbers
- `PrimitiveTypeConversion.java` - Conversão entre tipos primitivos
- `StringNumberConversion.java` - Conversão entre strings e números

#### Operators
- `ArithmeticOperators.java` - Operadores aritméticos (+, -, *, /, %)
- `AssignmentOperators.java` - Operadores de atribuição (+=, -=, etc)
- `RelationalOperators.java` - Operadores relacionais (==, !=, <, >, etc)
- `LogicalOperators.java` - Operadores lógicos (&&, ||, !)
- `UnaryOperators.java` - Operadores unários (++, --, !)
- `TernaryOperators.java` - Operador ternário (? :)

#### Strings
- `StringType.java` - Tipo String e propriedades
- `StringEqualsType.java` - Comparação de strings
- `StringNumberConversion.java` - Conversão de strings e números

#### Challenges
- `ArithmeticChallenge.java` - Desafio: cálculos matemáticos complexos
- `ConversionChallenge.java` - Desafio: conversão de tipos
- `LogicalChallenge.java` - Desafio: operações lógicas

### Control (Controle de Fluxo)

#### Conditionals
- `IfControl.java` - Estrutura if simples
- `IfElseControl.java` - Estrutura if-else
- `IfElseIfControl.java` - Estrutura if-else if
- `Switch1Control.java` - Switch básico
- `Switch2Control.java` - Switch avançado
- `Break1Control.java` - Uso de break em condicionais
- `Break2Control.java` - Uso de break em loops
- `Continue1Control.java` - Uso de continue em loops
- `Continue2Control.java` - Continue com múltiplos cenários

#### Loops
- `For1Loop.java` - Loop for básico
- `For2Loop.java` - For com múltiplas variáveis
- `For3Loop.java` - For com variações
- `WhileDeterminedLoop.java` - While com condição determinada
- `WhileIndeterminateLoop.java` - While com condição indeterminada
- `DoWhileLoop.java` - Loop do-while

#### Challenges
- `ForChallenge.java` - Desafio: utilização de for
- `WhileChallange.java` - Desafio: utilização de while
- `WeekDayChallenge.java` - Desafio: dias da semana com switch

## 🛠️ Pré-requisitos

- **Java Development Kit (JDK)** 8 ou superior
- **IDE** (recomendado: IntelliJ IDEA ou Eclipse)
- Git (para controle de versão)

## 🚀 Como Executar

### 1. Clonar o repositório
```bash
git clone <URL_DO_REPOSITORIO>
cd java_review
```

### 2. Compilar os arquivos
```bash
javac -d out src/fundamentals/others/*.java
javac -d out src/fundamentals/operators/*.java
javac -d out src/control/loops/*.java
# ... etc para outros módulos
```

### 3. Executar um programa
```bash
java -cp out fundamentals.others.FirstProgram
java -cp out fundamentals.operators.ArithmeticOperators
java -cp out control.loops.For1Loop
```

### Ou diretamente com a IDE
1. Abra o projeto na sua IDE
2. Navegue até o arquivo `.java` desejado
3. Clique em "Run" ou pressione `Ctrl+Shift+F10` (IntelliJ)

## 📚 Exemplos de Uso

### Executar um programa básico
```bash
java -cp out fundamentals.others.FirstProgram
```

### Executar um programa com entrada do usuário
```bash
java -cp out control.conditionals.IfControl
# Digite a nota quando solicitado
```

### Executar um desafio
```bash
java -cp out fundamentals.challenges.ArithmeticChallenge
java -cp out control.challenges.ForChallenge
```

## 💡 Conceitos Cobertos

### Fundamentos
✅ Tipos primitivos (int, double, boolean, etc)  
✅ Operadores (aritmético, relacional, lógico, ternário)  
✅ Conversão de tipos  
✅ Strings e manipulação de texto  
✅ Classes wrapper  
✅ Inferência de tipos  
✅ Input/Output com Scanner e System.out

### Controle de Fluxo
✅ Estruturas condicionais (if, else, switch)  
✅ Loops (for, while, do-while)  
✅ Break e continue  
✅ Combinações complexas de controle

## 🎯 Sugestões de Estudo

1. **Comece pelos fundamentos**: Execute exemplos em `fundamentals/others/`
2. **Aprenda operadores**: Estude cada tipo de operador em `fundamentals/operators/`
3. **Manipule strings**: Trabalhe com exemplos em `fundamentals/strings/`
4. **Pratique desafios**: Resova os desafios em `fundamentals/challenges/`
5. **Domine controle de fluxo**: Aprenda condicionais em `control/conditionals/`
6. **Trabalhe com loops**: Estude loops em `control/loops/`
7. **Desafie-se**: Resolva todos os desafios em `control/challenges/`

## 🤝 Contribuições

Este é um projeto educacional pessoal. Sinta-se livre para:
- Estudar e aprender
- Adicionar novos exemplos
- Melhorar a documentação
- Criar mais desafios

## 📝 Licença

Este projeto é de uso educacional livre.

## 👨‍💻 Autor

**João Augusto Bonfante**  
📧 joao.dev93@gmail.com

## 📞 Suporte

Para dúvidas sobre os conceitos:
1. Consulte a documentação oficial do Java: [Oracle Java Docs](https://docs.oracle.com/javase/tutorial/)
2. Revise os exemplos no projeto
3. Teste e experimente modificações

---

**Último update**: 2026  
**Status**: ✅ Projeto em revisão contínua
