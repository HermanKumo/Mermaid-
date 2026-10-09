```Mermaid
flowchart TB

Start((Start))-->average
average[/Read average marks/]-->check
check{Average >=50?}
check--yes-->pass[/Display "pass"/]
check--no -->fail[/Display "Fail"/]
pass-->stop((stop))
fail-->stop


```
