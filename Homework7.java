
public class Homework7 {

    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer {
    String model; //모델명
    int printedCount; //현재까지의 출력 매수
    int availableCount; //출력 가능 매수

    public Printer(String model, int availableCount) {
        this.model = model;
        this.printedCount = 0;
        this.availableCount = availableCount;
    }
    public abstract boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
        else {
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
        else {
            printedCount += 1;
            availableCount -= 1;
            return true;
        }
    }
}
