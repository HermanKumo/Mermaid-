```mermaid
flowchart TB
  
   Start([Start])
    Input[/Input Length, Width/]
    Calc[Area = Length × Width]
    Output[/Display Area/]
    Stop([End])

    Start --> Input
    Input --> Calc
    Calc --> Output
    Output --> Stop
  ```