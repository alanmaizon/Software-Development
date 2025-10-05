# Week4 - Software Development

## Lab 1
Create the IPO for a program that takes in a user's age and a number of cinema tickets they need. Display the price it will cost for them to buy their tickets based on below

Under 18: 10 euro

Over 18: 15 euro


We start using IPO to understand the I/O and Processes involved in our program. Introducing my excercise that is also part of the Week4 lesson, in this approach, based in that context, I notice the inputs have diferent natures: the number of tickets is a fixed input because it shapes the scope of our computation, but age is for me a pivotal input that reflects an individual condition, together they determine the value of the output. So, I propose code this program starting for how many tickets we need first and asking each person's age to compute the total, as you can see if the flow chart. You can find attached the code for the instantiable and app classes below.


`Cine.java`
`CineApp.java`


### IPO
``` mermaid
flowchart TB

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

