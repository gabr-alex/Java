public class Tankas {

    int x = 0;
    int y = 0;
    int shoot = 0;
    String kryptis;
    int ShootSiaure = 0;
    int ShootVakarai = 0;
    int ShootRytai = 0;
    int ShootPietus = 0;





    public void Siaure(){
        y++;
        kryptis = "Šiaurę";
    }

    public void Vakarai(){
        x--;
        kryptis = "Vakarus";
    }

    public void Rytai(){
        x++;
        kryptis = "Rytus";
    }

    public void Pietus(){
        y--;
        kryptis = "Pietus";
    }

    public void Info(){
        System.out.println("Tankas randasi:" + x + "," + y);
        System.out.println("Buvo šauta " + shoot + " kartus");
        System.out.println("Tankas pasisukęs į: " + kryptis );
        System.out.println("Šūviai į Šiaurę :" + ShootSiaure);

    }
//
//    public void SuviuKryptis(){
//
//    }

    public void Suviai(){
        shoot++;
        if(kryptis.equals("Šiaurę")){
            ShootSiaure++;
        } else if(kryptis.equals("Vakarus")){
            ShootVakarai++;
        }
        else if(kryptis.equals("Rytus")){
            ShootRytai++;
        } else if(kryptis.equals("Pietus")){
            ShootPietus++;
        }
    }




}
