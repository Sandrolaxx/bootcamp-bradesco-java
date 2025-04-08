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