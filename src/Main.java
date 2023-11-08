public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // Начальный счёт клиента
        int depositAmount = 1100; // Сумма пополнения
        int bonus; // Размер бонуса

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = initialAmount + depositAmount + bonus; // Итоговая сумма

        System.out.println("На вашем счету: " + totalAmount + " рублей. Количество бонусов: " + bonus);

    }
}
