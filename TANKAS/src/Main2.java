import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;


public class Main2 {

        public static void main(String[] args) {
            // write your code here

            Coordinates[] coord = new Coordinates[20];

            createMap();
        }

        public static void createMap(){
            Coordinates[] coord = new Coordinates[20];

            for(int i = 0; i < 20; i ++){
                coord[i] = setCoordinates(ThreadLocalRandom.current().nextInt(0, 99) + 1, ThreadLocalRandom.current().nextInt(0, 99) + 1);
            }

            for(int i = 0; i < 20; i ++){
                coord[i].getCoord();
            }
        }

        public static Coordinates setCoordinates (int row, int column){
            Coordinates c = new Coordinates();
            c.setRow(row);
            c.setColumn(column);
            return c;
        }

        public static class Coordinates {
            int row;
            int column;

            public Coordinates(){
                //constructor
            }

            public void setColumn(int column){
                this.column = column;
            }

            public void setRow(int row){
                this.row = row;
            }

            public int getRow(){
                return row;
            }

            public int getColumn(){
                return column;
            }

            public void getCoord(){
                //just return and print the coordinates
                System.out.println("ROW: " + this.getRow() + "      COL: " + this.getColumn());
                //change void to return and return value if you like :)
            }

        }
    }

