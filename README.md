Este projeto é uma aplicação Python simples que simula a interação com dois modelos de linguagem (ChatGPT e BERT) e compara suas respostas usando padrões de projeto básicos.

## Objetivo:
Permitir que o usuário envie uma pergunta via terminal e receba respostas simuladas de dois modelos. A melhor resposta é escolhida com base em uma estratégia simples e apresentada ao usuário.

## Funcionalidades:
- Envio de perguntas via terminal (CLI)
- Simulação de respostas de dois modelos: ChatGPT e BERT
- Comparação das respostas usando o padrão Strategy
- Escolha da melhor resposta com notificação via padrão Observer
- Uso dos padrões de projeto: Factory, Command, Strategy e Observer

## Como executar:
1. Certifique-se de ter o Python 3 instalado.
2. Salve o código em um arquivo chamado `main.py`
3. No terminal, execute:

```bash
python main.py
```

4. Digite sua pergunta.

## Estrutura do código
- `ChatGPT` e `BERT`: simulam os modelos de linguagem
- `ModeloFactory`: cria os modelos (Factory)
- `PerguntaCommand`: envia a pergunta (Command)
- `ComparadorSimples`: compara respostas (Strategy)
- `Observador`: mostra a melhor resposta (Observer)

## Requisitos
- Python 3
- Nenhuma biblioteca externa é necessária
