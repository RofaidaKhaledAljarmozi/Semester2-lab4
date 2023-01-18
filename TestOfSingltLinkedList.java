public class TestOfSingltLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList <String> s=new SinglyLinkedList<>();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.AddFirst("Rofaida");
        s.AddFirst("Khaled");
        s.AddFirst("Yousra");
        System.out.println("\n");
        while (!s.isEmpty()){
            System.out.println(s.removeFirst()+"\t");
        }
        System.out.println(s.size());
    }
}
