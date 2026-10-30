package headFirstJava;

class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            // 2. Сначала создаем объект для ТЕКУЩЕГО z (начиная с 0)
            h[z] = new Hobbits();
            h[z].name = "Бильбо";

            if (z == 1) {
                h[z].name = "Фродо";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }

            // Печать
            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошего хоббита");

            // 3. Увеличиваем z ТОЛЬКО ПОСЛЕ того, как всё сделали
            z = z + 1;
        }
    }
}