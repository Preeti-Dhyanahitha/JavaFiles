class Sync{
    public static void main(String[] args) {
        int i=0;
        void increment() {
        synchronized(this) {
            i++;
        }
    }
}