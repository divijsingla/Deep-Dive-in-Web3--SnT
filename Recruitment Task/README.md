# Recruitment Task for Deepdive into Web3.0

The **basic model** is to connect lenders and borrowers. There are two founding lenders who have invested 1lac rupees each. Other lenders are open to invest
and borrowers are also welcomed to borrow at a 10% interest rate. I have put some conditions to check repayment capacity of the borrower. The profit due to 
10% interest rate is distributed among the lenders according to the ratio of their stake in pool, which is transparent and told to the lender as soon as he 
finishes the payment.

**Flow of Program:**

The Program has two classes Borrowers, Lenders which are connected to Main class. User is first asked whether he wants to lend or borrow, then appropriate 
response is shown. After asking credentials, these are added to the class (means an object is created using the constructor made in borrower/lender class)
and that object is added to an arraylist of borrowers/lenders.
After user inputs every required credential, he is shown his unique ID and other details. Suitable procedure is done in the code itself using concepts of OOPs
to do all this.

Conditions to check repayment capacity:

I have put condition like the total amount to be repayed(i.e. interest and principal) must be less that half of the money earned by the person in that period
of time. If the person doesn't fulfil repayment capacity, he is told the maximum loan that can be given to him and also asked to enter the loan amount and
duration again and again until he fulfils the repayment capacity.
We can put countless conditions, like consider age factor, ask for securities, collateral etc. but i have avoided them to not make the program bulky.



Q.Is the loaning system that you implemented centralized or decentralized?

A.No, the loaning system is centralised. The owner of pool(me) has controls over the interest rate and can remove/add lenders and borrowers. Also the pool
of money and transaction are not stored in a Blockchain.

Q.Point out the demerit(s) of a centralized system.

A. 1. A group of individuals control the authority and can exploit other people.

2. Transactions are often not transparent hence, chances of fraud increases.
 
3. As the record may not be maintained on a blockchain, so hackers can attaack easily.
 
4. Trust issue is always there as there is no smart-contract to ensure that transaction is done by both ends fairly.

**I have worked on this project a lot, so please see it and tell my shortcomings. I have learnt OOPs recently, and got a lot to learn and will be learning as the project will go on.
I am very enthusiastic about learning Blockchain and web3.0 and currently learning it also, So please consider my selection.**


