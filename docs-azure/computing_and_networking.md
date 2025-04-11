## Computação e rede

Comparação entre tipos de computação, incluindo instâncias de contêiner, máquinas virtuais e funções. Entender os recursos exigidos para as máquinas virtuais. Definir pontos de extremidade públicos e privados. Vamos descrever as opções de máquina virtual, incluindo VMs(máquinas virtuais), conjuntos de dimensionamento de máquinas virtuais, conjuntos de disponibilidade de máquinas virtuais e a Área de Trabalho virtual do Azure.

### Tipos de computação

A computação do Azure é um serviço sob demanda que fornece recursos de computação, como discos, processadores, memória, rede e sistemas operacionais.

Exemplos:
* Máquinas Virtuais
* Aplicativos para serviços
* Contêiner
* Serviços de Kubernetes do Azure(AKS)
* Área de trabalho virtual do Azure

---

### Máquinas virtuais

As máquinas virtuais do Azure(VMs) são emulações de software de computadores físicos. Inclui processador virtual, memória, armazenamento e rede. Oferta de IaaS que oferece personalização e controle total.

**Conjunto de dimensionamento de VMs**: Os conjuntos de dimensionamento oferecem uma oportunidade de balanceamento de carga pra dimensionar os recursos dinamicamente.

**Conjunto de disponibilidade de VMs**: É um recurso de alta disponibilidade utilizado para garantir que as máquinas virtuais (VMs) de uma aplicação estejam distribuídas para minimizar o impacto de falhas planejadas ou não planejadas na infraestrutura. Objetivo é evitar que múltiplas VMs de um mesmo serviço fiquem indisponíveis ao mesmo tempo, aumentando a resiliência da aplicação hospedada na nuvem.

**Como funciona?**

O conjunto de disponibilidade organiza as VMs em dois níveis de redundância:
* **Domínios de Falha (Fault Domains - FDs)**: Representam um agrupamento de recursos físicos (como servidores, racks, fontes de energia e redes). As VMs são distribuídas entre diferentes domínios de falha para evitar que uma falha física afete todas de uma vez. Azure garante que as VMs em diferentes FDs não compartilham a mesma infraestrutura física.
* **Domínios de Atualização (Update Domains - UDs)**: Representam grupos de VMs que podem ser reiniciadas juntas durante manutenções planejadas do Azure (como atualizações de software ou hardware). As VMs são distribuídas entre diferentes UDs para garantir que atualizações não causem indisponibilidade total da aplicação.

---

### Área de trabalho virtual

É um serviço que disponibiliza uma máquina virtual, onde é possível ao usuário acessar uma área de trabalho, contendo todos os recursos que o sistema operacional(Windows) possui.

Uma alternativa mais barata que enviar uma máquina física a um trabalhador remoto e ficou muito popular na pandemia.

O logon de vários clientes permite que vários usuários façam logon no mesmo computador ao mesmo tempo.

---

### Serviços de contêineres do Azure

Os contêineres do Azure fornecem um ambiente leve e virtualizado que não exige o gerenciamento do sistema operacional e pode responder a alterações sob demanda.

**Instâncias de contêiner do Azure**: Uma oferta de PaaS que permite executar um contêiner ou pod de contêineres no Azure.

**Aplicativos de contêiner do Azure**: Uma oferta de PaaS, como instâncias de contêineres, que pode balancear a carga e escalar.

**Serviço de Kubernetes do Azure**: Um serviço de orquestração para contêineres com arquiteturas distribuídas e grandes volumes de contêineres.

---

### Azure Function

O **Azure Functions** é um serviço de **computação sem servidor (serverless)** da Microsoft Azure que permite executar pequenas unidades de código – chamadas de *functions* – em resposta a eventos, sem a necessidade de gerenciar explicitamente a infraestrutura.

Principais características:

- **Event-driven**: As funções são disparadas por eventos como mensagens em filas, chamadas HTTP, timers, eventos de serviços como Blob Storage, Cosmos DB, entre outros.
- **Serverless**: Você não se preocupa com servidores, escalabilidade ou gerenciamento de infraestrutura. O Azure provisiona recursos conforme necessário.
- **Escalabilidade automática**: A função escala automaticamente de acordo com a demanda (inclusive até zero quando não há uso).
- **Diversidade de linguagens**: Suporta várias linguagens, incluindo C#, JavaScript, Python, Java, PowerShell e TypeScript.
- **Modelos de hospedagem**:
  - **Consumption Plan**: Escala automaticamente e cobra apenas pelo tempo de execução.
  - **Premium Plan**: Para cenários com mais controle de desempenho e tempo de execução prolongado.
  - **Dedicated (App Service Plan)**: Usado quando já se tem uma infraestrutura App Service alocada.

Exemplos de uso:
- Processar arquivos enviados a um blob.
- Automatizar tarefas com base em agendamentos (como cron jobs).
- Responder a requisições HTTP de APIs REST.
- Reagir a eventos em um banco de dados.

---

### Serviço de Aplicativo do Azure

Consistem em uma plataforma totalmente gerenciada para criar, implantar e dimensionar aplicativos Web e APIs rapidamente.

Compatível com Windows e Linux e permite implantações automatizadas por meio do github ou Azure DevOps.

Trabalha com .NET, .NET Core, Node.js, Java, Python ou php.

Ele é uma oferta de PaaS com requisito de nível corporativo de desempenho, segurança e conformidade.

---

### Serviço de Rede do Azure

**Rede Virtual do Azure(VNet)**: Permite que os recursos do Azure se comuniquem entre si, com a Internet e com as redes locais.

As sub-redes virtuais segmentam sua rede para atender às suas necessidades. O emparelhamento conecta suas redes privadas diretamente.

Pontos de extremidade públicos, acessíveis de qualquer lugar na Internet.

Pontos de extremidade privados, acessíveis somente dentro da sua rede.

**Gateway de VPN**: É usado para enviar tráfego criptografado entre uma rede virtual do Azure e um no local pela Internet púlica.

**ExpressRoute**: Estende as redes locais para o Azure por meio de uma conexão privada facilitada por um provedor de conectividade, em resumo, puxar uma fibra do on-premisses até o datacenter da Azure.

**DNS do Azure**: Domain Name System permite confiabilidade e desempenho aproveitando uma rede global de servidores de nome DNS usando a rede Anycast.

A segurança do DNS do Azure baseia-se no gerenciador de recursos do Azure, habilitando o controle de acesso baseado em função e o monitoramento e o registro em log.

Facilidade de uso para gerenciar seus recursos externos e do Azure com um único serviço de DNS.

As redes virtuais personalizáveis permitem que você use nomes de domínio privados e totalmente personalizados em suas redes virtuais privadas. Os registros de alias dão suporte a conjuntos de registros de alias para apontar diretamente para um recurso do Azure.