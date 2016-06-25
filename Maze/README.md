### A program to find Nearest meeting cell of any two given cells and Maximum number of entry points (incoming edges) for any cell in the maze.


#### Input

    23
    4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
    9 2

#### Output

    4
    5

#### Input format

1. First line has the number of cells N

2. Second line has list of N values of the edge[] array. edge[i] contains the cell number that can be reached from of cell ‘i’ in one step. edge[i] is -1 if the i’th cell doesn’t have an exit.

3. Third line contains two cell numbers whose nearest meeting cell needs to be found. (Return -1 if there is no meeting cell from the two given cells)

***

##### Output format    

1. Line 1 is the nearest meeting cell of two given cells

2. Line 2 is the maximum number of entry points (incoming edges) for any cell in the maze.