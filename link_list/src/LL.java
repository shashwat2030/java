import org.w3c.dom.Node;

import java.util.*;
public class LL {
    Node head;
    private int size =0;
    class Node
    {
        String data;
        Node next;
        Node (String data)
        {
            this.data=data;
            this.next=null;
        }


        private void addLast(String data)
        {


    }
public static void main (String[] args)
{
    LL list =new LL();
    list.addFirst("a");
    list.addFirst("is");
    list.addLast("a");
     list.printList();

}


    private void addLast(String data) {
        Node new_node=new Node(data);
        if(head ==null)
        {
            head =new_node;
            return;
        }
        new_node=head;
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next   =new_node;
    }
    }
    }

    private void printList() {
        Node new_node=new Node();
        if(head ==null)
        {
            head =new_node;
            return;
        }
        new_node=head;
        Node currNode=head;
        while(currNode.next!=null)
        {
            System.out.println(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    private void addFirst(String data) {
        Node new_node=new Node(data);
        if(head ==null)
        {
            head =new_node;
            return;
        }
        new_node=head;
        head =new_node;
    }
}
