import hashlib
import timeit

s=input("Enter String: ")
t=s
nonce=0
s+=str(nonce)
start = timeit.default_timer()
hash=hashlib.sha256(s.encode()).hexdigest()

while(int(hash,16)>=int('00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF',16)):
    s=t
    nonce=nonce+1
    s+=str(nonce)
    hash=hashlib.sha256(s.encode()).hexdigest()
    
stop = timeit.default_timer()

print("Nonce:", nonce)
print('Time:', stop - start,'s')  





