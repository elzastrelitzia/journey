import java.util.Random;

public class rollthedice {

    public static void main(String[] args) {
        Random random = new Random();

        String[] message = {"you died!", "jackpot", "get back to the kitchen", "sweet!", "fork found in the kitchen", "neegy?", "lebron james", "oil up!", "what?", "hmmmm", "count me in!", "who is this?!"};
        String[] results = {"bomb", "gold", "pan", "chocolate", "fork", "neegy", "lebron", "diddy", "kevin hart", "furry", "femboy", "bob"};
        int dice = random.nextInt(13);

        System.out.println("your dice is: " + dice);
        System.out.println("you got: " + results[dice]);
        System.out.println(message[dice]);

    }
}
