import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        Tankas tankas = new Tankas();






        boolean programaVeikia = true;


        while (programaVeikia) {
            String komandaA = sc.next();

            if (komandaA.equals("x")) {
                programaVeikia = false;
            }

            else if (komandaA.equals("a"))  {
                System.out.println("Į VAKARUS");
                tankas.Vakarai();

            } else if (komandaA.equals("w")){
                System.out.println("Į ŠIAURĘ");
                tankas.Siaure();
            }
                else if (komandaA.equals("d")){
                System.out.println("Į RYTAI");
                tankas.Rytai();
            }
                    else if (komandaA.equals("s")){
                System.out.println("Į PIETUS");
                tankas.Pietus();
            }
                        else if (komandaA.equals("i")){
                            tankas.Info();
            }
                        else if (komandaA.equals("k")){
                            System.out.println("SHOOT");
                            tankas.Suviai();

            }


            else {
                System.out.println("Ivedete ne is meniu komanda");
            }


        }
    }
}
