// Import necessary packages to use the List
import java.util.ArrayList;
import java.util.List;

// Declare an instance of List.
// Since a List is an interface, we use ArrayList also.
List<Integer> myList = new ArrayList<Integer>();

// Use a List's important functions: add, get.
// The "add" function adds the content to the end.
myList.add(12);
myList.add(15);


// The "get" function retrieves the data at the index provided
// ... so this loop prints the data in order.
for ( int i = 0; i < myList.size(); i++) {
  System. out .println(myList.get(i));
}
