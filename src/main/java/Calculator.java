public class Calculator {
    private int x;
    private int y;

    public Calculator() {
    }

    public Calculator(int x){
        this.x = x;
    }

    public int count(int x, int y){
        return x + y;
    }

    public int subtr(int x, int y){
        return 0;
    }

    public int pangkat(){
        return x * x;
    }
}
