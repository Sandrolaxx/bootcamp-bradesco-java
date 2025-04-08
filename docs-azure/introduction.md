## Computação em nuvem

É o fornecimento de computação pela Internet, habilitando inovações mais rápidas, recursos flexíveis e economias de escala. É a virtualização de máquinas em datacenters de grandes players, como AWS, Microsoft e GCP. Também conhecido como self-service, pois somos nos mesmos que acessamos os serviços e escolhemos o que desejamos.

Lá temos:
* Computação
* Rede
* Armazenamento

---

## Tipos de nuvem

**Nuvem privada**: Também conhecida como on-premisses. Nele as organizações criam um ambiente em nuvem em seu datacenter. As organizações são responsáveis por operar os serviços que fornecem. Não fornecem acesso aos usuários fora da organização.
**Nuvem pública**: É o modelo onde grandes vendors, disponibilizam infraestrutura como serviço. A responsabilidade pelo gerenciamento da infraestrutura física é dos fornecedores e a responsabilidade de configuração dos serviços fica por conta das organizações. Várias organizações podem utilizar os serviços em seus respectivos contextos.
**Nuvem hibrida**: Uma utilização em conjunto da nuvem privada em alguns processos e também da nuvem pública em alguns outros serviços. Esse processo ocorre em migrações, ou pode realmente ser utilizado indefinidamente para casos onde determinado serviço possuí um benefício/necessidade de execução na nuvem pública.

### Comparação entre modelos

Nuvem pública:
* Nenhuma despesa para escalar verticalmente(na hora, após 30 dias vem a brincadeira).
* Os aplicativos podem ser provisionados e desprovisionados rapidamente.
* As organizações pagam apenas pelo o que utilizam.

Nuvem privada:
* As organizações têm controle total sobre os recursos e a segurança.
* As organizações são responsáveis pela manutenção e pelas atualizações de hardware. 

Nuvem híbrida:
* As organizações determinam onde executar seus aplicativos.
* As organizações controlam a segurança, a conformidade e os requisitos legais.
* Fornece a maior flexibilidade.

---

## CapEx e OpEx

**CapEx - Despesas de capital**:
* Gasto inicial de dinheiro em infraestrutura física.
* As despesas do CapEx têm um valor que reduz com o tempo.

**OpEx - Despesas operacionais**:
* Gastar com produtos e serviços conforme necessário, pagamento conforme uso.
* Cobrança se inicia imediatamente.

Modelo baseado em consumo, o que significa que os usuários finais pagam somente pelos recursos que usam.

---

## Benefícios da nuvem

### Alta disponibilidade

Recursos disponíveis sempre que necessário, está relacionado à SLA(Service Level Agreement). A Azure em questão se garante que seus serviços sempre estarão 100%(de 99% até 99.95%, na verdade, variando do serviço*) operacionais. Caso o SLA não seja respeitado, a Azure irá te reembolsar pelo período de downtime dos serviços.

![SLA e uptime](https://github.com/user-attachments/assets/54083827-95e7-4f26-a541-5fd388216c06)

### Escalabilidade

A escalabilidade refere-se à capacidade de ajustar a capacidade do ambiente/recurso para atender à demanda.

Capacidade de escalar significa que você poderá adicionar mais recursos para lidar melhor com o aumento da demanda.

Outro benefício de escalabilidade é que você não está pagando além do necessário pelos serviços.

Como a nuvem é um modelo baseado em consumo, você paga apenas pelo que usa. Se a demanda cair, você poderá reduzir seus recursos e, assim, reduzir seus custos.

**Escalabilidade vertical**: Permite adicionar mais capacidade de processamento e armazenamento por meio de aumento de CPU's, RAM e Storage à máquina virtual.

### Elasticidade

Se você experimentasse um salto repentino acentuado na demanda, seus recursos implantados poderiam ser expandidos automaticamente ou manualmente.

Poderíamos adicionar máquinas virtuais ou contêineres por meio da expansão.

Da mesma forma, se houver uma queda significativa na demanda, os recursos implantados poderão ser reduzidos horizontalmente de maneira automática ou manual.

Podemos chamar esse conceito de **Escalabilidade horizontal**.

### Confiabilidade

Devido a design descentralizado, a nuvem naturalmente dá suporte a uma infraestrutura confiável e resiliente.

Com um design descentralizado, a nuvem permite que você tenha recursos implantados em várias regiões do mundo.

Com essa escala global, mesmo que ocorra um evento catastrófico em uma região, as outras regiões ainda estarão em funcionamento.

### Previsibilidade

A previsibilidade na nuvem permite que você avance com confiança, seja no desempenho ou no custo. Ambas são influenciadas pelo Microsoft Azure Well-Architected Framework.

### Segurança

A nuvem oferece ferramentas de segurança que atendem às necessidades dos clientes, mas, é importante lembrar que a implementação de muitas delas deve ser realizada pelo cliente.

Se você quiser o controle máximo da segurança, a infraestrutura como serviço fornecerá recursos físicos, mas permitirá que você gerencie os sistemas operacionais e o software instalado, incluindo aplicações de patches e manutenção.

Se você quiser que a aplicação de patches e a manutenção sejam tratadas automaticamente, as implantações de plataforma como serviço ou software como serviço podem ser as melhores estratégias de nuvem para você.

### Governança

A auditoria baseada em nuvem ajuda a sinalizar qualquer recurso que esteja fora de conformidade com seus padrões corporativos e fornece estratégias de mitigação.

Dependendo do seu modelo operacional, patches de software e atualização também podem ser aplicados automaticamente, o que ajuda na governança e na segurança.

Ao estabelecer uma presença de governança o mais cedo possível, você poderá manter sua presença de nuvem atualizada, protegida e bem gerenciada. Normalmente temos uma parte da T.I responsável por isso, ou às vezes a área de segurança também abraça esse ponto.

### Gerenciabilidade

Um dos principais benefícios da computação em nuvem são as opções de capacidade de gerenciamento. Há dois tipos de capacidade de gerenciamento para computação em nuvem, são eles, gerenciamento pelo provedor de nuvem e gerenciamento pelo cliente.

O gerenciamento da nuvem diz respeito a gerenciar seus recursos de nuvem. Por exemplo:
* Estalar automaticamente a implantação de recursos com base na necessidade.

Recomendado implantar recursos com base em um modelo pré-configurado, removendo a necessidade de configuração manual.

O gerenciamento de nuvem diz respeito à maneira de gerenciar seu ambiente de nuvem e seus recursos. Por exemplo:
* Por meio de um portal na Web
* Usando uma interface de linha de comando
* API's
* Usando o PowerShell

---

## Tipos de serviço de nuvem: IaaS, Paas e SaaS

### Infraestrutura como Serviço - IaaS

Temos mais liberdade na criação e manipulação dos recursos, definindo de maneira quase manual nossos servidores, armazenamento e firewall/segurança da rede. O preço da liberdade é a responsabilidade de manter tudo atualizado e seguro. No modelo de responsabilidade compartilhada, em IaaS a responsabilidade pesa mais para o cliente e menos para o provedor.

É o modelo mais básico entre os três, porém temos maior flexibilidade e controle ao custo de maior responsabilidade.

### Plataforma como Serviço - PaaS

O PaaS oferece um ambiente de desenvolvimento completo na nuvem. O provedor cuida da infraestrutura e do sistema operacional, enquanto o desenvolvedor foca apenas na criação e execução do código.

Esse modelo acelera o desenvolvimento e reduz a complexidade operacional.

A responsabilidade do cliente fica apenas sobre o código da aplicação e os dados. É ideal para desenvolvimento ágil de aplicações, APIs, microserviços e aplicações web.

Exemplo, podemos ter toda a nossa aplicação executada em uma máquina virtual(IaaS) e subir o banco de dados em um serviço gerenciado pela Azure.

Outros exemplos: Heroku, Google App Engine, AWS Elastic Beanstalk.

### Software como Serviço - SaaS

Com o SaaS, o usuário consome aplicações completas via internet, sem precisar se preocupar com nada técnico. Todo o gerenciamento de infraestrutura, plataforma e software é feito pelo provedor.

A responsabilidade do cliente é somente sobre o uso do sistema e os dados inseridos. É ideal para empresas que querem soluções prontas para uso como e-mail, CRM, ERP, etc.

Exemplos: Google Workspace (Gmail, Docs), Microsoft 365, Salesforce.

---

### Modelo de responsabilidade

​O Modelo de Responsabilidade Compartilhada é um conceito fundamental na computação em nuvem que define as obrigações de segurança e gerenciamento entre o provedor de serviços em nuvem (CSP) e o cliente. Essas responsabilidades variam conforme o tipo de serviço contratado: Infraestrutura como Serviço (IaaS), Plataforma como Serviço (PaaS) ou Software como Serviço (SaaS).

![modelo responsabilidade](https://learn.microsoft.com/en-us/training/wwl-azure/describe-cloud-service-types/media/shared-responsibility-b3829bfe.svg)

A imagem mostra **como as responsabilidades são divididas** entre cliente e provedor (Microsoft):

| Camada                               | SaaS        | PaaS        | IaaS        | On-Prem     |
|--------------------------------------|-------------|-------------|-------------|-------------|
| **Cliente sempre responsável por:**  | Dados, dispositivos, contas e identidades |
| **Responsabilidade varia:**          | Aplicações, sistema, rede, diretórios     |
| **Microsoft responsável por:**       | Hardware, rede física, datacenter         |

Resumo

- Quanto **mais alto o nível do serviço (SaaS)**, **menos responsabilidade técnica** para o cliente.
- Quanto **mais baixo (IaaS ou On-Prem)**, **mais controle e mais responsabilidade** do cliente.