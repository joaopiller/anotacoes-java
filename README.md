# java-curso

Repositório onde registro meus estudos de Java e os exercícios que faço ao longo do curso.

## Tecnologias

- Java 21
- Gradle 8.14
- JUnit 5

## Estrutura

O código segue a ordem dos cadernos do curso de Java (`c01` a `c12`), com a convenção que o caderno 01 sugere: um pacote por programa, para classes com o mesmo nome (`Tarefa`, `Usuario`) não brigarem.

```text
src/main/java/
├── c01/ … c12/                   ← um diretório por caderno
│   ├── anotacoes/sNN_<secao>/    ← os blocos "// trecho", uma classe por seção do caderno
│   ├── programas/<nome>/         ← os blocos "// Arquivo: X.java", programas completos do caderno
│   └── exercicios/ex1/ … ex4/    ← exercícios do fim do caderno, um pacote cada
└── src/test/java/c12/programas/injecao/ ← o teste JUnit do caderno 12
```

Cada arquivo começa com um comentário dizendo de qual caderno e seção ele vem.

## Rodar

- IntelliJ: seta verde ao lado do `main`.
- Terminal, um arquivo só: `java src/main/java/c01/exercicios/ex1/CartaoApresentacao.java`.
- Gradle: `./gradlew compileJava` (precisa do JDK 21; o Gradle 8.14 não roda no JDK 25).
