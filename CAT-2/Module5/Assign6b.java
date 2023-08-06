package Module5; //22BCE9109
class Assign6b extends Thread {
    Assign6a l;
    Assign6b(Assign6a l) {
        this.l = l;
    }
    public void run() {
        l.getLine();
    }}