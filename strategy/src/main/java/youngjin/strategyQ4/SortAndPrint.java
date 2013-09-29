package youngjin.strategyQ4;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print("Before -> ");
        sorter.sort(data);
        print("After -> ");
    }

    public void print(String msg) {
        System.out.print(msg + " ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}