import java.util.Scanner;

    public class Helloworldagain {
        public static void main(String[] args){

            Scanner keyboard = new Scanner(System.in);
            String name ="name";
            System.out.println("Name:");
            name = keyboard.nextLine();


            System.out.println(helloEnglish(name));


            System.out.println(helloFrench(name));


            System.out.println(helloTwi(name));


            System.out.println(helloAfaanoromo(name));



        }



        public static String helloEnglish(String name) {

            return "Hello, "+name+"!";


        }

        public static String helloFrench(String name) {

            return "Bonjour, "+name+"!";

        }
        public static String helloTwi(String name) {

            return "Mahai, "+name+"!";

        }
        public static String helloAfaanoromo(String name) {

            return "Akam, "+name+"!";

        }


    }
