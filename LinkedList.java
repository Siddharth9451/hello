import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int n)
  {
    data=n;
    next=null;
  }
}
class LinkedList
{
  Node head;
  void insertLinkedList(int n)
  {
    Node newNode=new Node(n);
    if(head==null)
    {
      head=newNode;
    }
    else
    {
      Node ptr=head;
      while(ptr.next!=null)
      {
        ptr=ptr.next;
      }
      ptr.next=newNode;
    }
  }
  void printLinkedList()
  {
    Node ptr=head;
    while(ptr!=null)
    {
      System.out.println(ptr.data);
      ptr=ptr.next;
    }
  }
  void deleteDups()
  {
    Node current = head;
    while(current!=null)
    {
      Node runner = current;
      while(runner.next!=null)
      {
        if(runner.next.data == current.data)
        {
          runner.next = runner.next.next;
        }
        else
        {
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }
  void kthLast(int k)
  {
    Node current = head;
    Node runner = head;
    for(int i=0;i<k;i++)
    {
      runner = runner.next;
    }
    if(runner!=null)
    {
      while(runner!=null)
      {
        runner = runner.next;
        current = current.next;
      }
    }
    else
    {
      System.out.println("Input the correct value of k");
    }
    System.out.println(current.data);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    LinkedList list=new LinkedList();
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    list.insertLinkedList(sc.nextInt());
    System.out.println("Original Linked List is");
    list.printLinkedList();
    System.out.println("Input position of the element to be displayed from the last");
    int k = sc.nextInt();
    list.kthLast(k);
    System.out.println("Linked List after duplicate removal is");
    list.deleteDups();
    list.printLinkedList();

  }
}
