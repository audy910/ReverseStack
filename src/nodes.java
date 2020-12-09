
public class nodes
{
    //variables
    private Node tail;
    private Node head;

    //constructor
    public nodes()
    {
        head = null;
    }

    //methods
    public void push()
    {
        //remove the top


    }

    public void pop(int num)
    {
        //add to top

        if(head == null)
        {
            head = new Node(num, tail);
        }

        tail = new Node(num, tail);
    }

    public int peek()
    {
        //return top number
        return head.getDate();
    }
    public String headtoString()
    {
        return head.toString();
    }


    public void showList()
    {
        //system print list in order
        Node position = head;
        while (position != null)
        {
            System.out.println(position.getDate());
            position = position.getLink();
        }
    }

    public int length()
    {
        //return length of the list
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public boolean hasNext()
    {
        //return true if not null below
        Node position = tail;
        if(position.getLink() != null)
        {
            return true;
        }
            return false;
    }



    private class  Node{

    //instance variables
    private int data;

    private Node link;

    //constructor
    public Node (int data, Node link)
    {
        this.data = data;
        this.link = link;
    }

    //getters and setters
    public int getDate() {
        return data;
    }

    public void setDate(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    //toString
    public String toString()
    {
        return "data: " + data + " links to " + link;
    }
}
    }//end LittleSSL

