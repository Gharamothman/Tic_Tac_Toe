import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;
import static java.lang.Thread.sleep;
import java.lang.Exception;
import java.util.concurrent.BrokenBarrierException;

public class Main {
  Node root ;

  Main ( int value ){
    root= new Node(value);
  }
  Main(){
    root= null;
  }
  
  

  public static void main(String[] args) throws Exception {
    new  
    Option();
  //   Main n = new Main ();
  //   n.root=new Node (40);
  //    Main m= new Main();
  //    m.root= new Node(40);
  //    m.root.left= new Node(30);
  //    m.root.left.left= new Node(20);
  //    m.root.left.right= new Node(32);
  //    m.root.right= new Node(50);
  //    m.root.right.left= new Node(42);
  //    m.root.right.right= new Node(60);
  //    System.out.println("     "+ m.root.data +" \n  " + m.root.left.data + "  "+  m.root.right.data+ "  \n"+  m.root.left.left.data + " " +  m.root.left.right.data+ "  "+ m.root.right.left.data + " " +  m.root.right.right.data );
  //   System.out.println(search(m.root,42)); 
  // System.out.println(COUNT_FULL_NODES( m.root.right)); 
  // System.out.println( BST_EQUALS(m.root,n.root));
  }
  public static int COUNT_FULL_NODES(Node node ){
       if (node == null )
       return 0;
       if( node.left != null && node.right != null)
       return 1+COUNT_FULL_NODES(node.left)+COUNT_FULL_NODES(node.right);
       else 
       return COUNT_FULL_NODES(node.left)+COUNT_FULL_NODES(node.right);

  }
   public static boolean BST_EQUALS(Node node1, Node node2){
    if(node1 == null && node2 == null )
    return true;
    if(node1 == null || node2 == null )
    return false; 
    if(node1.data == node2.data && BST_EQUALS(node1.left,node2.left) && BST_EQUALS(node1.right,node2.right))
    return true;
    else 
    return false;
   }
  public static boolean search(Node node, int element) {
    if (node == null) {
      return false;
    }
    if (node.data == element) {
      return true;
    } else if (node.data < element) {
     return search(node.right, element);
    } else {
     return search(node.left, element);
    }
   

  }

  public static void pre_Order(Node p) {
    if (p != null) {
      System.out.println(p.data);
    }
    pre_Order(p.left);
    pre_Order(p.right);
  }

  public static void in_Order(Node p) {
    if (p != null) {
      pre_Order(p.left);
    }
    System.out.println(p.data);
    pre_Order(p.right);
  }

  public static void pos_Order(Node p) {
    if (p != null) {
      pre_Order(p.left);
    }
    pre_Order(p.right);
    System.out.println(p.data);
  }
}