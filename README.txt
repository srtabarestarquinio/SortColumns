CS245 - Lab Assignment 03 - SortColumns

Author: 
	Suchitoto Rose Tabares-Tarquinio

Goal:
  ● Return the indices of the columns in A that are not in sorted order.
  ● Return an empty set of indices (i.e. {} ) if all columns are in order.
  ● Return {-1} if there are any errors. Different lnghts in strings. 

Comments:
	-Set n as amount of strings in stringList, and m as amount of columns in stringList (amount of charactes in each string).

	Runtime: 
		-First for loop for(int index=0;index<stringList[0].length();index++), at the most, meaning if legth is the same, it will go through loop, the size of the strings inside of the stringList. Ex, for {"a", "b"}, it will go over 1 time, for {"cba", "daf", "ghi"} it will go over 3 times. O(m)
		-Second for loop for(int column=0;column<stringList.length-1;column++), at the most, meaning if all are sorted, it will go the amount of strings in stringList -1. O(n-1)

		-At the most, the runtime will be O( m * (n-1) )
  
	Space Complexity:
		- String List array of size O(m*n)
		-Integer list of amount of indices, at wost case, if all strings are same size but all are unsorted, it will output indices list of size O(m)

		-At the most, the space complexity will be O( m*n + m )
