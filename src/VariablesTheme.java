// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");

        byte cheap = 2;
        short smile = 8;
        int ok = 8;
        long os = 84194110;
        float like = 84194110;
        double model = 14.2;
        char tip = 'M';
        boolean tie = true;

        System.out.println(cheap);
        System.out.println(smile);
        System.out.println(ok);
        System.out.println(os);
        System.out.println(like);
        System.out.println(model);
        System.out.println(tip);
        System.out.println(tie);
        System.out.println("2 - это версия чипа");
        System.out.println("8 - это количество ядер");
        System.out.println("8 - это количество памяти");
        System.out.println("84194110 - это версия загрузки ОС");
        System.out.println("84194110 - это версия системной прошивки");
        System.out.println("14.2 - это идентификатор модели");
        System.out.println("M - это тип чипа");
        System.out.println("true - это реальные данные");


        System.out.println("2.Расчет стоимости товара со скидкой");

        int pen = 100;
        int book = 200;

        int generalPrice = pen + book;
        int discount = 300/100*11;
        int finishPrice = generalPrice - discount;

        System.out.println(generalPrice);
        System.out.println(discount);
        System.out.println(finishPrice);

        System.out.println("3.Вывод слова JAVA");
        System.out.println(" " +
                "  J    a  v     v  a                                                  \n" +
                "   J   a a  v   v  a a                                                 \n" +
                "J  J  aaaaa  V V  aaaaa                                                \n" +
                " JJ  a     a  V  a     a");



        System.out.println("4.Вывод min и max значений целых числовых типов");

        byte dress = 127;
        short coat = 32767;
        int bags = 2147483647;
        long shoes = 9223372036854775807L;

        System.out.println(dress);
        System.out.println(coat);
        System.out.println(bags);
        System.out.println(shoes);

        byte moreDress = (byte) (dress + 1);
        short moreCoat = (short) (coat + 1);
        int moreBags = (int) (bags + 1);
        long moreShoes = (long) (shoes +1);

        System.out.println(moreDress);
        System.out.println(moreCoat);
        System.out.println(moreBags);
        System.out.println(moreShoes);

        byte lessDress = (byte) (dress - 1);
        short lessCoat = (short) (coat - 1);
        int lessBags = (int) (bags - 1);
        long lessShoes = (long) (shoes - 1);

        System.out.println(lessDress);
        System.out.println(lessCoat);
        System.out.println(lessBags);
        System.out.println(lessShoes);

        System.out.println("5.Перестановка значений переменных");
















         }
    }
