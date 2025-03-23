# SQS Messaging Example with Spring and LocalStack

Este projeto é um exemplo de como integrar o AWS SQS (Simple Queue Service) com uma aplicação Spring Boot, utilizando o LocalStack para simular o ambiente AWS localmente.

## Tecnologias

- **Spring Boot** - Framework principal para o desenvolvimento da aplicação.
- **AWS Spring Cloud SQS** - Biblioteca para integração com o AWS SQS.
- **LocalStack** - Simulador da AWS para ambientes locais.
- **Java 21+** - Versão do Java usada no projeto.

## Como executar o projeto

### Pré-requisitos

- **Docker** - Para rodar o LocalStack.
- **Maven** - Para compilar o projeto.
- **AWS CLI** (opcional) - Para testar a integração com o LocalStack diretamente.

### Enviando mensagens
A aplicação expõe um endpoint POST para enviar mensagens para a fila do SQS:

`POST /sqs/send-message`

Corpo da requisição (exemplo de JSON):

```json
{
  "content": "Hello SQS!!"
}
```

### Consumindo mensagens
A aplicação também escuta a fila my-queue e exibe as mensagens recebidas no console. O consumidor utiliza o @SqsListener para processar as mensagens.

### Considerações Finais
Este projeto serve como exemplo para trabalhar com AWS SQS localmente utilizando o LocalStack e Spring Boot. Ele pode ser expandido para incluir mais funcionalidades, como processamento assíncrono de mensagens, integração com outros serviços AWS, etc.
