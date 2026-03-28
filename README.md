# 🎬 Screenmatch: TV Series Manager

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)

Aplicação robusta desenvolvida em **Spring Boot** para busca, armazenamento e gerenciamento de séries e episódios, consumindo dados de APIs externas de entretenimento.

---

## Funcionalidades

* **Busca Dinâmica:** Integração com API externa para localizar séries em tempo real.
* **Persistência de Dados:** Armazenamento completo de séries, temporadas e episódios em banco relacional.
* **Conversão Inteligente:** Desserialização de JSON complexos para objetos Java via Jackson.
* **Gestão de Acervo:** Listagem e filtragem de informações armazenadas.
* **Arquitetura em Camadas:** Organização seguindo as melhores práticas de desenvolvimento backend.

---

## 🛠️ Tech Stack

| Tecnologia | Função |
| :--- | :--- |
| **Java** | Linguagem principal do ecossistema |
| **Spring Boot** | Framework para agilidade no desenvolvimento |
| **Spring Data JPA** | Abstração da camada de dados |
| **Hibernate** | Framework ORM para mapeamento objeto-relacional |
| **PostgreSQL** | Banco de dados robusto para produção |
| **Jackson** | Biblioteca para manipulação de dados JSON |
| **Maven** | Gerenciador de dependências e automação |

---

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão de camadas para garantir manutenibilidade e escalabilidade:

```text
src/main/java/com/ghdev/screenmatch
├─ model       # Entidades JPA, Records e DTOs
├─ repository  # Interfaces Spring Data JPA para PostgreSQL
├─ service     # Consumo de API (HttpClient) e Conversão (Jackson)
├─ principal   # Lógica de interação e execução
└─ application # Classe de inicialização Spring Boot
⚙️ Configuração e Instalação
1. Banco de Dados
Certifique-se de ter o PostgreSQL instalado e crie um banco chamado screenmatch.

2. application.properties
Configure as credenciais de acesso ao seu banco local:

Properties
spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Execução
Execute a aplicação através da sua IDE ou via terminal utilizando o Maven:

Bash
./mvnw spring-boot:run
🧠 Conceitos Praticados
Este projeto foi fundamental para consolidar conhecimentos em:

Consumo de APIs REST: Utilização de HttpClient e manipulação de Requests/Responses.

Mapeamento Objeto-Relacional (ORM): Relacionamentos @OneToMany entre Séries e Episódios.

Streams API: Filtragem e ordenação de dados de forma funcional.

Repository Pattern: Abstração total de queries SQL complexas.

📚 Origem
Este projeto faz parte da minha jornada de especialização em Backend Java. Desenvolvido inicialmente em curso e aprimorado com documentação e refatoração pessoal para portfólio.

📫 Desenvolvido por GHDev


http://googleusercontent.com/interactive_content_block/0
