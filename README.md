# Observer Pattern

### Chat

POC mostrando o funcionamento do padrão observer.

É criada uma sala de chat fictícia e quando um usuário novo se conecta (registra), todos os usuários são notificados.

### Exemplo

Usuário 1 entra

Usuário 1 recebe:
```
user 1 entered the chat.
```

Usuário 2 entra

Usuário 1 e 2 recebem:
```
user 2 entered the chat.
```

Usuário 3 entra

Usuário 1, 2 e 3 recebem:
```
user 3 entered the chat.
```

### Motivação

Estudo para quebrar o padrão de pool (ficar perguntando 'você mudou?') e utilizar o padrão inverso ('eu mudei agora!').

### Refências

https://www.youtube.com/watch?v=_BpmfnqjgzQ
https://www.baeldung.com/java-observer-pattern