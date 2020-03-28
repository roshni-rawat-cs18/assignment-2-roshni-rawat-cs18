/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;
public class MyPriorityQueue {
  Node head;
  public MyPriorityQueue(){
    head=null;
    }
  public void insert(String name,int roll){
    Node tn= new Node();
    tn.setName(name);
    Node temp=head;
    if(head==null){
      head=tn;
      }
    else{
      if(head.getRight()>roll){
        tn.setNext(head);
        head=temp;
        }
      else{
        while(temp.getNext()!=null&&temp.getNext().getRoll()<roll){
          temp=temp.getNext();
          }
        tn.setNext(temp.getNext());
        temp.setNext(tn);
        }
      }
    
  
    
      
}
