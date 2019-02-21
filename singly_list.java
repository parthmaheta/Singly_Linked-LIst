package myCollection;
 public class singly_list{
     Node Head=null;
     int Last=0;

    public void addFirst(int N)
     {
         if(Head==null)
             Head=new Node(N);
         else
		     Head=new Node(N,Head);
		Last++;
     }
    public void addLast(int N)
     {
         if(Head==null)
             Head=new Node(N);
         else {
             Node tmp = getAt(Last);
             tmp.Next = new Node(N);
         }
         Last++;
     }
   public  void addAt(int N,int Pos)
     {   Node Obj;
         if(Pos<1 || Pos>Last+1)
             System.out.println("Out Of Range");
         else if(Pos==1)
             addFirst(N);
         else if(Pos==Last+1)
             addLast(N);
         else {
             Obj = getAt(Pos - 1);
             Obj.Next=new Node(N,Obj.Next);
             Last++;
         }
     }

    public void removeFirst()
     {
         if(Head==null)
             System.out.println("List is Empty");
         else if(Head.Next==null) {
             Head = null;
             Last--;
         }
         else
         {
             Head=Head.Next;
             Last--;
         }
     }
     public void removeLast()
     {
         Node Obj;
         if(Head==null)
             System.out.println("List is Empty");
         else if(Head.Next==null) {
             Head = null;
             Last--;
         }
         else {
             Obj=getAt(Last-1);
             Obj.Next=null;
             Last--;
         }

     }

     public void removeAt(int Pos)
     {   Node tmp,obj;
         if(Pos<1 || Pos>Last)
             System.out.println("Out Of Range");
         else if(Pos==1)
           removeFirst();
         else if(Pos==Last)
             removeLast();
         else{
             obj=getAt(Pos);
             tmp=obj.Next;
             obj=getAt(Pos-1);
             obj.Next=tmp;
             Last--;
         }
     }

    public Node getAt(int Pos){
         Node Obj;
         Obj=Head;
         if(Pos<1 || Pos>Last) {
             System.out.println("Out of range");

         }
         else
             {
                 for(int i=0;i<Pos-1;i++)
                 {
                     Obj=Obj.Next;
                 }
             }
         return Obj;
     }

    public void printList()
     {
         if(Head==null)
             System.out.println("List Is Empty");
         else {
                Node Obj=Head;
                while(Obj!=null) {
                    System.out.print(Obj.Data+"  ");
                    Obj=Obj.Next;
                }
             }
     }
 }


