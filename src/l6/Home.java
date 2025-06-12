package l6;

// Интерфейс для частей дома
interface IPart {
    void build();
    boolean isBuilt();
    String getDescription();
    double getCompletionPercentage();
}
interface IWorker {
    void work(House house);
}
class Basement implements IPart {
    private boolean built;
    public Basement() {
        this.built = false;
    }
    public void build() {
        if (!built) {
            System.out.println("Фундамент заложен.");
            built = true;
        } else {
            System.out.println("Фундамент уже построен.");
        }
    }
    public boolean isBuilt() {
        return built;
    }
    public String getDescription() {
        return "Фундамент";
    }
    public double getCompletionPercentage() {
        return 20.0;
    }
}
class Walls implements IPart {
    private boolean built;
    private int wallNumber;
    public Walls(int wallNumber) {
        this.built = false;
        this.wallNumber = wallNumber;
    }
    public void build() {
        if (!built) {
            System.out.println("Стена " + wallNumber + " возведена.");
            built = true;
        } else {
            System.out.println("Стена " + wallNumber + " уже построена.");
        }
    }
    public boolean isBuilt() {
        return built;
    }
    public String getDescription() {
        return "Стена " + wallNumber;
    }
    public double getCompletionPercentage() {
        return 8.0;
    }
}
class Door implements IPart {
    private boolean built;
    public Door() {
        this.built = false;
    }
    public void build() {
        if (!built) {
            System.out.println("Дверь установлена.");
            built = true;
        } else {
            System.out.println("Дверь уже установлена.");
        }
    }
    public boolean isBuilt() {
        return built;
    }
    public String getDescription() {
        return "Дверь";
    }
    public double getCompletionPercentage() {
        return 10.0;
    }
}
class Window implements IPart {
    private boolean built;
    private int windowNumber;
    public Window(int windowNumber) {
        this.built = false;
        this.windowNumber = windowNumber;
    }
    public void build() {
        if (!built) {
            System.out.println("Окно " + windowNumber + " установлено.");
            built = true;
        } else {
            System.out.println("Окно " + windowNumber + " уже установлено.");
        }
    }
    public boolean isBuilt() {
        return built;
    }
    public String getDescription() {
        return "Окно " + windowNumber;
    }
    public double getCompletionPercentage() {
        return 7.0;
    }
}
class Roof implements IPart {
    private boolean built;
    public Roof() {
        this.built = false;
    }
    public void build() {
        if (!built) {
            System.out.println("Крыша установлена.");
            built = true;
        } else {
            System.out.println("Крыша уже построена.");
        }
    }
    public boolean isBuilt() {
        return built;
    }
    public String getDescription() {
        return "Крыша";
    }
    public double getCompletionPercentage() {
        return 10.0;
    }
}
class House {
    private Basement basement;
    private Walls[] walls;
    private Door door;
    private Window[] windows;
    private Roof roof;
    public House() {
        this.basement = new Basement();
        this.walls = new Walls[4];
        for (int i = 0; i < 4; i++) {
            this.walls[i] = new Walls(i + 1);
        }
        this.door = new Door();
        this.windows = new Window[4];
        for (int i = 0; i < 4; i++) {
            this.windows[i] = new Window(i + 1);
        }
        this.roof = new Roof();
    }
    public Basement getBasement() {
        return basement;
    }
    public Walls[] getWalls() {
        return walls;
    }
    public Door getDoor() {
        return door;
    }
    public Window[] getWindows() {
        return windows;
    }
    public Roof getRoof() {
        return roof;
    }
    public boolean isComplete() {
        if (!basement.isBuilt()) return false;
        for (Walls wall : walls) {
            if (!wall.isBuilt()) return false;
        }
        if (!door.isBuilt()) return false;
        for (Window window : windows) {
            if (!window.isBuilt()) return false;
        }
        return roof.isBuilt();
    }
    public void displayHouse() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/________\\");
        System.out.println("|        |");
        System.out.println("|  ----  |");
        System.out.println("|  |  |  |");
        System.out.println("|  ----  |");
        System.out.println("|________|");
        System.out.println("==========");
    }
}
class Worker implements IWorker {
    private String name;
    public Worker(String name) {
        this.name = name;
    }
    public void work(House house) {
        if (!house.getBasement().isBuilt()) {
            house.getBasement().build();
            return;
        }
        for (Walls wall : house.getWalls()) {
            if (!wall.isBuilt()) {
                wall.build();
                return;
            }
        }
        if (!house.getDoor().isBuilt()) {
            house.getDoor().build();
            return;
        }
        for (Window window : house.getWindows()) {
            if (!window.isBuilt()) {
                window.build();
                return;
            }
        }
        if (!house.getRoof().isBuilt()) {
            house.getRoof().build();
            return;
        }
        System.out.println(name + ": Дом уже построен!");
    }
}
class TeamLeader implements IWorker {
    private String name;
    public TeamLeader(String name) {
        this.name = name;
    }
    @Override
    public void work(House house) {
        System.out.println("\nОтчет бригадира " + name + ":");
        if (house.getBasement().isBuilt()) {
            System.out.println("- " + house.getBasement().getDescription() + ": Готов");
        } else {
            System.out.println("- " + house.getBasement().getDescription() + ": Не готов");
        }
        for (Walls wall : house.getWalls()) {
            if (wall.isBuilt()) {
                System.out.println("- " + wall.getDescription() + ": Готова");
            } else {
                System.out.println("- " + wall.getDescription() + ": Не готова");
            }
        }
        if (house.getDoor().isBuilt()) {
            System.out.println("- " + house.getDoor().getDescription() + ": Установлена");
        } else {
            System.out.println("- " + house.getDoor().getDescription() + ": Не установлена");
        }
        for (Window window : house.getWindows()) {
            if (window.isBuilt()) {
                System.out.println("- " + window.getDescription() + ": Установлено");
            } else {
                System.out.println("- " + window.getDescription() + ": Не установлено");
            }
        }
        if (house.getRoof().isBuilt()) {
            System.out.println("- " + house.getRoof().getDescription() + ": Готова");
        } else {
            System.out.println("- " + house.getRoof().getDescription() + ": Не готова");
        }
        double progress = calculateProgress(house);
        System.out.printf("Процент завершения: %.0f%%\n", progress); // Format to whole number
    }
    private double calculateProgress(House house) {
        double completedPercentage = 0.0;
        if (house.getBasement().isBuilt()) {
            completedPercentage += house.getBasement().getCompletionPercentage();
        }
        for (Walls wall : house.getWalls()) {
            if (wall.isBuilt()) {
                completedPercentage += wall.getCompletionPercentage();
            }
        }
        if (house.getDoor().isBuilt()) {
            completedPercentage += house.getDoor().getCompletionPercentage();
        }
        for (Window window : house.getWindows()) {
            if (window.isBuilt()) {
                completedPercentage += window.getCompletionPercentage();
            }
        }
        if (house.getRoof().isBuilt()) {
            completedPercentage += house.getRoof().getCompletionPercentage();
        }
        return completedPercentage;
    }
}
class Team {
    private IWorker[] workers;
    public Team(IWorker[] workers) {
        this.workers = workers;
    }
    public void buildHouse(House house) {
        while (!house.isComplete()) {
            for (IWorker worker : workers) {
                worker.work(house);
                if (house.isComplete()) break;
                // Добавлено, чтобы TeamLeader давал отчет на каждой итерации.
                if (worker instanceof TeamLeader) {
                    ((TeamLeader) worker).work(house);
                }
            }
        }
        System.out.println("\nДом построен!");
        house.displayHouse();
    }
}
public class Home {
    public static void main(String[] args) {
        House house = new House();
        IWorker[] workers = {
                new Worker("Вася"),
                new Worker("Петя"),
                new TeamLeader("Иван")
        };
        Team team = new Team(workers);
        team.buildHouse(house);
    }
}