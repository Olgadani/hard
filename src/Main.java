public class Main {
    public static void main(String[] args) {
        System.out.println("Task7");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result = -result;
        System.out.println(result);
        System.out.println("Task8");
        int a1 = 5;
        int b1 = 7;

        a1 = a1 + b1; //12
        b1 = b1 - a1; //-5
        b1 = -b1; //5
        a1 = a1 - b1;//7
        System.out.println("Task9");
        int a2 = 456;
        int b2 = a2 % 100 / 10;
        System.out.println(b2);
        System.out.println("Task6if");
        int age = 19;
        int salary = 80000;
        int limitAge = 0;
        double limitSalary = 0;
        if (age >= 23) {
            limitAge = salary * 3;
        } else {
            limitAge = salary * 2;
        }
        if (salary >= 50000) {
            limitSalary = salary * 1.2;
        } else if (salary > 80000) {
            limitSalary = salary + 1.5;
        }
        if (limitAge > limitSalary) {
            System.out.println(limitAge);
        } else {
            System.out.println(limitSalary);
        }
        System.out.println("Task7if");
        int age1 = 25;
        int salary1 = 81000;
        int wantedSum = 330000;
        double base = ((wantedSum / 100 * 10) / 12) + (wantedSum / 12);//базовая ставка месяц
        double maxPay = salary1 / 2;
        if (age1 < 23) {
            base = ((wantedSum / 100 * 11) / 12) + (wantedSum / 12);
        } else if (age1 < 30 && age1 > 23) {
            base = ((wantedSum / 100 * 10.5) / 12) + (wantedSum / 12);
        } else if (salary1 > 80000) {
            base = ((wantedSum / 100 * 9.3) / 12) + (wantedSum / 12);
        } else {
            base = base;
        }
        if (maxPay > base) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + base + " рублей. Одобрено");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + base + " рублей. Отказано");
        }
        System.out.println("Task ping-pong");
        int x = 31;
        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ping pong");
            } else if (i % 5 == 0) {
                System.out.println("pong");
            } else if (i % 3 == 0) {
                System.out.println("ping");
            } else {
                System.out.println("");
            }
        }
    }
}

