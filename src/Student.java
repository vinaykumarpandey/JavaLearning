public class Student {
    String name;
    int id;


    //default constructor
    //no arg constructor
    //if we are overriding the constructor then we have to explicitly write the default
    // constructor otherwise java will automatically provide the default constructor
    public Student(){

    }


    //Overridden the constructor here
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //If you want to intialise the values in any class, It can be done in two ways -

    //1. Using constructor
    //2. Using setters

}
