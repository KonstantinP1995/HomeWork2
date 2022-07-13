public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 0.5f;
        double f = 6;
        char g = 32 ;
        boolean h = a < 2;

        // Задача 2
        float weightFirstBoxer = 78.2F;
        float weightSecondBoxer = 82.7F;
        float totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Вес двух боксеров " + totalWeightBoxers + " кг");
        float weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг");

        //Задача 3
        int weightBanana = 80;
        int weight100mlMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int weightCocktail = 5 * weightBanana + 2 * weight100mlMilk + 2 * weightIceCream + 4 * weightEgg;
        float weightCocktailKg = weightCocktail / 1000F;
        System.out.println("Вес завтрака в кг = " + weightCocktailKg);

        //Задача 4
        int needLoseKg = 7;
        int needLoseG = needLoseKg * 1000;
        int losePerDay1 = 250;
        int losePerDay2 = 500;
        int daysWeightLoss1 = needLoseG / losePerDay1;
        System.out.println("При ежедневном похудении на 250 грамм потребуется " + daysWeightLoss1 + " дней");
        int daysWeightLoss2 = needLoseG / losePerDay2;
        System.out.println("При ежедневном похудении на 500 грамм потребуется " + daysWeightLoss2 + " дней");
        int averageDaysWeightLoss = (daysWeightLoss1 + daysWeightLoss2) / 2;
        System.out.println("В среднем на похудение потребуется " + averageDaysWeightLoss + " дней");

        //Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        float salaryMashaIncrease = salaryMasha * 1.1f;
        float salaryDenisIncrease = salaryDenis * 1.1f;
        float salaryKrisIncrease = salaryKris * 1.1f;
        float differenceSalaryMasha = 12f * salaryMashaIncrease - 12f * salaryMasha;
        float differenceSalaryDenis = 12f * salaryDenisIncrease - 12f * salaryDenis;
        float differenceSalaryKris = 12f * salaryKrisIncrease - 12f * salaryKris;
        System.out.println("Новая зарплата Маши " + salaryMashaIncrease + " рублей, годовой доход вырос на " + differenceSalaryMasha);
        System.out.println("Новая зарплата Дениса " + salaryDenisIncrease + " рублей, годовой доход вырос на " + differenceSalaryDenis);
        System.out.println("Новая зарплата Кристины " + salaryKrisIncrease + " рублей, годовой доход вырос на " + differenceSalaryKris);

    }
}