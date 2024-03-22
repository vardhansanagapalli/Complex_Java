import java.util.Scanner;

class LotteryTicket {
    private String ticketId;
    private int unluckyCode;

    public LotteryTicket(String ticketId, int unluckyCode) {
        this.ticketId = ticketId;
        this.unluckyCode = unluckyCode;
    }

    public void checkTicket() {
        int count = countUnluckyCode();
        if (count == 0) {
            System.out.println(ticketId + " is lucky ticket");
        } else if (count < 3) {
            System.out.println(ticketId + " is partially lucky");
        } else {
            System.out.println(ticketId + " is unlucky ticket");
        }
    }

    private int countUnluckyCode() {
        int count = 0;
        for (int i = 0; i < ticketId.length(); i++) {
            if (ticketId.charAt(i) - '0' == unluckyCode) {
                count++;
            }
        }
        return count;
    }
}

public class LotteryTicketFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ticket Id");
        String ticketId = scanner.nextLine();

        System.out.println("Enter the unlucky code");
        int unluckyCode = scanner.nextInt();

        LotteryTicket ticket = new LotteryTicket(ticketId, unluckyCode);
        ticket.checkTicket();

        scanner.close();
    }
}
