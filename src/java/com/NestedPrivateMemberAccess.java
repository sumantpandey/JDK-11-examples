public class NestedPrivateMemberAccess {
    private String name = "I'm parent!";

     class Child {
        public void printName() {
            System.out.println(name);       // access NestedPrivateMemberAccess's private member!
        }
    }

    public static void main(String[] args){
        NestedPrivateMemberAccess.Child p = new NestedPrivateMemberAccess().new Child();
        p.printName();
        
    }
    
}