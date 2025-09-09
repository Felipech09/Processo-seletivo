class ChatGPT:
    def responder(self, pergunta):
        return "Resposta do ChatGPT para: " + pergunta

class BERT:
    def responder(self, pergunta):
        return "Resposta do BERT para: " + pergunta

class ModeloFactory:
    def criar_modelo(self, tipo):
        if tipo == "chatgpt":
            return ChatGPT()
        elif tipo == "bert":
            return BERT()

class PerguntaCommand:
    def __init__(self, modelo, pergunta):
        self.modelo = modelo
        self.pergunta = pergunta

    def executar(self):
        return self.modelo.responder(self.pergunta)

class ComparadorSimples:
    def comparar(self, resposta1, resposta2):
        if len(resposta1) > len(resposta2):
            return resposta1
        else:
            return resposta2

class Observador:
    def atualizar(self, melhor_resposta):
        print("\n🔔 Melhor resposta escolhida:")
        print(melhor_resposta)

# Programa principal
def main():
    print("=== Pergunte algo aos modelos ===")
    pergunta = input("Digite sua pergunta: ")

    factory = ModeloFactory()
    modelo1 = factory.criar_modelo("chatgpt")
    modelo2 = factory.criar_modelo("bert")

    comando1 = PerguntaCommand(modelo1, pergunta)
    comando2 = PerguntaCommand(modelo2, pergunta)

    resposta1 = comando1.executar()
    resposta2 = comando2.executar()

    print("\n📨 Respostas recebidas:")
    print("ChatGPT:", resposta1)
    print("BERT:", resposta2)

    estrategia = ComparadorSimples()
    melhor = estrategia.comparar(resposta1, resposta2)

    obs = Observador()
    obs.atualizar(melhor)

if __name__ == "__main__":
    main()

