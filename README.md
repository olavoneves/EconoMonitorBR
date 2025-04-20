# 📈 Economic Monitor - Projeto Pessoal

**Um sistema em Java para acompanhar os principais indicadores econômicos do Brasil**  
*(Consome dados oficiais do Banco Central via API)*

## ✨ Funcionalidades Principais

### 📊 Consulta de Indicadores
- 💵 Dólar comercial (compra e venda)
- 📈 Taxa Selic atual e histórica
- 🛒 IPCA (índice de inflação)

### 🛠️ Ferramentas Úteis
- 🔍 Filtros por período (diário, mensal, anual)
- 📉 Visualização em gráficos ASCII
- 💾 Exportação para CSV
- 🔔 Sistema de alertas personalizados

## 🧰 Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| `Java 17+` | Versão LTS do Java |
| `Spring Boot` | Framework (modo console) |
| `Records` | Modelos de dados imutáveis |
| `Streams API` | Processamento de coleções |
| `RestTemplate` | Cliente HTTP para APIs |

## 🗂️ Estrutura Exemplo do Código

```plaintext
src/
├── main/
│   ├── java/
│   │   ├── br/com/seuprojeto/
│   │   │   ├── models/       # Entidades (Dolar.java, Selic.java)
│   │   │   ├── services/     # Serviços de API (BancoCentralService.java)
│   │   │   ├── utils/        # Utilitários (CsvExporter.java)
│   │   │   └── Application.java
│   ├── resources/           # Arquivos de configuração
└── test/                    # Testes unitários
```

## 🚀 Como Rodar o Projeto
### Pré-requisitos
```
 - JDK 17 instalado
 - Maven 3.8+
```

### Executando
```
 - Clone o repositório
    git clone https://github.com/seuuser/monitor-economico.git

 - Entre na pasta do projeto
    cd monitor-economico

 - Execute com Maven
    mvn spring-boot:run
```

### Menu exemplo principal
```
 [1] Consultar cotações atuais
 [2] Ver histórico por período
 [3] Exportar dados
 [4] Configurar alertas
 [0] Sair
```

## 📌 Próximas Melhorias
```
 > Adicionar suporte a mais moedas
 > Implementar cache local
 > Gerar relatórios em PDF
 > Criar interface web simples
```

- 🛠️ Desenvolvido por Olavo Neves
- 📧 Contato: olavo9neves@gmail.com
- 📅 Última atualização: 20/04/2025


### 📝 Notas Adicionais
```
 - Projeto 100% local (não requer banco de dados)
 - Dados atualizados diretamente das APIs do BC
 - Compatível com Windows, Linux e macOS
```
