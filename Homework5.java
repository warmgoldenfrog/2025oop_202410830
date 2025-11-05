package Class;

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer myPC = new PersonalComputer();
        myPC.turnOn();
        myPC.printInfo();
    }
}

    class PersonalComputer {
        private Computer computer;
        private Monitor monitor;

    public PersonalComputer() {
            this.computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
            this.monitor = new Monitor("24 inch", "Black", "45W");
        }

        public void turnOn () {
            computer.turnOn();
            monitor.turnOn();
        }

        public void printInfo () {
            computer.printInfo();
            monitor.printInfo();
        }
    }

    class Computer {
        private String cpu;
        private String memory;
        private String hd;
        private String color;
        private String power;

        public Computer(String cpu, String memory, String hd, String color, String power) {
            this.cpu = cpu;
            this.memory = memory;
            this.hd = hd;
            this.color = color;
            this.power = power;
        }

        public void turnOn() {
            System.out.println("Turning on the computer");
        }

        public void printInfo() {
            System.out.println("The spec of the computer");
            System.out.printf(" CPU: %s\n Memory: %s\n Hdd: %s\n Color: %s\n Power: %s\n",
                    cpu, memory, hd, color, power);
        }
    }

    class Monitor {
        private String monitorSize;
        private String color;
        private String power;

        public Monitor(String monitorSize, String color, String power) {
            this.monitorSize = monitorSize;
            this.color = color;
            this.power = power;
        }

        public void turnOn() {
            System.out.println("Turning on the monitor.");
        }

        public void printInfo() {
            System.out.println("The spec of the monitor");
            System.out.printf(
                    " Size: %s \n Color: %s \n Power: %s\n",
                    this.monitorSize, this.color, this.power);
        }
    }
