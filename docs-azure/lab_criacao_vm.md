Abaixo está um passo a passo direto e objetivo para criar uma máquina virtual (VM) na Azure via Portal Web. Ao final, também apresento como fazer isso por linha de comando.

Também veremos rapidamente sobre a área de trabalho virtual e Azure Functions.

Muitos dos conhecimentos retirados do lab prático de criação de VM's e apresentação de outros serviços.

---

## Opções para criar via Portal

Temos duas opções a "Vanila" onde criamos a VM e vamos configurando ela e todo o ambiente do zero e temos a opção "Máquina virtual do Azure com configuração predefinida".

Na segunda opção apresentada, essa é uma forma simplificada e acelerada de criar VMs na Azure usando modelos prontos (pré-configurados) fornecidos pela Microsoft ou por parceiros. Ele facilita a criação de VMs com sistemas operacionais, softwares e configurações já otimizadas para determinados cenários.

Temos exemplos como: "Windows Server 2022 com SQL Server 2022 Express", "Ubuntu Server com Docker pré-instalado", "Visual Studio 2022 Enterprise em Windows 11", "WordPress em Ubuntu + MySQL", "Data Science VM" com bibliotecas de IA e Python instaladas.

Facilitando muito quando já temos um contexto de utilização bem definido.

Abaixo veremos a primeira opção, configura tudo do zero.

---

## Criando uma VM no Portal Azure

### 1. **Acesse o Portal Azure**
- Acesse: [https://portal.azure.com](https://portal.azure.com)
- Faça login com sua conta Microsoft.

### 2. **Inicie a criação da VM**
- No menu à esquerda, clique em **"Máquinas Virtuais"**.
- Clique em **"+ Criar"** → **"Máquina virtual"**.

### 3. **Configure as informações básicas**
Na aba **"Básico"**, preencha os dados:

| Campo | Descrição |
|-------|-----------|
| **Assinatura** | Plano de cobrança. |
| **Grupo de recursos** | Crie um novo ou escolha um existente. |
| **Nome da VM** | Nome para identificar sua VM. |
| **Região** | Local do datacenter (ex: "Brazil South"). |
| **Imagem (SO)** | Escolha o sistema operacional (ex: Ubuntu, Windows Server). |
| **Tamanho** | Escolha o tipo de VM (ex: B1s, D2s). Pode clicar em “Ver todos os tamanhos” para mais opções. |
| **Usuário/Senha ou chave SSH** | Defina como vai acessar a VM. |
| **Portas de entrada** | Marque RDP (para Windows) ou SSH (para Linux). |

### 4. **Discos**
- Defina o tipo de disco do SO: **SSD padrão**, **Premium**, ou **HDD**.
- Pode adicionar discos adicionais, se necessário.

### 5. **Rede**
- Um **IP público** será criado automaticamente.
- A VM será conectada a uma **rede virtual** e **sub-rede**.
- Pode configurar segurança (NSG) para liberar portas específicas.

### 6. **Outras opções (opcional)**
- Monitoramento, Extensões, Backup, Diagnóstico, entre outros.
- Pode deixar com os padrões se estiver começando.

### 7. **Revisar e criar**
- Clique em **"Revisar + criar"**.
- O portal validará os dados.
- Se estiver tudo certo, clique em **"Criar"**.

A VM será provisionada em alguns minutos.

---

## Acessando a VM:
- **Windows**: Use RDP (Remote Desktop Protocol).
- **Linux**: Use SSH, exemplo:  
  ```bash
  ssh usuario@ip-da-vm
  ```

---

## Outra forma de criar a VM

### Via Azure CLI:
```bash
az vm create \
  --resource-group MeuGrupo \
  --name MinhaVM \
  --image UbuntuLTS \
  --admin-username meuUsuario \
  --generate-ssh-keys
```

Necessário já estar autenticado no CLI. Poderíamos também criar com infra como código, com ferramentas como Terraform.

### Outras referência:
- Microsoft Docs: [Create a virtual machine in Azure](https://learn.microsoft.com/en-us/azure/virtual-machines/linux/quick-create-portal)

---

## **Passo a passo – Criar Área de Trabalho Virtual (AVD)**

A **Área de Trabalho Virtual do Azure** (Azure Virtual Desktop) permite criar um ambiente de desktop Windows acessível remotamente, ideal para trabalho remoto ou laboratórios virtuais.

### 1. **Pré-requisitos**
- Uma **assinatura Azure ativa**.
- Um **usuário no Azure Active Directory** (ou sincronizado via AD).
- Um **grupo de recursos** (ou crie um novo durante o processo).

### 2. **Crie um Host Pool**
1. Acesse o [Portal Azure](https://portal.azure.com)
2. Pesquise e clique em **"Azure Virtual Desktop"**
3. Clique em **"Host pools" > "+ Criar"**
4. Preencha:
   - Nome do host pool
   - Tipo: **Pooled** (compartilhado) ou **Personal** (um usuário por VM)
   - Tamanho da VM sugerido (ex: Standard D2s v3)
   - Quantidade de VMs

### 3. **Crie o Workspace**
1. Após o Host Pool, vá para **"Workspaces" > "+ Criar"**
2. Associe ao **Host Pool** criado anteriormente
3. Escolha o mesmo **grupo de recursos** e região

### 4. **Publicar a Aplicação/Área de Trabalho**
1. No menu do host pool, vá em **"Application groups"**
2. Crie um grupo de aplicativos ou use o padrão **"Desktop Application Group"**
3. Atribua usuários (ex: seu e-mail)

### 5. **Acessar a Área de Trabalho**
- Baixe o cliente em: [https://aka.ms/avdclient](https://aka.ms/avdclient)
- Faça login com sua conta do Microsoft Entra ID (antigo Azure AD)
- Acesse sua área de trabalho virtual.

---

## **Passo a passo – Criar uma Azure Function**

### 1. **Acessar o Portal Azure**
- Vá para [https://portal.azure.com](https://portal.azure.com)

### 2. **Criar Function App**
1. No menu lateral, clique em **"Criar um recurso"**
2. Pesquise por **"Function App"**
3. Clique em **"Criar"** e preencha:

| Campo               | Valor sugerido                        |
|---------------------|----------------------------------------|
| Grupo de Recursos   | Use um existente ou crie novo          |
| Nome                | Nome único para sua Function App       |
| Publicar            | Código                                 |
| Pilha de Runtime    | Ex: **.NET**, **Node.js**, **Python**  |
| Região              | Ex: Brazil South                       |

### 3. **Plano de Hospedagem**
- Escolha o plano **"Consumption (Serverless)"** (paga só pelo uso)
- Marque opção de armazenamento (será criado automaticamente)

### 4. **Criar a Function**
1. Após o deployment, clique na **Function App**
2. Vá em **"Functions" > "+ Criar"**
3. Escolha um **gatilho** (ex: HTTP trigger)
4. Nomeie a função e clique em **"Criar"**

### 5. **Testar a Function**
1. Vá na função criada > **"Testar/Executar"**
2. No caso de HTTP Trigger, copie a URL e acesse via navegador ou `curl`

### Exemplo de resposta da função HTTP:
```json
{
  "message": "Lab bala criando Azure Functions!"
}
```

---

## Referências oficiais:
- [Azure Virtual Desktop – Microsoft Docs](https://learn.microsoft.com/en-us/azure/virtual-desktop/)
- [Azure Functions – Microsoft Docs](https://learn.microsoft.com/en-us/azure/azure-functions/)