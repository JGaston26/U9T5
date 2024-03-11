public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("thing");
        Puppy puppy = new Puppy("Spot");
        Dog dog = new Dog("Penny");
        Cow cow = new Cow("Margie");
        Vet vet = new Vet("Justin's vet office");

        Animal[] animals = {animal,puppy,dog,cow};
        for(int i = 0; i < animals.length ; i++){
            if(animals[i] instanceof Cow ){
                ((Cow) animals[i]).milk();
            }
        }
        for(Animal x : animals){
            System.out.println(x.getName());
        }
        System.out.println("----> Adding each client (successful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----> Adding each client again (unsuccessful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----------> PRINTING CLIENT LIST <----------");
        vet.printClientList();


    }
}
