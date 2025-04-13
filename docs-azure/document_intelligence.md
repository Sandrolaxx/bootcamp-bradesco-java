Serviços de inteligência de documentos de IA da Azure

A Azure oferece uma variedade de serviços voltados ao processamento de documentos, que combinam visão computacional, processamento de linguagem natural (PLN) e inteligência artificial. A seguir, listo os principais serviços de documentos disponíveis, com foco em suas funcionalidades e diferenciais:

---

## 1. **Azure Document Intelligence** (antigo Form Recognizer)

### Finalidade

Extração automática de **informações estruturadas** de documentos não estruturados (PDFs, imagens, formulários, recibos, etc.).

### Funcionalidades

- Extração de texto, tabelas e campos-chave
- Modelos pré-treinados para faturas, recibos, contratos, identidades, etc.
- Treinamento de **modelos personalizados**
- Classificação de documentos
- Suporte a múltiplos idiomas

### Casos de uso

Automatização de entrada de dados, digitalização de documentos em massa, OCR avançado com estrutura.

Abaixo abordamos mais a fundo sobre essa ferramenta em específico.

---

## 2. **Azure AI Document Translation**

### Finalidade

Tradução de **documentos inteiros** preservando o layout original (PDF, DOCX, PPTX, HTML, etc.).

### Funcionalidades

- Suporte a múltiplos formatos
- Tradução baseada no **Azure Translator**
- Processamento em lote
- Integração com Azure Blob Storage

### Casos de uso

Tradução de conteúdo corporativo, manuais técnicos, arquivos legais ou acadêmicos com manutenção de formatação.

---

## 3. **Azure Cognitive Search + Document Cracking**

### Finalidade

**Indexação e busca inteligente** em grandes volumes de documentos.

### Funcionalidades

- Suporte a arquivos como PDF, DOCX, PPT, etc.
- **Extração de texto automatizada (skillset de OCR)**
- Integração com AI Enrichment (por exemplo, detecção de entidades, linguagem, tradução)
- Integração com o **Azure Blob Storage**

### Casos de uso

Sistemas de busca corporativa, portais de conhecimento, legal discovery, pesquisa acadêmica.

---

## 4. **Azure Computer Vision – OCR**

### Finalidade

Reconhecimento de texto (OCR) em imagens e documentos simples.

### Funcionalidades

- Extração de texto de imagens ou PDFs escaneados
- Suporte a documentos manuscritos (limitado)
- Detecção de layout básico (sem estrutura avançada)

### Casos de uso

Leitura de placas, etiquetas, anotações simples, reconhecimento rápido de documentos.

---

## Comparativo Simplificado

| Serviço                    | OCR Avançado | Layout Estruturado | Tradução | Busca Inteligente | Personalização |
|---------------------------|--------------|---------------------|----------|--------------------|----------------|
| Document Intelligence     | Sim          | Sim                 | Não      | Parcial            | Sim            |
| Document Translation      | Não          | Sim (mantém layout) | Sim      | Não                | Não            |
| Cognitive Search + OCR    | Sim          | Parcial             | Sim      | Sim                | Parcial        |
| Computer Vision – OCR     | Sim          | Não                 | Não      | Não                | Não            |

---

## Referências

- [Document Intelligence (Form Recognizer)](https://learn.microsoft.com/pt-br/azure/ai-services/document-intelligence/)
- [Document Translation](https://learn.microsoft.com/pt-br/azure/ai-services/document-translation/)
- [Azure Cognitive Search](https://learn.microsoft.com/pt-br/azure/search/)
- [OCR com Computer Vision](https://learn.microsoft.com/pt-br/azure/ai-services/computer-vision/overview-ocr)

---

# Azure Document Intelligence

## O que é?

O **Azure Document Intelligence** (anteriormente chamado de **Form Recognizer**) é um serviço baseado em IA que permite extrair informações estruturadas de documentos não estruturados ou semiestruturados, como PDFs, imagens escaneadas e formulários. Ele faz parte do conjunto de **Azure AI Services** e utiliza modelos de **visão computacional e linguagem natural** para identificar campos, tabelas, textos e estruturas presentes em documentos.

É especialmente útil para automatizar processos de entrada de dados, análise de formulários e digitalização de documentos em larga escala.

---

## Funcionalidades principais

- **Extração de texto e layout**: Identifica palavras, parágrafos, tabelas e estrutura visual do documento.
- **Modelos pré-treinados**: Disponíveis para faturas, recibos, contratos, carteiras de identidade, passaportes, entre outros.
- **Modelos personalizados**: Permite treinar o serviço com seus próprios documentos e rótulos.
- **Classificação de documentos**: Capacidade de detectar automaticamente o tipo de documento recebido.
- **Análise de documentos em lote ou em tempo real**
- **Suporte a múltiplos idiomas**, incluindo português

---

## Fluxo de uso

1. **Upload do documento** (PDF, JPEG, PNG, PMP, TIFF)
2. **Processamento com modelo pré-treinado ou personalizado**
3. **Extração dos dados** (texto, tabelas, campos, etc.)
4. **Visualização e exportação dos resultados** em JSON ou outros formatos estruturados

---

## Onde usar

- Automação de contas a pagar/receber
- Processamento de contratos e documentos jurídicos
- Extração de dados de formulários governamentais
- Digitalização de registros médicos, educacionais ou financeiros

---

## Como acessar

- Via portal: [https://portal.azure.com](https://portal.azure.com)
- Via interface gráfica: [https://documentintelligence.azure.com](https://documentintelligence.azure.com)
- Por meio de **API REST** ou **SDKs** disponíveis em linguagens como Python, C#, Java e JavaScript
- Suporte a execução em containers (para ambientes on-premises)

---

## Exemplo de aplicação

**Cenário**: Uma empresa recebe centenas de faturas mensais em PDF.

1. O Document Intelligence extrai automaticamente os dados como número da nota, valor total, data e CNPJ.
2. As informações são integradas ao ERP da empresa via API.
3. Todo o processo ocorre sem intervenção manual, reduzindo erros e aumentando a eficiência.

---

## Referências

- [Visão geral do Document Intelligence](https://learn.microsoft.com/pt-br/azure/ai-services/document-intelligence/overview)
- [Quickstart com modelo pré-treinado](https://learn.microsoft.com/pt-br/azure/ai-services/document-intelligence/quickstarts/get-started-with-document-intelligence)
- [Treinamento de modelos personalizados](https://learn.microsoft.com/pt-br/azure/ai-services/document-intelligence/customize-model)