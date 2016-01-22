A Bowling alley system.



Input : 
 1 4
 4 5
 6 /
 5 /
 X
 0 1
 7 /
 6 /
 X
 2 / 6

Output : 136

Rules about Bowling - 
A game consists of ten (10) sets as shown in the attachment.
In each set, the player has two opportunities to knock down ten (10) pins.  
The score for a set is the total number of pins knocked down, plus bonuses for strikes and spares.
A spare is when the player knocks down all ten (10) pins in two tries. If there is spare the player gets 5 bonus points.
A strike is when the player knocks down all ten (10) pins on his/her first try.  If there is a strike the player gets 10 bonus points.
In the final (10th) set an player who rolls a spare or strike is allowed to roll the extra balls to complete the set.  However only a maximum of three balls can be rolled in the final set.
Example:
In the attachment the player knocks 1 pin in first try and 4 in second try in the first set and the total score is 5.
In the second set the player knocks 4 pins in first try and 5 in second try and the cumulative score is 14.
In the third set the player knocks 6 pins in first try and the remaining 4 in second try (a spare indicated by the symbol “/“) and the cumulative score is 29 (14+10+5 bonus).
In the forth set the player knocks  5 pins in first try and the remaining 5 in second try (a spare indicated by the symbol “/“) and the cumulative score is 44 (29+10+5 bonus).
In the fifth set the player knocks down all 10 pins in first try(a strike indicated by the symbol “X“) and the cumulative score is 64 (44+10+10 bonus).
…..
…..
In the final set the player knocks 2 in first try and the remaining 8 in second attempt (spare indicated by “/“). The player is allowed to roll an extra ball and this time knocks down 6 pins
So In the final set he gets 21(10+5+6) points and the total tally is 136 points.