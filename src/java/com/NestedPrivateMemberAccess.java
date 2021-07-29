public class NestedPrivateMemberAccess {
    private static String name = "I'm parent!";

    static class Child {
        public void printName() {
            System.out.println(name);       // access NestedPrivateMemberAccess's private member!
        }
    }

    public static void main(String[] args){
        Child c = new NestedPrivateMemberAccess.Child();
        c.printName();
        
    }
    
}