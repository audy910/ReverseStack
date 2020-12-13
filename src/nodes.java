import java.util.ArrayList;

public class nodes
{
    //variables

    private Node tail;
    ArrayList<Node> myList;

    //constructor
    public nodes()
    {
        tail = null;
        myList = new ArrayList<Node>();
    }

    //methods
    public void push()
    {
        //remove the top, replace with bottom
        Node position = tail;
        myList.trimToSize();

        if(myList.size() == 0)
        {

            System.out.println("Delete empty list?");
            System.exit(1);
        }
        else {
            myList.remove(0);

        }

    }

    public void pop(int num)
    {
        //add to top
        tail = new Node(num, tail);
        myList.add(tail);


    }

    public String peek()
    {
        //return top number
        return "head: "+myList.get(0).getDate();
    }
    public String tailToString()
    {
        return tail.toString();
    }


    public void showList()
    {
        //system print list in order

        Node[] nodeArr = myList.toArray(new Node[0]);
        for (Node node : nodeArr) {
            System.out.print(node.getDate() + ", ");
        }
//        StringBuilder list = new StringBuilder("The list is: ");
//        myList.trimToSize();
//        for(int i = 0; i == myList.size()-1; i++)
//        {
//            String nodeValue = (myList.get(i).getDate()) + ", ";
//            list.append(nodeValue);
//        }
//        return list.toString();

    }

    public int length()
    {
        //return length of the list
        int count = 0;
        Node position = tail;
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

