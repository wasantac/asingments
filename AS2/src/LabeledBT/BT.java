/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabeledBT;


import java.util.Stack;

/**
 *
 * @author CltControl
 */
public class BT<E> {

    private NodeBT<E> root;

    public BT() {
        this.root = null;
    }

    public NodeBT<E> getRoot() {
        return root;
    }

    public void setRoot(E root) {
        this.root = new NodeBT<>(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(E child, E parent) {
       NodeBT<E> NodeChild =new NodeBT<>(child);
        if(child==null){
            return false;
        }else if(parent ==null || isEmpty()){
            root=NodeChild;
             return true;
        } else if(parent!=null){
            if(SearchNode(child) == null){
                NodeBT<E> Np= SearchNode(parent);
                if(Np==null|| (Np.getLeft()!=null && Np.getRight()!=null )){ return false;
                } else if (Np.getLeft()==null){
                    Np.setLeft(NodeChild);
                } else {
                    Np.setRight(NodeChild);
                }
                return true;
            }
        }
        return false;
    
    }

   public NodeBT<E> SearchNode(E data){
        if(data==null || isEmpty() ) return null;
        return SearchNode(data,root);
    }
      
    private NodeBT<E> SearchNode(E Data,NodeBT <E> n){
        if(n==null){ 
            return null;
        }else if(n.getData().equals(Data)){  
            return n;
        }else{
            NodeBT<E> L= SearchNode(Data,n.getLeft());
            return(L!=null)? L:SearchNode(Data,n.getRight());
           
        }
    
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(NodeBT<E> n) {
        if (n == null) {
            return 0;
        } else if (n.getLeft() == null && n.getRight() == null) {
            return 1;
        }
        return countLeaves(n.getLeft()) + countLeaves(n.getRight());
    }

    public boolean isfull() {
        return isfull(root);
    }

    private boolean isfull(NodeBT<E> n) {
        if (n == null) {
            return true;
        } else if ((n.getLeft() == null && n.getRight() != null) || (n.getLeft() != null && n.getRight() == null)) {
            return false;
        }
        return isfull(n.getLeft()) && isfull(n.getRight()) && (height(n.getLeft()) == height(n.getRight()));
    }

    public int height() {
        return height(root);
    }

    private int height(NodeBT<E> n) {
        if (n == null) {
            return 0;
        }
        return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(NodeBT<E> node) {
        if (node != null) {
            System.out.print(node + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(NodeBT<E> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node + " ");
            inOrder(node.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(NodeBT<E> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node + " ");
        }
    }

    public NodeBT<E> preOrderNext(E element) {

        Stack<NodeBT<E>> openList = new Stack<>();

        openList.push(root);

        while (openList.empty() == false) {
            NodeBT<E> curr = openList.pop();

            if (curr.getRight() != null) {
                openList.push(curr.getRight());
            }

            if (curr.getLeft() != null) {
                openList.push(curr.getLeft());
            }

            if (curr.equals(SearchNode(element,root)) && openList.empty() == false) {
                return openList.pop();
            }
        }
        return null;
    }
     public NodeBT<E> inOrderNext(E element) {

        Stack<NodeBT<E>> openList = new Stack<>();

        openList.push(root);

        while (openList.empty() == false) {
            NodeBT<E> curr = openList.pop();

            if (curr.getRight() != null) {
                openList.push(curr.getRight());
            }
            if (curr.equals(SearchNode(element,root)) && openList.empty() == false) {
                return openList.pop();
            }
            if (curr.getLeft() != null) {
                openList.push(curr.getLeft());
            }


        }
        return null;
    }
    public NodeBT<E> postOrderNext(E element) {
        Stack<NodeBT<E>> s1 = new Stack<>(); 
        Stack<NodeBT<E>>s2 = new Stack<>(); 
  
        if (root == null || element == root.getData()) 
            return null; 
  
        // push root to first stack 
        s1.push(root); 
  
        // Run while first stack is not empty 
        while (!s1.isEmpty()) { 
            // Pop an item from s1 and push it to s2 
            NodeBT<E> temp = s1.pop(); 
            s2.push(temp); 
  
            // Push left and right children of 
            // removed item to s1 
            if (temp.getLeft() != null) 
                s1.push(temp.getLeft()); 
            if (temp.getRight() != null) 
                s1.push(temp.getRight()); 
        } 
  
        // Print all elements of second stack 
        while (!s2.isEmpty()) {  
            if(s2.peek().getData() == element){
                s2.pop();
                return s2.pop();
            }
            s2.pop();

        }
        return null;
    }
    

}
