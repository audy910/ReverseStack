public class nodesDriver
{
    public static void main (String[] args)
    {
        nodes reverseStack = new nodes();
        reverseStack.pop(12);
        reverseStack.pop(13);
        reverseStack.pop(19);

        System.out.println( reverseStack.peek());
        System.out.println(reverseStack.hasNext());
        System.out.println(reverseStack.length());
       // System.out.println(reverseStack.tailToString());
        reverseStack.showList();
        System.out.println("\npush");
        reverseStack.push();
        System.out.println(reverseStack.peek());
        System.out.println(reverseStack.hasNext());
        System.out.println(reverseStack.length());
       // System.out.println(reverseStack.tailToString());
        reverseStack.showList();
        reverseStack.push();
        System.out.println("\npush");
        reverseStack.showList();
        reverseStack.push();
        System.out.println("\npush");
        reverseStack.showList();
        reverseStack.push();
        System.out.println("\npush");
        reverseStack.showList();

    }
}
