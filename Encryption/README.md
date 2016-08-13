A program for an encryption scheme as given below:


An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let **L** be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

floor(root(**L**))<=rows<=column<=ceil(root(**L**)),
For example, the sentence `if man was meant to stay on the ground god would have given us roots`
after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

It can be arranged as 

    ifmanwas
	meanttos        
	tayonthe
	groundgo  
	dwouldha
	vegivenu
	sroots

The encoded text or the output turns out to be


    imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

###Sample Input and Outputs:

#### Input : 

    haveaniceday

#### Output : 

    hae and via ecy

---

#### Input : 

    feedthedog

#### Output : 

    fto ehg ee dd

----

#### Input : 

     chillout

#### Output : 
    
    clu hlt io

---

#### Input : 

    roqfqeylxuyxjfyqterizzkhgvngapvudnztsxeprfp

#### Output : 

    rlyzatp oxqkps quthvx fyegue qxrvdp ejinnr yfzgzf