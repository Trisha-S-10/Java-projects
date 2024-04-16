import board.Board;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        
        Board b= new Board(3, '-');
        //b.printBoardConfig();

        //b.setDefaultSymbol('-');

       // b.printBoardConfig();

        Player p1= new Player();
        p1.setDetails("0", 20, "9940959692","trisha10march@gmail.com",'0');

        Player p2= new Player();
        p2.setDetails("X", 20, "9597940288", "trisha.cs22@bitsathy.ac.in", 'X');

        // p1.getDetails();
        // p2.getDetails();

        Game game= new Game(new Player[] {p1,p2}, b);
        game.play();
    }
}
