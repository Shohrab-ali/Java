import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Chatbot
{
   public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(); 
        
        String[] jokes =
        {
            "why do programmers prefer dark mode? Because light attracts bugs!",
            "why did the java developer go broke? Because he used up all his cache!",
            "why was the computer cold? It left its window open!"
        };

        String[] facts =
        {
            "Did you know? The first computer virus was created in 1986.",
            "Fun fact: Java was initially called Oak.",
            "Did you know? The first email was sent in 1971."
        };

        System.out.println("Hello! I'm your AI chatbox. Ask me something!");

        while (true)
        {
            System.out.println("you:");
            String input = scanner.nextLine().toLowerCase();
              
            if (input.contains("hi")|| input.contains("hello"))
            {
                System.out.println("Bot: Hello there! How can i help you?");
            }
            else if (input.contains("how are you"))
            {
                System.out.println("Bot: I'm just code, but I'm doing great. How about you?");
            }
            else if (input.contains("your name"))
            {
                System.out.println("Bot: I'm a simple chatbot created in java!");
            }
            else if (input.contains("time"))
            {
                LocalTime time = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                System.out.println("Bot: The current time is " + time.format(formatter));
            }
            else if (input.contains("add") || input.contains("plus"))
            {
                System.out.println("Bot: Please enter two number to add:");
                System.out.print("Number 1: ");
                int a = scanner.nextInt();
                System.out.print("Number 2: ");
                int b = scanner.nextInt();
                scanner.nextLine(); // consume line
                System.out.println("Bot: The sum is " + (a+b)); 
            }
            else if (input.contains("thank"))
            {
                System.out.println("Bot: You're welcome!");
            }
            else if (input.contains("joke"))
            {
                System.out.println("Bot: " + jokes[rand.nextInt(jokes.length)]);
            }
            else if (input.contains("fact") || input.contains("quote"))
            { 
                System.out.println("Bot: " + facts[rand.nextInt(facts.length)]);
            }
            else if (input.contains("bye"))
            { 
                System.out.println("Bot: Goodbye! Have a great day!");
                break;
            }
            else
            { 
                System.out.println("Bot: Sorry I didn't understand that, Try asking something else.");
            }
        }    
        scanner.close();
   }     
}   




















        


    








  







   















