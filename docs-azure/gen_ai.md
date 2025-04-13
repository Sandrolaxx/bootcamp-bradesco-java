# IA Generativa e Tecnologias Relacionadas

## 1. O que é IA generativa?

A **IA generativa** é um ramo da inteligência artificial focado na criação de novos conteúdos — como texto, código, imagens, áudio ou vídeo — com base em dados existentes. Essa abordagem ganhou destaque com modelos de linguagem natural que podem gerar conteúdos complexos de forma autônoma.

---

## 2. LLMs – Large Language Models

Os **Large Language Models (LLMs)** são modelos de aprendizado profundo treinados com grandes volumes de texto para aprender padrões linguísticos e semânticos. Eles são a base da IA generativa textual e são capazes de:

- Compreender perguntas em linguagem natural
- Gerar textos coerentes e contextuais
- Traduzir idiomas
- Responder a comandos e instruções

**Exemplos populares**: GPT-4 (OpenAI), LLaMA (Meta), Claude (Anthropic), Gemini (Google)

O **modelo Transformer** é uma arquitetura de rede neural introduzida em 2017 no artigo _“Attention is All You Need”_, por Vaswani et al., e revolucionou o campo de **processamento de linguagem natural (PLN)**.

### O que é o Transformer?

É um modelo baseado inteiramente no mecanismo de **atenção**, sem o uso de estruturas sequenciais como RNNs ou LSTMs. Ele permite processar palavras ou tokens em **paralelo**, o que melhora muito a eficiência e escalabilidade do treinamento.

**Principais Componentes:**

- **Attention (Atenção)**:  
  O coração do Transformer. Permite ao modelo focar em diferentes partes da entrada com diferentes pesos, capturando relações de longo alcance no texto. A versão mais conhecida é a **self-attention**.
- **Encoder**:  
  Lê e codifica a entrada. Usado, por exemplo, em tarefas como tradução e classificação.
- **Decoder**:  
  Gera saídas com base nas representações do encoder. Usado em tarefas de geração de texto.
- **Positional Encoding**:  
  Adiciona informações sobre a posição das palavras (já que o modelo não é sequencial como RNNs).

Por que ele é importante?

- Alta eficiência em **processamento paralelo**
- Capacidade de **aprender dependências complexas** no texto
- Base para modelos como **BERT**, **GPT**, **T5**, **T5**, **LLaMA** e outros **LLMs**

**Exemplos de aplicações**

- Tradução automática (ex: inglês → português)
- Geração de texto (ex: chatbots)
- Resumo automático
- Resposta a perguntas
- Geração de código, imagem, etc.

---

## 3. Tokenização

A **tokenização** é o processo de dividir um texto em unidades menores chamadas **tokens** (palavras, subpalavras ou até caracteres). Os LLMs processam o texto tokenizado internamente para realizar predições ou gerar novos conteúdos.

- Exemplo:  
  Frase: "IA é poderosa"  
  Tokens: `["IA", "é", "poder", "osa"]` (varia conforme o modelo)

A contagem de tokens é importante, pois os modelos têm limites de contexto baseados na quantidade máxima de tokens.

---

## 4. Inserções (In-context learning)

**Inserções** referem-se à capacidade dos LLMs de aprender ou se adaptar **no momento da execução**, com base no contexto fornecido diretamente no prompt. Esse processo é conhecido como **aprendizado no contexto (in-context learning)**.

- Exemplo:  
  Você fornece uma pergunta e algumas instruções ou exemplos anteriores — o modelo usa esse histórico como contexto para responder adequadamente, sem precisar ser re-treinado.

---

## 5. Copilotos

**Copilotos** são assistentes baseados em IA generativa que auxiliam tarefas específicas, integrando LLMs em ferramentas de produtividade ou desenvolvimento.

- Exemplos:
  - **GitHub Copilot**: auxilia na escrita de código
  - **Microsoft Copilot (Office 365)**: auxilia na criação de documentos, e-mails e apresentações
  - **Azure AI Studio Copilot**: auxilia no desenvolvimento de aplicações com IA

Esses copilotos geralmente utilizam LLMs por trás das interfaces, personalizadas por domínio de uso.

---

## 6. Engenharia de prompt (Prompt Engineering)

A **engenharia de prompt** é a prática de elaborar instruções ou comandos de forma estratégica para direcionar o comportamento de um modelo de linguagem.

### Boas práticas:
- Ser claro e específico
- Fornecer contexto relevante
- Usar exemplos (few-shot prompting)
- Definir formatos de saída esperados
- Explorar estratégias como **chain-of-thought prompting**, onde se estimula o modelo a "pensar em etapas"

Essa técnica é fundamental para obter respostas mais úteis, coerentes e alinhadas ao objetivo da aplicação.

---

## Referências e leitura complementar

- [Introdução aos LLMs – Microsoft Learn](https://learn.microsoft.com/pt-br/training/modules/explore-large-language-models/)
- [Tokenization – OpenAI](https://platform.openai.com/tokenizer)
- [Prompt Engineering Guide](https://github.com/dair-ai/Prompt-Engineering-Guide)