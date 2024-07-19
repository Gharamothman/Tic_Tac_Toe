import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Players implements Serializable{
    String player1;
    String player2;
    int cou1=0;
    int cou2=0;

    public Players(String player1, String player2,  int cou1,int cou2) {
        this.player1 = player1;
        this.player2 = player2;
        this.cou1 = cou1;
        this.cou2 = cou2;
      
    }

    public Players(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public static void saveUsersToFile(Players players) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("players,ser",true))) {
            // for (Object user : players) {
                System.out.println("done write "+players.getPlayer1());
                oos.writeObject(players);
            // }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("something happen when we write in file user ");
        }
    }
    public static void readUsersFromFile() {
        ArrayList<Players> allplayers = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("players,ser"))) {
            while (true) {
                try {
                 
                    Players player = (Players) objectInputStream.readObject();
                    System.out.println(player);
                    // allplayers.add(player);
                } catch (EOFException e) {
                    System.out.println("Reached end of file");
                    break; 
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            
           
        }
    
        // return allplayers;
    }
    
    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public int getCou1() {
        return cou1;
    }

    public void setCou1(int cou1) {
        this.cou1 = cou1;
    }

    public int getCou2() {
        return cou2;
    }

    public void setCou2(int cou2) {
        this.cou2 = cou2;
    }

}
