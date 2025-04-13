# Azure Language Studio

## O que é?

O **Azure Language Studio** é uma ferramenta baseada na web oferecida pela Microsoft que permite explorar, testar e implementar recursos do serviço **Azure AI Language** (anteriormente conhecido como Text Analytics). Ele oferece uma interface gráfica interativa para criar, treinar e testar modelos de **Processamento de Linguagem Natural (PLN)**, sem a necessidade de codificação.

---

## Funcionalidades principais

O Language Studio permite trabalhar com várias capacidades de PLN:

- **Análise de Sentimento**: Detecta polaridade (positivo, negativo, neutro, misto) em textos.
- **Extração de Entidades Nomeadas (NER)**: Identifica nomes de pessoas, locais, organizações, etc.
- **Reconhecimento de Entidades Personalizadas**: Treine seus próprios modelos para reconhecer entidades específicas do seu domínio.
- **Classificação de Texto Personalizada**: Treinamento supervisionado para classificar textos em categorias definidas.
- **Análise de Opinião**: Vai além da análise de sentimento e mapeia opiniões a aspectos específicos.
- **Tradução e Detecção de Idioma** (via integração com outros serviços Azure Cognitive).

---

## Como funciona

### 1. **Acesso**
- Via navegador, no link: [https://language.azure.com](https://language.azure.com)
- Requer login com conta Microsoft e subscrição do Azure.

### 2. **Criação de Projetos**
- Interface intuitiva para criar projetos de PLN.
- Upload de datasets diretamente na interface.
- Treinamento e teste de modelos com visualização dos resultados.

### 3. **Publicação**
- Modelos treinados podem ser publicados como **serviços web** via **Azure Cognitive Services**.
- Integração facilitada com aplicações por meio de **APIs REST** ou SDKs (.NET, Python, Java, etc.).

---

## Exemplo de caso de uso

> **Cenário**: Classificar chamados de suporte técnico.

1. O usuário importa um conjunto de dados com descrições de chamados.
2. Define categorias como "Erro de Sistema", "Problema de Login", "Solicitação de Acesso", etc.
3. Treina um modelo de classificação de texto personalizado.
4. Publica o modelo como um endpoint e consome via API na aplicação de Help Desk.

---

## Segurança e conformidade

- Os dados podem ser processados localmente na conta do usuário.
- Compatível com **GDPR**, **ISO 27001**, **HIPAA**, entre outros padrões.
- Suporte a **data residency** e **controle de acesso baseado em roles (RBAC)**.

---

## 📚 Referências oficiais

- [Documentação do Azure AI Language](https://learn.microsoft.com/pt-br/azure/ai-services/language-service/)
- [Introdução ao Azure Language Studio](https://learn.microsoft.com/pt-br/azure/ai-services/language-service/language-studio)
- [Exemplos de uso com SDKs](https://learn.microsoft.com/pt-br/azure/ai-services/language-service/quickstarts)

---

# Azure Bot Services

## O que é?

O **Azure Bot Services** é uma plataforma oferecida pela Microsoft para o desenvolvimento, hospedagem e gerenciamento de bots inteligentes. Ele permite a criação de assistentes virtuais e bots de conversação com suporte para múltiplos canais, como Microsoft Teams, Facebook Messenger, Slack, Telegram, entre outros.

A plataforma integra-se com o **Bot Framework SDK** e serviços de inteligência artificial do Azure, como o **Azure AI Language**, **Cognitive Services** e **Azure OpenAI**, permitindo a construção de bots que compreendem linguagem natural, respondem dinamicamente e aprendem com interações.

---

## Funcionalidades principais

- **Criação de bots com linguagem natural**: Integração com o Language Understanding (LUIS) ou Azure AI Language para interpretar intenções e entidades.
- **Compatibilidade com múltiplos canais**: Possibilidade de publicar o bot em diversos canais com pouca ou nenhuma alteração de código.
- **Hospedagem gerenciada no Azure**: Disponível como Web App Bot ou com hospedagem personalizada usando App Service.
- **Autenticação e controle de acesso**: Integração com Azure AD e provedores de identidade externos.
- **Telemetria e monitoramento**: Suporte a Application Insights para coleta de logs, métricas e rastreamento de conversas.

---

## Arquitetura geral

1. **Bot Application**: Desenvolvido com o Bot Framework SDK (C#, Node.js), trata lógica de conversação.
2. **Canal de Comunicação**: Conecta o bot a usuários por meio de canais como Teams, Web Chat, etc.
3. **Azure Bot Channel Service**: Atua como gateway para os canais e fornece integração unificada.
4. **Serviços Cognitivos (opcional)**: Serviços como Azure AI Language, QnA Maker ou Azure OpenAI para entendimento de linguagem e geração de respostas.

---

## Fluxo básico de desenvolvimento

1. **Criação do bot**
   - Pode ser iniciado via Azure Portal, CLI ou ferramentas como o Bot Framework Composer.
2. **Desenvolvimento**
   - Utiliza o SDK do Bot Framework.
   - Implementação de diálogos, fluxos e conectores com serviços externos.
3. **Publicação**
   - Bot hospedado no Azure (App Service) ou em ambiente local/contêiner.
4. **Conexão a canais**
   - Configuração dos canais desejados no portal do Azure Bot Services.
5. **Monitoramento e melhoria contínua**
   - Uso de Application Insights e feedback de usuários para melhorias.

---

## Exemplos de casos de uso

- Assistente virtual corporativo para suporte interno de TI
- Bot para atendimento ao cliente com integração a sistemas de CRM
- Chatbot de e-commerce para recomendação de produtos
- Agentes conversacionais integrados ao Microsoft Teams para automação de tarefas

---

## Segurança e conformidade

- Suporte a autenticação com OAuth2 e Azure AD.
- Possibilidade de criptografia de dados em trânsito e em repouso.
- Conformidade com padrões como GDPR, ISO/IEC 27001, SOC 2, entre outros.

---

## Referências oficiais

- [Visão geral do Azure Bot Service](https://learn.microsoft.com/pt-br/azure/bot-service/bot-service-overview-introduction)
- [Documentação do Bot Framework](https://learn.microsoft.com/pt-br/azure/bot-service/bot-builder-overview)
- [Exemplos de código com Bot Framework SDK](https://github.com/microsoft/BotBuilder-Samples)
- [Azure Bot Framework Composer](https://learn.microsoft.com/pt-br/composer/)

---

# Compreensão da linguagem  coloquial

Refere-se à capacidade de sistemas de processamento de linguagem natural (PLN) de interpretar e entender expressões informais, gírias, regionalismos, abreviações e estruturas gramaticais não convencionais utilizadas na comunicação do dia a dia.

Diferente da linguagem formal, a coloquial apresenta variações contextuais, ambiguidade e maior dependência do contexto cultural. Para tratá-la, modelos de PLN precisam ser treinados com dados reais e diversos, e frequentemente utilizam técnicas como embeddings contextuais (ex: BERT, GPT) e ajuste fino (fine-tuning) com corpora(plural de corpus (vários conjuntos de texto)) representativos da fala informal.

Essa habilidade é essencial para aplicações como chatbots, assistentes virtuais e análise de sentimentos em redes sociais.

É definida por uma declaração no contexto de o que eu preciso que faça, a entidade que é um item, algo que pode ser automatizado, também conta com a intenção. Por exemplo:

`Acenda a luz`

Enunciado=Acenda
Entidade=Luz
Intencional=Ordem para

---

# Reconhecimento e síntese de fala

**Reconhecimento da fala** é o processo de converter áudio com fala humana em texto. Já a **síntese da fala** (ou TTS, *Text-to-Speech*) faz o caminho inverso: transforma texto em áudio falado.

Ambas as tecnologias utilizam modelos de aprendizado de máquina treinados com grandes volumes de dados de voz e texto. O reconhecimento de fala é usado em assistentes virtuais, legendas automáticas e transcrição de reuniões. A síntese é comum em leitores de tela, GPS e bots de atendimento.

Esses sistemas devem lidar com sotaques, ruídos, entonações e variações linguísticas para garantir precisão e naturalidade.

---
Claro! Aqui está uma documentação introdutória no mesmo estilo das anteriores, agora focada no **Azure Speech Studio**, com ênfase no serviço de **transcrição de áudio para texto**.

---

# Azure Speech Studio – Transcrição de Áudio para Texto

## O que é o Azure Speech Studio?

O **Azure Speech Studio** é uma plataforma baseada na web da Microsoft que permite experimentar e configurar serviços de fala da **Speech Service API**, parte do **Azure Cognitive Services**. Ele oferece recursos como **transcrição de fala**, **síntese de fala**, **tradução** e **reconhecimento por voz personalizado**, com uma interface gráfica amigável para desenvolvedores e não desenvolvedores.

Neste documento, o foco será na funcionalidade de **transcrição de áudio para texto**, também chamada de **Speech-to-Text** ou **Reconhecimento Automático de Fala (ASR - Automatic Speech Recognition)**.

---

## Funcionalidades da transcrição de fala

- **Conversão de áudio em tempo real ou por lote para texto**
- **Suporte a múltiplos idiomas** (incluindo português brasileiro)
- **Reconhecimento de múltiplos falantes**
- **Pontos de pontuação automáticos e segmentação por sentenças**
- **Modelos personalizados** com vocabulário específico ou termos técnicos
- **Geração de arquivos de legenda (vtt, srt)**
- **Transcrição offline (com SDK apropriado)**

---

## Como funciona

1. **Envio de Áudio**
   - Pode ser um arquivo de áudio (WAV, MP3, etc.) ou fluxo de áudio em tempo real.

2. **Processamento pelo Azure Speech Service**
   - O serviço realiza o reconhecimento de fala com base em modelos treinados para diferentes idiomas e sotaques.

3. **Geração de Texto**
   - O resultado pode incluir timestamps, separação por falante e arquivos formatados (como legendas ou JSON com metadados).

4. **Personalização (opcional)**
   - É possível treinar um **modelo acústico personalizado** ou **dicionário de pronúncia/vocabulário** via Custom Speech, para melhor desempenho em domínios específicos.

---

## Fluxo de uso no Speech Studio

1. **Acesse o portal**: [https://speech.microsoft.com/](https://speech.microsoft.com/)
2. **Escolha “Speech to Text” (Transcription)** na interface.
3. **Envie o arquivo de áudio** ou forneça uma URL.
4. **Selecione o idioma e configurações adicionais** (separação de falantes, formato de saída etc.).
5. **Execute a transcrição** e visualize o texto processado.
6. **Exporte os resultados** em formatos como `.txt`, `.srt`, `.vtt` ou `.json`.

---

## Exemplo de caso de uso

**Cenário**: Uma universidade quer transcrever automaticamente aulas gravadas.

1. Os áudios são enviados ao Speech Studio.
2. A opção de separação de falantes é habilitada.
3. O resultado é um texto com timestamps e falas divididas por professor e alunos.
4. Os arquivos gerados são exportados em formato `.vtt` para uso em vídeos com legenda automática.

---

## Considerações técnicas

- **Limitações de tamanho**: Áudios longos podem precisar ser segmentados.
- **Qualidade do áudio** influencia diretamente a precisão da transcrição.
- **Treinamento personalizado** pode melhorar a precisão em domínios técnicos ou com vocabulário específico.
- **Custo**: Cobrado por minuto de áudio processado. Há uma cota gratuita mensal no plano de estudante e na conta gratuita padrão.

---

## Integração com APIs e SDKs

Além da interface do Speech Studio, a transcrição pode ser feita via:

- **API REST**
- **SDKs para Python, C#, Java, JavaScript**
- **Containers locais** (para execução offline)

---

## Referências

- [Speech to Text – Visão geral](https://learn.microsoft.com/pt-br/azure/ai-services/speech-service/speech-to-text)
- [Speech Studio – Portal](https://speech.microsoft.com/)
- [Exemplo com SDK em Python](https://learn.microsoft.com/pt-br/azure/ai-services/speech-service/quickstarts)
- [Custom Speech (personalização)](https://learn.microsoft.com/pt-br/azure/ai-services/speech-service/custom-speech-overview)

---

# Lab - Utilizando a ferramenta Speech Studio - Transcrição de áudio para texto 

Primeiro precisamos criar um recurso para então utilizar os serviços. No passo 3 temos de colocar `lab-speech-studio`, separado não funciona.

![Parte_01](https://github.com/user-attachments/assets/3f51dfac-99a7-4385-a19f-82d7d6dd7032)

Após criado o recurso, podemos fechar no ícone.

![Parte_02](https://github.com/user-attachments/assets/a42caa80-d616-4b11-b582-46f4be3cdf17)

Selecionamos a opção "Conversão de fala em texto"

![Parte_03](https://github.com/user-attachments/assets/897a2e86-5cb8-49ee-9a10-ec175a5ac21e)

Selecionamos o idioma do áudio que vamos enviar, também podemos selecionar outras parametrizações.

![Parte_04](https://github.com/user-attachments/assets/20c54d37-9146-45ff-8a6d-1fe13d2ca075)

Podemos enviar o ![áudio de exemplo](/gravacao_sobre_lab.mp3) que está nesse repo, em segundo ele já começa a realizar a transcrição.

![Parte_05](https://github.com/user-attachments/assets/45d82303-aa3b-4af4-886b-ef70875c7e79)

Próximos passos: De posse da compreensão de como funciona o serviço, poderíamos utilizar, por meio de uma API ou SDK esse serviço, para criar soluções inovadoras.

---

# Lab - Utilizando a ferramenta do Language Studio - Análise de sentimento e mineração de opnião

Primeiramente no portal da Azure precisamos criar um serviço de linguagem, ele será utilizado no Language Studio.

![Image](https://github.com/user-attachments/assets/5ddb8be2-983d-453f-94d4-e408048f9a66)

Continuamos para criação do recurso.

![Image](https://github.com/user-attachments/assets/ff40ab31-2b2f-42e9-ab32-73b9e843c781)

Inserimos todos os dados necessários e selecionamos "Tipo de preço" como F0. Clicamos em Examinar + Criar, após isso clicamos em Criar.

![Image](https://github.com/user-attachments/assets/327ac9f9-1045-4e64-a3be-996643350f01)

Ao acessar https://language.cognitive.azure.com, teremos uma tela que vamos passar até chegar em "Choose resource".

![Image](https://github.com/user-attachments/assets/2bb4a931-3638-49a0-be04-138d602e5857)

Selecionamos os itens assim como na imagem. Clicamos em "Done".

![Image](https://github.com/user-attachments/assets/befd1b05-e577-46db-91e5-d077cb46fabd)

Na aba "Classify text", classsificação de texto, vamos selecionar o serviço de análise de sentimento e mineração de opnião.

![Image](https://github.com/user-attachments/assets/06381d45-79cb-412b-9d92-ad2a828004f7)

Vamos selecionar o idioma, adicionar o texto alvo, selecionar o checkbox e clicar em "Run". Ele irá começar a fazer a análise.

Texto alvo de exemplo:
```
Participei do Bootcamp Bradesco de Java Cloud Native e a experiência superou minhas expectativas. Além de reforçar fundamentos da linguagem, o programa trouxe uma abordagem prática e atualizada sobre a integração com os serviços da Azure, como deploy de aplicações com App Services, uso do Azure SQL Database e autenticação com Azure AD. A combinação de teoria sólida com desafios práticos me deu confiança para aplicar essas tecnologias em projetos reais. Sem dúvida, uma formação valiosa para quem quer atuar com Java na nuvem.
```

![Image](https://github.com/user-attachments/assets/95a8269e-778e-4e18-be7e-8494eb7f9e39)

Ele irá apresentar os resultados da análise, tento globalmente para a frase, quanto por sentenças. Ele retorna se a frase é positiva, neutra ou negativa.

![Image](https://github.com/user-attachments/assets/e16c7aab-aabc-4133-b9b1-2bf00354e509)

Após realizado o processo, os próximos passos é utilizar esse serviço em nossas soluções inovadoras por meio de API ou SDK, temos link's para documentação e exemplos no gihub.

![Image](https://github.com/user-attachments/assets/c97c3bec-0165-4dbd-a2e6-64d6edfc83ce)
