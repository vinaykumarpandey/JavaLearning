Interview question


  1. Explain about internal architecture of HashSet?/How hashset works? /Exclain the code how hashset adds elements such that duplicates are not allowed?
2. Implement add method of Hashset
3. Implement contains method of HashSet.
4.  How to add/remove/contains objects into the set
5.  How to iterate over set  - >
        Way1 - using Iterator
        Way2 - using foreach loop



To Do for today -

Create a HashSet of String type. Store your name, your college name, and your date of birth inside the se.  Iterate over it and print the elements line by line.




Public boolean contains(Object element){

 int bucket = hashFunction(element);

for( Node node: A[bucket]){
   if(node.value.equals(element)){
      return true;
   }
}

return false;
}


HashSet
  - Underlying concept is hashing mechanism
  - Insertion order is not preserved
  - set doesn’t contains the duplicate data
 - it can store heterogenous data element
 - null insertion is possible (but able once)
- Hashset is best suited for fast searching and storing any data that should not allow duplicate


SortedSet -

- It is child interface of Set interface
 interface SortedSet extends Set{
 }
- It maintains the natural sorting order -
- 1 2 3 4 5
- A C H D Y N Z - > A C D H N Y Z

NavigableSet

 - its the child interface of SortedSet
 - It provide some sort of navigation  - basically makes the navigation of object faster


 TreeSet -

 // We use TreeSet when we need sorted and unique data
 - It stores the data internally as a balanced tree -> advanced data structure concept
           reduces the searching time

        10
      6      20
   4    8

-  Duplicates are not allowed
- Insertion order is not preserved
- It will sort the elements based on natural sorting order
- Heterogeneous objects will not be allowed to store - If you are trying to store heterogeneous objects
then it will throw ClassCastException
- For the empty TreeSet as the 1st element "null" insertion is possible but after inserting that null
if we are trying to insert any other null will throw NullPointerException
- For the non empty TreeSet if we are trying to insert null then we will get NullPointerException

Sorting -

 100 21 45 76 31

  Sorted in increasing order (natural sorted order) - 21 31 45 76 100 -
  Sorted in decreasing order - 100 76 45 31 21


Custom sorting can be done in two ways -

   1. By Implementing Comparable Interface
   2. By Implementing Comparator interface


 1. By Implementing Comparable Interface -
     it is part of java.util package
     it has one method
       int compareTo(Object obj);

     By default some class implements the comparable Interface
         1. String
         2. Wrapper classes - Integer, Long, Float, Double

         if these objects gets stored in treeset then it will be sorted based on natural sorting order










