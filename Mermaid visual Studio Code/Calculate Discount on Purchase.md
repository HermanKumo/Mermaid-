``` Mermaid

graph TD
    A((start)) --> B[/Input purchase amount/]
    B --> C{is Amount > 1000?}
    C -- Yes --> D[Discount = Amount * 0.10]
    D --> E[Final Amount = Amount - Discount]
    C -- No --> F[Discount = 0]
    F --> E
    E --> G[/display discount and Final Amount/]
    G --> H((End))
```
