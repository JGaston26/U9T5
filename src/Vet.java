import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;
    public Vet(String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }
    public boolean addClient(Animal animal){
            if(!clients.contains(animal)){
                clients.add(animal);
                System.out.println("Welcome to " + name + " office " +  animal.getName());
                return true;
            }
        System.out.println(animal.getName() + " is already in the client list!");
        return false;
    }
    public void printClientList(){
        for(Animal x: clients){
            System.out.println(x.getName() + ": " + x.getClass());
        }
    }
}
