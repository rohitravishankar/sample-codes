### String Bomber

The Bomber algorithm doesn't like any 3 or more consecutive characters in a given string to be the same.

##### For Example: 
If the given string is `adbcccbbd` the bomber algo will first bomb `ccc` and then `bbb`, so the final output string will become `add`.
The bomber algo will destroy the characters only if there are 3 or more continuous occurrence of same characters in the string.

#### INPUT 1
    aaabcccdee
#### OUTPUT 1
    bdee
#### INPUT 2
    abcdeeeeddcbfgf
#### OUTPUT 2
    abccbfgf
### INPUT 3
    aabccccbbae
#### OUTPUT 3
    e
