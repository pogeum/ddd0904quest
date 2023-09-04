// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        // int cash=0;// 잔액
        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.( + 함수)
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money;

        money = a1.withdraw(400); //-메서드
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600 //잔액 불러오기

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}

class Account {
    static int cash = 0;

    public void deposit(int a) {
        cash = cash + a;
        System.out.printf("%d원을 예금했습니다.\n", a);
        System.out.printf("잔액 : %d\n", cash);
    }

    public int withdraw(int b) {
        cash = cash - b;
        return b;
    }

    public int getRemainder() {
        return cash;
    }


}