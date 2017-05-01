Given a word , rearrange the letters of `w` to construct another word `s` in such a way that `s` is lexicographically greater than `w`. In case of multiple possible answers, find the lexicographically smallest one among them.

#### Input Format

The first line of input contains `t`, the number of test cases. Each of the next `t` lines contains `w`.

#### Constraints

1. `w` will contain only lower-case English letters and its length will not exceed `100`.

#### Output Format

For each testcase, output a string lexicographically bigger than  in a separate line. In case of multiple possible answers, print the lexicographically smallest one, and if no answer exists, print __no answer__.

#### Sample Input

    5
    ab
    bb
    hefg
	dhck
	dkhc
#### Sample Output

	ba
	no answer
	hegf
	dhkc
	hcdk