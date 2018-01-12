import LinkedList.ListNode;

public class LinkedListListImplementation
{
  private int length; 
  private ListNode head;
  public ListNode getHead()
  {
    return this.head;
  }
  public void insertATBegin(ListNode new_node)
  {
    new_node.setNext(head);
    head = new_node;
    length+=1;
  }



  public LinkedListListImplementation()
  {
    this.length = 0;
    this.head = null;
  }
}