```Mermaid

graph TD

Start([start])-->input[/Input monthlyDataLimit, dataUsed/]
input-->calu[dataRemainining = moonthlyDataLimit - DataUsed]
calu-->check{dataUsed > monthlyDataLimit?}
check--yes-->Display[/Display "limit exceeded"/]
check--no -->Display2[/Display dataRemaining "data remining"/]
Display-->Stop([stop])
Display2-->Stop

```