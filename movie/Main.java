public class Main{
    public static void main(String[] args){
           String  firstName= "Sandy";
           String lastName="Jones"; 
           String movieTitle=" The Source Code ";
           int numberOfTickets=8;
           float pricePerTickets=10.57f;
           float totalPrice=numberOfTickets*pricePerTickets;
           String userName=(firstName+lastName).toLowerCase();
           int amountOfMoney=300;
           

           System.out.println("Congratulations!! You have successfully booked tickets"+"\n"+ 
           "Username: "+userName+"\n"+
            "Movie: "+movieTitle.toUpperCase()+"\n"+
            "Number of Tickets: "+numberOfTickets+"\n"+
            "Price per ticket: $"+pricePerTickets+"\n"+
            "Total price of 8 tickets: $"+totalPrice+"\n"+
            "\n"+
            "Thank you for choosing us for booking your movie tickets \n"+
            "Enjoy your movie!!!");
            if(amountOfMoney>200){
                System.out.println("Go to delhi");
            }else if(amountOfMoney<200){
                System.out.println("Check the money spent");
            }else{
                System.out.println("go to parents home");
            }
    }}