package headFirstJava;

class TapeDeck {
    boolean canRecord;

    void playTape() {
        System.out.println("пленка проигрывается");
    }

    void recordTape() {
        System.out.println("идет запись на пленку");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {

        var t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {
            t.recordTape();
        }
    }
}