public class Solution {
    public static void main(String[] args) {

// creating habitats
    Habitat savannah = new Habitat("Savannah", 1500, true, 30.0, 40.0);
    Habitat forest = new Habitat("Forest", 3000, false, 25.0, 50.0);
    Habitat aviary = new Habitat("Tropical Aviary", 200, true, 28.0, 60.0);
//craeting zookerpes
    ZooKeeper john = new ZooKeeper("John", 10);
    ZooKeeper mary = new ZooKeeper("Mary", 12);
    ZooKeeper lisa = new ZooKeeper("Lisa", 5);

    FeedingSchedule fs1 = new FeedingSchedule("08:00", "Meat", 5.0);
    FeedingSchedule fs2 = new FeedingSchedule("09:00", "Vegetables", 50.0);
    FeedingSchedule fs3 = new FeedingSchedule("07:30", "Seeds", 0.5);

    Animal simba = new Lion("Simba", 5, 190.0, "Healthy",
    savannah, john, fs1, "Golden", 0.5);

    Animal dumbo = new Elephant("Dumbo", 8, 5400.0, "Sick",
    forest, mary, fs2, "Grey", 1.5);

    Animal polly = new Parrot("Polly", 2, 1.0, "Healthy",
    aviary, lisa, fs3, 0.3, true);

    Animal[] animals = { simba, dumbo, polly };
// display all animals
    for (Animal a : animals) a.displayInfo();

    john.feedAnimal("Simba");
    simba.eat();

    mary.feedAnimal("Dumbo");
    dumbo.eat();

    lisa.feedAnimal("Polly");
    polly.eat();

    savannah.adjustEnvironment(32.0, 45.0);
    forest.cleanHabitat();

    dumbo.checkHealth();
    }
}


// base animal class 
class Animal {
    String name, health;
    int age;
    double weight;
    Habitat habitat;
    ZooKeeper keeper;
    FeedingSchedule feed;

    Animal(String n, int a, double w, String h, Habitat hb, ZooKeeper k, FeedingSchedule f) {
    name = n; age = a; weight = w; health = h;
    habitat = hb; keeper = k; feed = f;
    }

    void eat() {
    System.out.println(name + " is eating " + feed.food + "...");
    }
// displaying common animal details
    void checkHealth() {
    System.out.println(name + " health status: " + health);
    }

    void displayInfo() {
    System.out.println("Animal: " + name + ", Age: " + age + ", Weight: " + weight + "kg, Health: " + health);
    habitat.display();
    keeper.display();
    feed.display();
    System.out.println();
    }
}


// mammals class inherits animals
class Mammal extends Animal {
    String fur;
    Mammal(String n, int a, double w, String h, Habitat hb, ZooKeeper k,
    FeedingSchedule f, String fur) {
    super(n, a, w, h, hb, k, f);
    this.fur = fur;
    }
}


class Lion extends Mammal {
    double mane;
    Lion(String n, int a, double w, String h, Habitat hb, ZooKeeper k,
    FeedingSchedule f, String fur, double m) {
    super(n, a, w, h, hb, k, f, fur);
    mane = m;
    }

    void displayInfo() {
    super.displayInfo();
    System.out.println("Fur Color: " + fur);
    System.out.println("Mane Size: " + mane + "m\n");
    }
}


class Elephant extends Mammal {
    double tusk;
    Elephant(String n, int a, double w, String h, Habitat hb, ZooKeeper k,
    FeedingSchedule f, String fur, double t) {
    super(n, a, w, h, hb, k, f, fur);
    tusk = t;
    }

    void displayInfo() {
    super.displayInfo();
    System.out.println("Fur Color: " + fur);
    System.out.println("Tusk Length: " + tusk + "m\n");
    }
}

// bird class
class Bird extends Animal {
    double wing;
    Bird(String n, int a, double w, String h, Habitat hb, ZooKeeper k,
    FeedingSchedule f, double ws) {
    super(n, a, w, h, hb, k, f);
    wing = ws;
    }
}

class Parrot extends Bird {
    boolean talk;
    Parrot(String n, int a, double w, String h, Habitat hb, ZooKeeper k,
    FeedingSchedule f, double ws, boolean t) {
    super(n, a, w, h, hb, k, f, ws);
    talk = t;
    }

    void displayInfo() {
    super.displayInfo();
    System.out.println("Wing Span: " + wing + "m");
    System.out.println("Can Talk: " + (talk ? "Yes" : "No") + "\n");
    }
  }


//habitat class 
  class Habitat {
    String name;
    int area;
    boolean clean;
    double temp, hum;

    Habitat(String n, int a, boolean c, double t, double h) {
    name = n; area = a; clean = c; temp = t; hum = h;
    }

    void adjustEnvironment(double t, double h) {
    System.out.println("Adjusting " + name + " temperature to " + t + "C and humidity to " + h + "%...");
    }

    void cleanHabitat() {
    System.out.println(name + " habitat is now clean.");
    }

    void display() {
    System.out.println("Habitat: " + name + ", Area: " + area + " sq.m, Clean: " + (clean ? "Yes" : "No") + ", Temp: " + temp + "C, Humidity: " + hum + "%");
    }
 }

class ZooKeeper {
    String name;
    int exp;

    ZooKeeper(String n, int e) { name = n; exp = e; }

    void feedAnimal(String animal) {
    System.out.println(name + " is feeding " + animal + "...");
    }

    void display() {
    System.out.println("Keeper: " + name + ", Experience: " + exp + " years");
    }
 }

class FeedingSchedule {
    String time, food;
    double qty;

    FeedingSchedule(String t, String f, double q) {
    time = t; food = f; qty = q;
    }

    void display() {
    System.out.println("Feeding Schedule: " + time +", " + food + ", " + qty + "kg");
    }
 }
  
