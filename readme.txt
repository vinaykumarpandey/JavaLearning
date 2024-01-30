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