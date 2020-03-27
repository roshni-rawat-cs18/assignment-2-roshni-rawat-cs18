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
public void printLeftNode(){
  LeftNode(root);
  }
public void preorder(TreeNode root){
  if(root==null);
  return;
  elseif{
    System.out.println(root.getdata()+"\t");
    preorder(root.getLeft());
    preorder(root.getRight());
    }
  }
public void postorder(TreeNode root){
  if(root==null)
    return;
  else{
    postorder(root.getleft());
    postorder(root.getRight());
    System.out.println(root.getdata()+"\t");
    }
  }
public void preVSpost(){
  postorder(root);
  system.out.println(root);
  preorder(root);
  }
public TreeNode getroot(){
  return root;
 }

                    


