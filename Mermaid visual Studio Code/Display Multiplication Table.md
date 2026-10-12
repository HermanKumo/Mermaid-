```Mermaid

graph TD

Start([Start])-->Input[/Declare num, i/]
Input-->read[/Read num/]
read-->Init[i = 1]
Init-->check{i <= 10 ?}
check--yes-->product[Product = num * 1]
check--no -->stop([Stop])
product-->Display[/Display num, "x " i," = ", Peoduct/]
Display-->number[i = i +1]
number-->check
```