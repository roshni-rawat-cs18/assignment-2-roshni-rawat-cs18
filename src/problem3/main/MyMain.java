/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.muqueue.MyPriorityQueue;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  public static void main (String [] args){
    MyPriorityQueue obj=new MyPriorityQueue();
    obj.insert("roshni",1);
    obj.insert("riya",4);
    obj.insert("rahul",3);
    obj.insert("unnati",2);
    obj.insert("saumya",5);
    obj.display();
    }
  
}
