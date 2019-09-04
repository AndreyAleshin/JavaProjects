package com.github.andreyaleshin.HeadFirstJava.Network;

/**
 * Пример работы 2-х потоков (Райан и Моника) над одним объектом (банковский счёт).
 * RyanAndMonicaJob реализует интерфейс Runnable (задачу, которую нужно выполнить) и
 * описывает поведение, присущее и Райанау, и Монике - проверка баланса и снятие денег
 * со счёта. Этот класс имеет одну переменную экземпляра типа BankAccount, которая представляет
 * их общий счёт.
 * Head First (c. 536)
 */
public class RyanAndMonicaJob implements Runnable{

    /*
    У нас будет только один экземпляр MonicaAndRyanJob. Это означает, что оба потока будут получать
    доступ к одному банковскому счёту.
     */
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {

        // Экземпляр Runnable (задача)
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        /*
         Создаём два потока с одной задачей Runnable. Это значит, что оба потока будут работать
         с одним экземпляром счёта, который находится в классе Runnable.
         */
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Райан");
        two.setName("Моника");
        one.start();
        two.start();

    }

    /*
    В методе run() поток зацикливается и при каждой итерации вытается снять деньги со счёта.
    После снятия он ещё раз проверяет баланс, чтобы убедиться, что лимит не превышен.
     */
    public void run() {

        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);

            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита");
            }

        }

    }

    /*
    Чтобы метод мог выполнятся одновременно только в одном потоке, используем ключевое слово
    synchronized. Это ключевое слово означает, что для работы с отмеченным кодом требуется
    ключ. Чтобы защитить свои данные (например, банковский счёт), синхронизируйте методы,
    которые рабоатют с этими данными.
     */
    private synchronized void makeWithdrawal(int amount) {

        /*
        Проверяем баланс и, если на счету недостаточно денег, просто выводим сообщение. Если же
        средвста хватает, приостанавливаем поток, затем возобновляем его, чтобы завершить транзакцию
        (как это делал Райан).
         */
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");

            try {

                System.out.println(Thread.currentThread().getName() + " идёт подремать");
                Thread.sleep(500);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");

        } else {
            System.out.println("Извините, для клиента " + Thread.currentThread().getName() +
                    " недостаточно денег");
        }
        /*
        С помощью набора методов println можно наблюдать, что происходит во время выполнения
        программы.
         */

    }

}

class BankAccount {

    // Изначально на счету $100
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

}