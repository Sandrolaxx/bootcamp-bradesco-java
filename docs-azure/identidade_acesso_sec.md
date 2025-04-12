# Identidade, acesso e segurança

## Serviço de diretório

O Microsoft Entra ID é o serviço de gerenciamento de identidades e acesso baseado em nuvem do Microsoft Azure.

Funcionalides:
* Autenticação(os funcionários entrar para acessar os recursos)
* Login único(SSO)
* Gerenciamento de aplicativos
* Modelo de Negócios para Negócios
* Gerenciamento de dispositivos

**Microsoft Entra Domain Services**: É uma solução gerenciada da Microsoft que fornece serviços de domínio como autenticação Kerberos, NTLM, LDAP e políticas de grupo, sem a necessidade de configurar controladores de domínio tradicionais. Ele se integra ao Microsoft Entra ID (ex-Azure AD), permitindo que máquinas virtuais no Azure sejam ingressadas no domínio e que aplicações legadas funcionem na nuvem com segurança e compatibilidade. Ideal para cenários em que se precisa de funcionalidades do Active Directory em ambientes totalmente gerenciados na nuvem.

![Image](https://github.com/user-attachments/assets/ef6aa4fb-6c4f-435a-b96c-6bbb87bc4028)

## Método de autenticação

### Autenticação e autorização

Autenticação é o processo de verificar **quem é o usuário** — ou seja, confirmar sua identidade (ex: login com usuário e senha).

Autorização é o processo de verificar **o que esse usuário pode fazer** — ou seja, conceder ou negar acesso a recursos com base em permissões (ex: pode ou não acessar uma pasta ou funcionalidade).

Resumindo:  
- Autenticação = Quem é você?
- Autorização = O que você pode fazer?

### MFA

MFA (Autenticação Multifator) é um mecanismo de segurança que exige dois ou mais fatores para verificar a identidade de um usuário. Esses fatores podem incluir:

* Algo que você sabe (senha ou PIN),
* Algo que você tem (celular, token, smartcard),
* Algo que você é (biometria, como impressão digital ou reconhecimento facial).

O objetivo do MFA é aumentar a segurança ao dificultar o acesso não autorizado, mesmo que a senha seja comprometida.

### Microsoft Entra External ID

O Microsoft Entra External ID facilita a colaboração segura com usuários externos, oferecendo controle de acesso, autenticação moderna e integração com múltiplas identidades — tudo isso sem comprometer a segurança da organização.

Funcionalidades:
* Colaboração B2B (Business-to-Business): Permite que usuários externos acessem recursos internos com segurança, usando suas próprias credenciais (Microsoft, Google, Facebook, etc.).
* Gerenciamento de acesso: Definição de políticas de acesso, autenticação multifator (MFA), e monitoramento de identidade externa.
* Experiência personalizada: Suporte à personalização de páginas de login e fluxos de autenticação para refletir a identidade da empresa.
* Escalável e seguro: Ideal para cenários corporativos com alto volume de acessos externos.

## Modelos de segurança

Temos sempre de pensar no modelo Zero Trust, que é um modelo de segurança que parte do princípio de que nenhum usuário, dispositivo ou aplicação deve ser automaticamente confiável, mesmo dentro da rede corporativa.

No **Zero Trust**, o acesso é concedido somente após verificação contínua de identidade, dispositivo, localização e comportamento. O modelo aplica o conceito de "nunca confie, sempre verifique", reforçando a segurança com autenticação forte, acesso condicional e monitoramento constante.

### Acesso condicional

O Acesso Condicional do Azure é um recurso do Microsoft Entra ID que permite controlar o acesso a aplicativos e recursos com base em condições específicas, como identidade do usuário, localização, dispositivo, risco de login, entre outros.

**Como funciona?**

Ele aplica políticas automatizadas que determinam quando e como o acesso é permitido. Por exemplo:
- Exigir **MFA** se o usuário estiver fora da rede corporativa.
- Bloquear acesso de **países não autorizados**.
- Permitir acesso somente com **dispositivo gerenciado**.
- Impedir login se o sistema detectar **risco de identidade**.

**Resumo**

O Acesso Condicional do Azure ajuda a proteger recursos da organização, aplicando políticas inteligentes de acesso baseadas em risco e contexto. Ele equilibra segurança com produtividade, garantindo que somente usuários confiáveis, nas condições certas, possam acessar recursos sensíveis.

### RBAC

O Controle de Acesso Baseado em Função (RBAC – Role-Based Access Control) é um modelo de segurança que concede permissões aos usuários com base em suas funções dentro da organização.

**Resumo**

No RBAC, os usuários recebem funções predefinidas (como Leitor, Colaborador ou Administrador), e essas funções determinam quais recursos podem ser acessados e quais ações podem ser realizadas. É uma forma eficiente e segura de gerenciar permissões em ambientes como o Microsoft Entra ID e o Azure.

![RBAC](https://cdn.infrasos.com/wp-content/uploads/2023/04/pic1.jpg)

Podemos impor essas funções de nível de acesso sobre usuários, grupos, recursos e grupos de recursos.

### Microsoft Defender for Cloud

É uma plataforma de segurança nativa da nuvem que ajuda a proteger recursos em ambientes multicloud e híbridos.

Ele oferece avaliação contínua de segurança, recomendações de correção, detecção de ameaças e proteção ativa para serviços do Azure, AWS e Google Cloud. Ele ajuda a fortalecer a postura de segurança da organização e responder rapidamente a incidentes.