``` Mermaid

graph TD


    A((start)) --> B[/Input purhase amout/]
    B --> C{Amout > 1000?}
    C -- Yes --> D[Discount = Amount * 0.10]
    D --> E[Final Amout = Amount - Discount]
    C -- No --> F[Discount = 0]
    F --> E
    E --> G[/display discount and Final Amount/]
    G --> H((End))
```
