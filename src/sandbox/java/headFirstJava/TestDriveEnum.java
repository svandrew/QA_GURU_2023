package headFirstJava;

import static headFirstJava.PoaType.BANK_A_CLUB;
import static headFirstJava.PoaType.NOTAR_REZ;

public class TestDriveEnum {
    public static void main(String[] args) {

        for (PoaType e : PoaType.values()) {
            if (e.getPoaType().equals("Банковская")) {
                System.out.println(e);
            }
        }

        for (PoaType e : PoaType.values()) {
            if (e.equals(PoaType.valueOf(BANK_A_CLUB.name()))) {
                System.out.println(e + " - " + e.getPoaType());
            }
        }
    }
}

