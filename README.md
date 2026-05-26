# 📘 Exercício de Vetores em Java

Este projeto foi criado para praticar o uso de **vetores (arrays)** em Java de uma forma simples e fácil de entender.

O programa trabalha com números dentro de um vetor e realiza várias operações automaticamente, como:

- ➕ Somar os números
- 📊 Calcular a média
- 🔍 Descobrir o maior número
- 🔍 Descobrir o menor número
- 📥 Inserir novos valores
- ✏️ Alterar posições do vetor
- ❌ Remover elementos

---

# ☕ Tecnologias Utilizadas

- Java
- Vetores (Arrays)
- Estrutura de repetição `for`
- Condicionais `if`

---

# 📂 Código do Projeto

```java
public class CriandoVetor {

    public static void main(String[] args) {

        int[] numeros = {15,25,35,45,55};

        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {

            soma += num;

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        double media = (double) soma / numeros.length;

        System.out.println("=========== Soma,Media,Maior e Menor valor ===============");
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);

        // ==================== INSERÇÃO ====================

        int[] novoVetor = new int[numeros.length + 1];

        for (int i = 0, j = 0; i < novoVetor.length; i++) {

            if (i == 2) {
                novoVetor[i] = 20;
            } else {
                novoVetor[i] = numeros[j];
                j++;
            }
        }

        System.out.println("======================= Insercoes ======================");
        System.out.println("Apos primeira insercao: " + Arrays.toString(novoVetor));

        // ==================== ALTERAÇÃO ====================

        novoVetor[0] = 15;
        novoVetor[4] = 88;

        System.out.println("Apos nova insercao: " + Arrays.toString(novoVetor));

        // ==================== REMOÇÃO ====================

        int[] vetorRemovido = new int[novoVetor.length - 1];

        for (int i = 0, j = 0; i < novoVetor.length; i++) {

            if (i != 3 && i != 4) {
                vetorRemovido[j] = novoVetor[i];
                j++;
            }
        }

        System.out.println("======================= Remocoes ======================");
        System.out.println("Apos remocao : " + Arrays.toString(vetorRemovido));
    }
}
```

---

# 🧠 Entendendo o Código Passo a Passo

---

# 🔢 1. Criando o Vetor

```java
int[] numeros = {15,25,35,45,55};
```

Aqui foi criado um vetor chamado `numeros`.

Pense nele como uma pequena caixa que guarda vários números juntos.

O vetor ficou assim:

| Posição | Valor |
|---|---|
| 0 | 15 |
| 1 | 25 |
| 2 | 35 |
| 3 | 45 |
| 4 | 55 |

⚠️ Importante:
Em programação, os vetores começam na posição `0` e não na posição `1`.

---

# 📦 2. Criando Variáveis Auxiliares

```java
int soma = 0;
int maior = numeros[0];
int menor = numeros[0];
```

Essas variáveis ajudam o programa a guardar informações:

- `soma` → guarda a soma dos números
- `maior` → guarda o maior número encontrado
- `menor` → guarda o menor número encontrado

---

# 🔄 3. Percorrendo o Vetor

```java
for (int num : numeros)
```

Esse `for` percorre todos os números do vetor automaticamente.

É como se o programa estivesse dizendo:

> “Vou pegar um número de cada vez até acabar o vetor.”

---

# ➕ 4. Somando os Valores

```java
soma += num;
```

Aqui o programa vai somando os números.

Exemplo:

```text
0 + 15 = 15
15 + 25 = 40
40 + 35 = 75
75 + 45 = 120
120 + 55 = 175
```

No final:

```text
Soma = 175
```

---

# 📈 5. Descobrindo o Maior Número

```java
if (num > maior) {
    maior = num;
}
```

O programa compara os números um por um.

Se encontrar um número maior, ele troca o valor da variável `maior`.

Exemplo:

```text
15 → maior
25 → novo maior
35 → novo maior
45 → novo maior
55 → novo maior
```

Resultado final:

```text
Maior = 55
```

---

# 📉 6. Descobrindo o Menor Número

```java
if (num < menor) {
    menor = num;
}
```

Agora o programa procura o menor número.

Como o `15` já era o menor, ele continua igual até o final.

Resultado:

```text
Menor = 15
```

---

# 📊 7. Calculando a Média

```java
double media = (double) soma / numeros.length;
```

Aqui o programa faz:

```text
175 ÷ 5 = 35
```

O `.length` serve para descobrir quantos números existem no vetor.

---

# 📥 8. Inserindo um Novo Número

```java
int[] novoVetor = new int[numeros.length + 1];
```

Vetores em Java possuem tamanho fixo.

Isso significa que não dá para simplesmente adicionar um novo número.

Então o programa cria outro vetor maior.

---

## Inserindo o valor 20

```java
if (i == 2) {
    novoVetor[i] = 20;
}
```

O número `20` será colocado na posição `2`.

O vetor ficará assim:

```text
[15, 25, 20, 35, 45, 55]
```

---

# ✏️ 9. Alterando Valores

```java
novoVetor[4] = 88;
```

Aqui o valor da posição `4` foi alterado para `88`.

Novo resultado:

```text
[15, 25, 20, 35, 88, 55]
```

---

# ❌ 10. Removendo Valores

```java
if (i != 3 && i != 4)
```

O programa ignora as posições `3` e `4`.

Ou seja, esses números não serão copiados para o novo vetor.

Resultado final:

```text
[15, 25, 20, 55]
```

---

# ▶️ Resultado no Console

```bash
=========== Soma,Media,Maior e Menor valor ===============
Soma: 175
Maior: 55
Menor: 15
Media: 35.0

======================= Insercoes ======================
Apos primeira insercao: [15, 25, 20, 35, 45, 55]

Apos nova insercao: [15, 25, 20, 35, 88, 55]

======================= Remocoes ======================
Apos remocao : [15, 25, 20, 55]
```

---

# 🎯 O Que Foi Aprendido Neste Exercício

✅ Como criar vetores em Java  
✅ Como percorrer vetores  
✅ Como somar números  
✅ Como encontrar maior e menor valor  
✅ Como calcular média  
✅ Como inserir novos elementos  
✅ Como alterar posições  
✅ Como remover elementos  

---

# 📚 Conclusão

Este exercício é muito importante para entender como os vetores funcionam na prática.

Ele ajuda bastante no aprendizado de lógica de programação e prepara para estruturas mais avançadas no futuro.

---

# 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática em Java.
