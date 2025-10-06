# Week4 - Software Development

## Conditional Statement

This file contains the IPO to understand the I/O and Processes involved in our program: In this approach also included the concepts of repetition and loops, I notice the inputs are: the number of tickets (fixed input because it shapes the scope of our computation) and user's age for me can be a pivotal input that reflects an individual condition (and that will be called repeteadly inside a loop). Together they determine the total cost of the tickets, that will be our output. So, I propose to code this program starting for how many tickets we need first and asking each person's age to compute the output, as you can see if the flow chart. You can find the name of the files for the instantiable and app classes below. 

The program takes String inputs but will show a FormatException error if the input is not an `int`.


`Cine.java`
`CineApp.java`

*I use [**mermaid**](https://mermaid.live/) to create flowcharts and class diagrams directly in markdown files, and it renders beautifully with its own extension in VSCode. I find this tool super easy for designing program logic.*


### IPO
``` mermaid
flowchart LR
    A([Start])-->B[totalTickets]
    B-->C[countTickets=0]
    C-->D{countTickets<totalTickets?}
    D-- Yes -->E[userAge]
    E--> F{userAge>=18?}
    F-- Yes -->G[Add €15 to totalCost]
    F-- No -->H[Add €10 to totalCost]
    G-->I[countTickets++]
    H-->I
    I-->D
    D-- No -->J[totalCost]
    J-->K([End])

    subgraph Input
        B
        E
    end

    subgraph Process
        C
        D
        F
        G
        H
        I
    end

    subgraph Output
        J
    end

```

This file is also available in GitHub [Link to Week4 Public Repo](http://github.com/alanmaizon/Software-Development/blob/main/Week4/)