public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс счета клиента

        int pay = 300; // Клиент пополнил счёт на 300 рублей
//      pay = 1100; // Клиент пополнил счёт на 1000 рублей
        int bonus = 0; // Бонус

        if (pay >= 1000) {
            bonus = pay/100;
        }

        balance = pay + bonus + balance;

        System.out.println("Рассчитали баланс бонусных рублей. На пополнение счета:");
        System.out.println((balance) + " баланс");
    }
}