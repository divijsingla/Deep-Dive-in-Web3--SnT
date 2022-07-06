**isOwner** is a modifier (operates only when msg.sender is owner)

**getCompoundInterest** is function that takes principle,rate,time as input and gives the compound interest

**muldiv** function: here the Principal is first multiplied by 1e8 and then the final amount to pay is divided by 1e8 to improve precision.
