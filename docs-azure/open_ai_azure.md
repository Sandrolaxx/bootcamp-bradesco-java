# Azure OpenAI Service

## O que é?

O **Azure OpenAI Service** é uma plataforma da Microsoft que fornece acesso aos modelos de linguagem avançados da OpenAI (como GPT-4, GPT-3.5, Codex e DALL·E) através da infraestrutura segura, escalável e integrada do **Microsoft Azure**.

Ele permite incorporar **IA generativa** em aplicações corporativas, com foco em **segurança, conformidade e governança empresarial**.

---

## Principais modelos disponíveis

| Modelo     | Função principal                         |
|------------|-------------------------------------------|
| GPT-4      | Geração e compreensão avançada de texto   |
| GPT-3.5    | Geração de texto com ótimo custo-benefício |
| Codex      | Geração de código a partir de linguagem natural |
| DALL·E     | Geração de imagens a partir de texto      |
| Embeddings | Representação vetorial de textos para busca semântica |

---

## Casos de uso

- **Assistentes virtuais inteligentes**
- **Geração automática de texto e conteúdo**
- **Análise e resumo de documentos**
- **Pesquisa semântica** (com Azure Cognitive Search + Embeddings)
- **Geração de código e copilotos personalizados**
- **Classificação e extração de informações**

---

## Integração com serviços Azure

- **Azure Cognitive Search**: busca semântica com embeddings
- **Azure Machine Learning**: integração para workflows de IA customizados
- **Azure AI Studio**: ambiente visual para construir copilotos com LLMs
- **Segurança e conformidade do Azure**: identidade, monitoramento, rede privada (VNet), etc.

---

## Como funciona o acesso

1. **Solicitação de acesso**: o serviço requer aprovação prévia por questões de uso responsável.
2. **Criação do recurso**: após aprovação, você pode criar um recurso no portal do Azure.
3. **Chamada via API ou SDKs**: uso semelhante à OpenAI API, com suporte a Python, C#, REST etc.
4. **Deploys personalizados**: é possível escolher o modelo e a capacidade (ex: `gpt-35-turbo`, `gpt-4`) por deployment name.

---

## Exemplo de chamada via API REST (simplificado)

```http
POST https://<seu-recurso>.openai.azure.com/openai/deployments/<nome-do-deployment>/chat/completions?api-version=2024-03-01

Headers:
  Content-Type: application/json
  api-key: <sua-chave-de-api>

Body:
{
  "messages": [{"role": "user", "content": "Explique IA generativa"}],
  "max_tokens": 200,
  "temperature": 0.7
}
```

---

## Referências

- [Documentação oficial – Azure OpenAI](https://learn.microsoft.com/pt-br/azure/cognitive-services/openai/)
- [Portal do Azure OpenAI](https://oai.azure.com/)
- [Azure AI Studio](https://ai.azure.com/)

---

Imagem gerada no lab.

![Finalizado!](./outputs/finalizando_bootcamp.png)