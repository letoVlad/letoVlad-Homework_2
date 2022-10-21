public class Main {
    public static void main(String[] args) {
                System.out.println("Задача 1.");

                int numberOne = 1;
                System.out.println(numberOne);
                byte numberTwo = 2;
                System.out.println(numberTwo);
                short numberThree = 3;
                System.out.println(numberThree);
                long numberFour = 4020000L;
                System.out.println(numberFour);
                float numberFive = 2.3f;
                System.out.println(numberFive);
                double numberSix = 3.5;
                System.out.println(numberSix);

                System.out.println("-----------------");
                System.out.println("Задача 2.");
                double numberSeven = 27.12;
                System.out.println(numberSeven);
                long numberEight = 987_678_965_549L;
                System.out.println(numberEight);
                float numberNine = 2.786f;
                System.out.println(numberNine);
                short numberTen = 569;
                System.out.println(numberTen);
                boolean number = false;
                System.out.println(number);
                int numberEleven = -159;
                System.out.println(numberEleven);
                int numberTwelve = 27897;
                System.out.println(numberTwelve);
                byte numberThirteen = 67;
                System.out.println(numberThirteen);

                System.out.println("-----------------");
                System.out.println("Задача 3.");
                byte studentOne = 23;
                byte studentTwo = 27;
                byte studentThree = 30;
                short paper = 480;
                System.out.println(paper / (studentOne + studentTwo + studentThree));

                System.out.println("-----------------");
                System.out.println("Задача 4.");
                byte capacityPerMinute = 16 / 2;
                int twenty = 20;
                System.out.println("За " + twenty + " машина произвела бутылок " + capacityPerMinute * twenty + " штук");
                int day = 24 * 60;
                System.out.println("За " + "сутки" + " машина произвела бутылок " + day * capacityPerMinute + " штук");
                int threeDay = (24 * 3) * 60;
                System.out.println("За " + "3 дня" + " машина произвела бутылок " + threeDay * capacityPerMinute + " штук");
                int month = (24 * 30) * 60;
                System.out.println("За " + "за 1 месяц" + " машина произвела бутылок " + month * capacityPerMinute + " штук");

                System.out.println("-----------------");
                System.out.println("Задача 5.");
                byte totalClasses = 120 / (4 + 2);
                int whitePaint = totalClasses * 2;
                int brownPaint = totalClasses * 4;
                System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

                System.out.println("-----------------");
                System.out.println("Задача 6.");
                byte banana = 80;
                byte milk = 120;
                byte iceCream = 100;
                byte egg = 70;
                int summa = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
                int summa1 = summa / 1000;
                System.out.println("Общий вес: " + summa + " в кг: " + summa1);

                System.out.println("-----------------");
                System.out.println("Задача 7.");
                short gram250 = 250;
                short gram500 = 500;
                short fullWeightGram = 7 * 1000;
                System.out.println("Спортсмену потребуется " + fullWeightGram / gram250 + " дней, если он будет терять 250грам");
                System.out.println("Спортсмену потребуется " + fullWeightGram / gram500 + " дней, если он будет терять 500грам");
                System.out.println("Потребуется в среднем " + fullWeightGram / (gram250 + gram500) + " дней, чтобы добиться результатя похудения");

                System.out.println("-----------------");
                System.out.println("Задача 8.");
                int masha = 67760;
                int denis = 83690;
                int kristina = 76230;
                System.out.println("Маша теперь получает " + (((masha * 10) / 100) + masha) + " Годовой доход вырос на " + (masha * 10) / 100);
                System.out.println("Маша теперь получает " + (((denis * 10) / 100) + denis) + " Годовой доход вырос на " + (denis * 10) / 100);
                System.out.println("Маша теперь получает " + (((kristina * 10) / 100) + kristina) + " Годовой доход вырос на " + (kristina * 10) / 100);
            }
        }