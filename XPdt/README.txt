Find the subset of an array who has the maximum f(x) value.
f(x) is defined as
f(x) = Xa ^ Xb ^ Xc .... * (Xa + Xb + Xc + ...)

where a, b, c, ... are indices and Xa, Xb, Xc, ... are elements with respect to indices

g(x) = a ^ b ^ c .... * (a + b + c + ...)

Ex.

array = [1, 2, 3]
subset which has max f(x) value = [2, 3]
f(x) = 2 ^ 3 * (2 + 3) = 5
g(x) = 2 ^ 3 * (2 + 3) = 5 (indices start from 1)

Input format : 
Two integers n1 and n2

n1 is the size of the complete array
n2 is mod integer (incase the output turns out to be too large)

and the array of size(n1)

Output format : 
f(x) g(x)

Examples : 

Input : 
3 7 
1 2 3

Output : 
5 5

----------------

Input : 
3 7
6 5 4

Output : 
6 4

--Please Print the subset for more clarity, inserted as a comment in Findnum.java--