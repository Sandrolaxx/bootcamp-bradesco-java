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

### Acesso condicional

