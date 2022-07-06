First, I have taken the input of the string from the user (the name is s).
Then, I typecasted nonce (which is an integer) to string and concatenated it to s.
Then I calculated the hash (using hashlib) and compared it with the target by using the int() function.
Using the while loop, I increased the nonce concatenated to the string and finally printed it when the condition was met, i.e. when its hash became less than the target.
