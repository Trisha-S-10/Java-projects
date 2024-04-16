package player;

public class Player {
    private String name;
    private int age;
    private String contact;
    private String email;
    private char symbol;

    public void setDetails(String name, int age, String contact, String email, char symbol){
        this.name= name;
        this.age= age;
        this.contact= contact;
        this.email= email;
        this.symbol= symbol;
    }

    public void getDetails(){
        System.out.println("Player name: "+ this.name);
        System.out.println("Player age: "+ this.age);
        System.out.println("Player contact: "+ this.contact);
        System.out.println("Player EmailID: "+this.email);
        System.out.println("Player symbol: "+ this.symbol);
    }

    public String getPlayerName(){
        return this.name;
    }

    public char getPlayerSymbol(){
        return this.symbol;
    }
}
