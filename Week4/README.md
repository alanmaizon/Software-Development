# Week4 - Software Development

We start using IPO to understand the I/O and Processes involved in our program.

Practical work 1
Create the IPO for a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below

Under 18: 10 euro

Over 18: 15 euro

``` mermaid
    flowchart LR

    totalTickets --> Agregation
    userAge --> IsOver18?
    IsOver18? --YES --> countTotal+15
    IsOver18? --NO --> countTotal+10
    countTickets --NO --> IsOver18?
    countTotal+10 --totalTickets+1 --> Agregation
    countTotal+15 --totalTickets+1 --> Agregation
    Agregation --> countTickets
    countTickets -- YES -->countTotal

    subgraph Input 
        userAge
        totalTickets
    end
    subgraph Process
        Agregation
        countTickets
        IsOver18?
        subgraph Price
            countTotal+15
            countTotal+10
        end
    end  
    subgraph Output
        countTotal
    end


```