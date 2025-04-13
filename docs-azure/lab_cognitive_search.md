# Azure Cognitive Search

## O que é?

É um serviço gerenciado de busca inteligente que permite incorporar pesquisa de texto completo e análise semântica em aplicativos web e empresariais. Ele combina motor de busca avançado com recursos de inteligência artificial, permitindo enriquecer, indexar e consultar grandes volumes de dados estruturados e não estruturados.

---

## Principais funcionalidades

- **Indexação full-text**: Suporte a consultas com análise linguística, stemming e relevância.
- **AI Enrichment (Habilidades cognitivas)**: Integra serviços como OCR, tradução, reconhecimento de entidades e análise de sentimentos durante a indexação.
- **Filtros, ordenação e facetas**: Recursos de refino e categorização de resultados.
- **Pesquisa semântica** (preview/GA): Usa técnicas de IA para melhorar a relevância com base na intenção da consulta.
- **Autocompletar e sugestões**
- **Integração com Blob Storage, Cosmos DB, SQL, etc.**
- **Alta escalabilidade com SLA garantido**

---

## Fluxo de uso

1. **Fonte de dados**  
   - Documentos (PDFs, DOCX, JSON), bancos de dados, blobs, etc.

2. **Pipeline de indexação com enriquecimento opcional**  
   - Pode incluir OCR, detecção de linguagem, extração de entidades, etc.

3. **Criação de índice**  
   - Define campos, tipos, filtros e comportamento da busca.

4. **Consulta via API**  
   - Os usuários pesquisam através de uma API REST ou SDK.

---

## Exemplos de casos de uso

- Portais de busca empresarial
- Sistemas de FAQ e atendimento ao cliente
- Busca em conteúdo jurídico, acadêmico ou médico
- Indexação de arquivos digitalizados com OCR + NLP

---

## AI Enrichment: Habilidades cognitivas

O Azure Cognitive Search pode usar **habilidades cognitivas** para processar e enriquecer dados durante a indexação:

| Habilidade                 | Função                                 |
|---------------------------|----------------------------------------|
| OCR                       | Extrai texto de imagens e PDFs         |
| Análise de sentimentos    | Avalia o tom emocional de textos       |
| Tradução                  | Traduz conteúdo automaticamente        |
| Detecção de entidades     | Identifica nomes, locais, datas, etc.  |
| Classificação de imagem   | Aplica modelos de visão computacional  |

Essas habilidades podem ser integradas por meio de **skillsets** no pipeline de indexação.

---

## Ferramentas de desenvolvimento

- **Portal do Azure** (interface gráfica para configuração)
- **API REST** (consulta e indexação)
- **SDKs disponíveis**: .NET, Python, Java, JavaScript
- **Data Sources integrados**: Azure Blob, Cosmos DB, SQL Database, entre outros

---

## Referências

- [Visão geral do Azure Cognitive Search](https://learn.microsoft.com/pt-br/azure/search/search-what-is-azure-search)
- [Habilidades cognitivas (AI Enrichment)](https://learn.microsoft.com/pt-br/azure/search/cognitive-search-concept-intro)
- [Quickstart com .NET ou REST](https://learn.microsoft.com/pt-br/azure/search/search-get-started-portal)

---

Lab é realizado com base na documentação https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html

Realizado a tentativa de realizar os processos do lab apresentado, porém mesmo realizando todas as configurações da própria documentação oficial, mesmo assim o indexador ao ser executado retorna o erro "https://labazstorageaccount.blob.core.windows.net/lab-coffe-reviews/review-1.docx'. Keys can only contain letters, digits, underscore (_), dash (-), or equal sign (=). Please see https://docs.microsoft.com/azure/search/search-howto-indexing-azure-blob-storage#DocumentKeys". URL inválida, provavelmente por conta do ponto(`.`) da extensão do arquivo.