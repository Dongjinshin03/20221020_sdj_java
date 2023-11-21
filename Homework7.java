abstract class Printer {

    private String model;
    private int printedCount;
    private int availableCount;

    public Printer(String models, int availableCounts, int printedCounts) {
        model = models;
        printedCount = printedCounts;
        availableCount = availableCounts;
    }

    public String getModel() {
        return model;
    }

    public int getPrintedCount() {
        return printedCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setPrintedCount(int printedCounts) { printedCount = printedCounts;}

    public void setAvailableCount(int availableCounts) { availableCount = availableCounts;}

    public void setModel(String models) { model = models;}

    public abstract boolean print();
}

class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount, int printedCount) {
        super(model, availableCount, printedCount);
    }

    @Override
    public boolean print() {
        if (getAvailableCount() == 0) {
            System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else {
            setPrintedCount(getPrintedCount()+1);
            setAvailableCount(getAvailableCount()-1);
            return true;
        }
    }
}


class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount, int printedCount) {
        super(model, availableCount, printedCount);
    }

    @Override
    public boolean print() {
        if (getAvailableCount() == 0) {
            System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else {
            setPrintedCount(getPrintedCount()+1);
            setAvailableCount(getAvailableCount()-1);
            return true;
        }
    }
}



public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500, 0);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500, 0);
        while (inkjet.print());
        while (laser.print());
    }
}

