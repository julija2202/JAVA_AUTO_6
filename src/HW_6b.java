public class HW_6b {
    public static int number =1;
    public static void printNumber(){
        System.out.println();
        System.out.print(" Task №" +
                number++ + "   ----       ");
    }

    public static void main(String[] args) {
        /*Задача №1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)*/
        printNumber();
        String s = "Перестановочный алгоритм быстрого действия";
        char[] ss = s.toCharArray();
        for (int i = 0; i<ss.length; i++){
            if(s.charAt(i)=='о'){
                System.out.println(ss[i]);
            }
        }


        /*Задача №2
        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.*/
        printNumber();
        String c = "Перевыборы выбранного президента";
        int count = 0;
        for( int i = 0; i< c.length(); i++){
            if(c.charAt(i)=='е'){
                count++;
            }
        }
        System.out.println(count);


        /*Задача №3
        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.*/
        printNumber();
        String k = "Посмотрите как Рите нравится ритм";
        String kk= k.toLowerCase();
        int index = kk.indexOf("рит");
        while (index!=-1){
            System.out.println(index);
            index = kk.indexOf("рит", index+ 1);
        }


        /*Экстра задача
        Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/
        printNumber();
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count2 = 0;
        for(int i = 0; i< array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if(array[i][j].indexOf('е') == -1){
                    count2++;

                }
            }
        }
        System.out.println(count2);


    }
}