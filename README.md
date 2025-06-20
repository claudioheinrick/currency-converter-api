# 💱 Conversor de Moedas Java

Este é um projeto simples de **conversor de moedas** feito em **Java** utilizando integração com a **ExchangeRate API**. Criei esse programa com o objetivo de praticar o uso de requisições HTTP, parsing de JSON e interação com o usuário via console.

## 🎯 Funcionalidades

- Conversão de valores entre diferentes moedas.
- Menu interativo com opções numeradas.
- Suporte a várias moedas:
  - BRL (Real)
  - USD (Dólar americano)
  - ARS (Peso argentino)
  - BOB (Boliviano)
  - CLP (Peso chileno)
  - COP (Peso colombiano)
  - EUR (Euro)
  - GBP (Libra esterlina)
  - JPY (Iene japonês)
  - MXN (Peso mexicano)
- Histórico de conversões realizadas (armazenado em memória durante a execução).

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17)
- **API ExchangeRate** (gratuita)
- **Gson** (para manipulação de JSON)

## 🚀 Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java
   ```

2. Compile os arquivos `.java`:
   ```bash
   javac MenuCambio.java CambioBusca.java
   ```

3. Execute o programa:
   ```bash
   java MenuCambio
   ```

4. Escolha a opção de câmbio, informe o valor e veja o resultado.

## 📝 Exemplo de Conversão

```bash
=== CONVERSOR DE MOEDAS ===
1 - USD → BRL
2 - BRL → USD
...
Digite o número da opção desejada: 1
Digite o valor a ser convertido: 100
Resultado da requisição: success
valor convertido = 547.25 BRL
essa é a minha conversão = 547.25
```

## 🔧 Observações

- A API usada possui limite de requisições gratuitas. Caso expire, será necessário gerar uma nova chave de API gratuita no [ExchangeRate API](https://www.exchangerate-api.com/).
- O histórico de conversões não é persistido após o encerramento do programa.

## 📚 Aprendizados

Esse projeto me ajudou a reforçar:
- Manipulação de APIs com Java.
- Tratamento de JSON com Gson.
- Estrutura de menus com `switch`.
- Armazenamento de histórico usando `ArrayList`.

## 📌 Futuras Melhorias

- Persistência de histórico em arquivo `.txt`.
- Permitir conversão entre quaisquer moedas digitando os códigos manualmente.
- Interface gráfica (GUI) usando JavaFX ou Swing.

---

Feito com dedicação. 😄
