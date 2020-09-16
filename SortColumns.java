// Import necessary packages to use the List
import java.util.ArrayList;
import java.util.List;

public class SortColumns{
	
	public List<Integer> minDeletionSize(String [] stringList){
        //create integer list called indices that will contain indices or sorted columns, or -1 if non found
        List<Integer> indices = new ArrayList<Integer>();
        //create boolean called flag set to true that will be change to false if the column is not sorted
        boolean flag = true;
        //for loop through characters of each column of stringList
        for(int index=0;index<stringList[0].length();index++){
            //if flag is still at true, then check all same indices of all columns
            if (flag){
                //for loop through the columns of the stringList
                for(int column=0;column<stringList.length-1;column++){
                    //compare lenghts of strings in stringList
                    if(stringList[column].length()==stringList[column+1].length()){
                        //check if character at index in column 1 is bigger then character at index in column 2, if they are then this two columns are sorted, then break and continue 
                        if(stringList[column].charAt(index)>stringList[column+1].charAt(index)){
                            indices.add(index);
                            break;
                        }
                    }
                    //if leghts are not the same, then change boolean flag to false
                    else{
                        flag = false;
                    }
                }
            }
            //if flag if false, meaning stringList columns are different lenghts, insert -1 in integer list indices
            else{
                indices.add(-1);
                break;
            }
        }
        return indices;	
	}
	
	public static void main(String[] args){
		//create object of SortColumns class
        SortColumns sortCol = new SortColumns();

        String [] stringList1 = new String[]{"cba", "daf", "ghi"};
        String [] stringList2 = new String[]{"a", "b"};
        String [] stringList3 = new String[]{"zyx", "wvu", "tsr"};
        String [] stringList4 = new String[]{"Captain", "Marvel", "saved", "the", "Avengers"};
	    
        System.out.println("List 1");
        // Declare an instance of List.
        List<Integer> myList1 = sortCol.minDeletionSize(stringList1);
        //print list of indices of sorted columns of stringList
        System.out.println(myList1.toString());

        System.out.println("List 2");
        List<Integer> myList2 = sortCol.minDeletionSize(stringList2);
        System.out.println(myList2.toString());

        System.out.println("List 3");
        List<Integer> myList3 = sortCol.minDeletionSize(stringList3);
        System.out.println(myList3.toString());

        System.out.println("List 4");
        List<Integer> myList4 = sortCol.minDeletionSize(stringList4);
        System.out.println(myList4.toString());
	}
}