public class Finalclass{
    int y;
    public Finalclass() {
        this.y = 10;
    }
    
    public static void main(String[] args) {
        final int x = 10;
        x = 20;
    }
}