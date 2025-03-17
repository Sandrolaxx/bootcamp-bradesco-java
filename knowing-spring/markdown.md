# Documentação da API com Swagger no Spring Boot 3

## Objetivo
Este repositório tem como objetivo demonstrar como adicionar e configurar o Swagger para documentação de APIs em uma aplicação Spring Boot. O repositório atual apresenta como era implementado o processo antes da versão 3.

## Mudança na Biblioteca do Swagger no Spring Boot 3
A partir da versão 3 do Spring Boot, a biblioteca utilizada para integração do Swagger foi alterada. A antiga dependência **springfox-swagger** foi descontinuada, sendo substituída pelo **springdoc-openapi**.

Para mais informações sobre essa mudança, consulte o seguinte artigo:
[Using Swagger 3 in Spring Boot 3](https://medium.com/@f.s.a.kuzman/using-swagger-3-in-spring-boot-3-c11a483ea6dc)

## Configuração do Swagger no Spring Boot 3
Para adicionar o Swagger ao projeto Spring Boot 3, utilize a seguinte dependência no `pom.xml` (para projetos Maven):

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>
```

Caso esteja usando Gradle, adicione ao `build.gradle`:

```gradle
dependencies {
    implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2'
}
```

Com essa dependência, o Swagger UI estará disponível automaticamente em:
```
http://localhost:8080/swagger-ui/index.html
```

## Exemplo de Controlador com Swagger
Para expor um endpoint documentado pelo Swagger, utilize anotações como `@Operation` e `@Parameter`:

```java
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Operation(summary = "Endpoint de exemplo para saudação")
    @GetMapping("/hello")
    public String hello(@Parameter(description = "Nome do usuário") @RequestParam String name) {
        return "Olá, " + name + "!";
    }
}
```

## Conclusão
A partir do Spring Boot 3, a configuração do Swagger foi simplificada com o **springdoc-openapi**, substituindo o antigo `springfox-swagger`. Isso facilita a documentação de APIs e melhora a integração com padrões modernos do OpenAPI.

---

# Exception Handling no Spring

O tratamento de exceções no Spring Boot pode ser feito de diversas formas, dependendo do escopo e da necessidade da aplicação. Algumas das abordagens mais comuns incluem:

## 1. `@ExceptionHandler`

Anotação utilizada para capturar exceções em um controlador específico.

```java
@RestController
@RequestMapping("/api")
public class MeuController {
    
    @GetMapping("/exemplo")
    public ResponseEntity<String> exemplo() {
        throw new RuntimeException("Erro de exemplo");
    }
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro tratado: " + e.getMessage());
    }
}
```

## 2. `@ControllerAdvice` - Global Exception Handler

Para capturar exceções de toda a aplicação, podemos usar a anotação `@ControllerAdvice`, que permite a criação de um manipulador global de exceções.

### Implementação de um Global Exception Handler

```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Recurso não encontrado: " + e.getMessage());
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
            errors.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno: " + e.getMessage());
    }
}
```

### Benefícios do `@ControllerAdvice`

- Centraliza o tratamento de exceções, facilitando a manutenção.
- Evita repetição de código nos controladores.
- Melhora a padronização da resposta da API.

Com essas abordagens, o Spring Boot oferece flexibilidade no tratamento de exceções, garantindo uma melhor experiência para os usuários da aplicação.