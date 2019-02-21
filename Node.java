package myCollection;
public class Node{
    public int Data;
    Node Next;
    Node()
    {}
    Node(int N)
    {
        Data=N;
        Next=null;
    }

    Node(int N,Node Obj)
    {
        Data=N;
        Next=Obj;
    }


}