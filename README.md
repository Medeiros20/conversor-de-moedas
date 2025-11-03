# Conversor de Moedas (Challenge Alura + ONE G9) 🪙
<p align="center">
<img width="461" height="95" alt="image" src="https://github.com/user-attachments/assets/aa70ea6f-5792-4860-a34d-5d365efc6d2f" />
</p>
Este é um projeto de um conversor de moedas simples, desenvolvido em Java. Ele consome a API da ExchangeRate-API para obter taxas de câmbio em tempo real e permite ao usuário realizar conversões entre os principais pares de moedas através de um menu interativo no console.

## Funcionalidades
- Consulta de taxas de câmbio em tempo real.
- Menu interativo via console para fácil utilização.
- Conversão entre 6 pares de moedas pré-definidos:
- USD → BRL (Dólar para Real Brasileiro)
- BRL → USD (Real Brasileiro para Dólar)
- EUR → BRL (Euro para Real Brasileiro)
- BRL → EUR (Real Brasileiro para Euro)
- USD → EUR (Dólar para Euro)
- EUR → USD (Euro para Dólar)
- Loop de repetição que permite ao usuário realizar múltiplas consultas sem reiniciar o programa.
- Tratamento de erros para entradas inválidas (opções ou valores).

## 🛠️ Tecnologias Utilizadas
- Java 17+
- Gson: Biblioteca para converter objetos Java em JSON e vice-versa.
- Java HttpClient: Biblioteca nativa do Java (desde o Java 11) para fazer requisições HTTP.
- ExchangeRate-API: API de terceiros para fornecimento das taxas de câmbio.

## ⚙️ Como executar o projeto

```bash
# Clone o repositório
git clone https://github.com/Medeiros20/conversor-de-moedas.git

# Acesse a pasta do projeto
cd conversor-de-moedas

# Execute o projeto (exemplo)
java -jar conversor-de-moedas.jar

