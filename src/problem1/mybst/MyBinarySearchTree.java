/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;
// to implement BinarySearchTree
public class MyBinarySearchTree {
  TreeNode root;
  int count= 0;
  public MyBinarySearchTree(){
    root =null;
    count=0;
    }
  public void insert(int data){
    TreeNode tn= new TreeNode();
    tn.setdata(data);
    if(root==null){
      root=tn;
      }
    else{
      TreeNode current=root;
      while(true){
        if(data>current.getdata()){
          current.setRight(tn);
          break;
          }
        else{
          current=current.getRight();
          }
        }
      else{
        if(current.getLeft()==null){
          current.setLeft(tn);
          break;
          }
        else{
          current=current.getleft();
          }
        }
      }
    }

}
