    public class Animal {
        public static void staticSpeak() {
            System.out.println("Static Animal");
        } 
        public void speak() {
            System.out.println("I'm an animal");
        }
    }

    public class Fox extends Animal{
        public static void staticSpeak() {
            System.out.println("Do a Barrel Roll.");
        }
        public void speak() {
            System.out.println("Ringding");
        }
    }