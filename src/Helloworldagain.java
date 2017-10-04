import java.util.Scanner;

    public class Helloworldagain {
        public static void main(String[] args){

            Scanner keyboard = new Scanner(System.in);
            String name ="";
            System.out.println("Please type your Name:");
            name = keyboard.nextLine();

//Calling string name from methods
            System.out.println(helloEnglish(name));
            System.out.println(helloFrench(name));
            System.out.println(helloTwi(name));
            System.out.println(helloAfaanoromo(name));



        }


        //English method
        public static String helloEnglish(String name) {

            return "English: "+"Hello, "+name+"!";


        }
        //French Method

        public static String helloFrench(String name) {

            return "French: "+"Bonjour, "+name+"!";

        }
        //Twi Method

        public static String helloTwi(String name) {

            return "Twi: "+"Mahai, "+name+"!";

        }
        //Afaanoromo Method

        public static String helloAfaanoromo(String name) {

            return "Afannoromo: "+"Akam, "+name+"!";

        }


    }
