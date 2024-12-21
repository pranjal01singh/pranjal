    import java.util.Random;
    import java.util.Scanner;
    public class rock_paper_scissor {
    
        
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rock = 1, paper = 2, scissors = 3;
        System.out.println("ROCK-PAPER-SCISSORS-GAME");
        System.out.println("********1-FOR ROCK********");
        System.out.println("********2-FOR PAPER**********");
        System.out.println("********3 FOR SCISSOR********");
        System.out.print("Enter your choice:  ");
        int uchoice = scan.nextInt();
        switch(uchoice){
            case 1-> System.out.println("-------your choice is rock-------\n");
            case 2-> System.out.println("-------your choice is paper------\n");
            case 3-> System.out.println("-------your choice is scissor-----\n");
            default-> System.out.println("you enter wrong choice");
    
        }
        Random ran=new Random();
        int pc= ran.nextInt(1,4);
        System.out.println("computer choice is: "+pc);
        switch(pc) {
            case 1 -> System.out.println("------computer choice is rock-----\n");
            case 2 -> System.out.println("------computer choice is paper---- \n");
            case 3 -> System.out.println("------computer choice is scissor---\n");
            default -> System.out.println("wrong choice");
    
        }
    
        if (uchoice==pc){
            System.out.println("Match draw");
            System.out.println("try again");
            System.out.print("Reenter your choice: ");
            int uschoice=scan.nextInt();
            switch(uschoice){
                case 1-> System.out.println("-------your choice is rock-------\n");
                case 2-> System.out.println("-------your choice is paper------\n");
                case 3-> System.out.println("-------your choice is scissor-----\n");
                default-> System.out.println("you enter wrong choice");
    
            }
            Random random=new Random();
            int comp= ran.nextInt(1,4);
            System.out.println("computer choice is: "+comp);
            switch(comp) {
                case 1 -> System.out.println("------computer choice is rock-----\n");
                case 2 -> System.out.println("------computer choice is paper---- \n");
                case 3 -> System.out.println("------computer choice is scissor---\n");
                default -> System.out.println("wrong choice");
    
            }
            if (uschoice==comp) {
                System.out.println("Match draw");
            }
            else if(uschoice==rock && comp==paper){
                System.out.println("--------computer wins-------");
            }
            else if (uschoice==paper && comp==rock) {
                System.out.println("---------user wins----------");
            }
            else if (uschoice==rock && comp==scissors){
                System.out.println("---------user wins----------");
            }
            else if(uschoice==scissors && comp==rock){
                System.out.println("--------computer wins--------");
            }
            else if(uschoice==paper && comp==scissors){
                System.out.println("--------computer wins-------");
            }
            else if(uschoice==scissors && comp==paper){
                System.out.println("---------user wins---------");
            }
        }
        else if(uchoice==rock && pc==paper){
            System.out.println("--------computer wins-------");
        }
        else if (uchoice==paper && pc==rock) {
            System.out.println("---------user wins----------");
        }
        else if (uchoice==rock && pc==scissors){
            System.out.println("---------user wins----------");
        }
        else if(uchoice==scissors && pc==rock){
            System.out.println("--------computer wins--------");
        }
        else if(uchoice==paper && pc==scissors){
            System.out.println("--------computer wins-------");
        }
        else if(uchoice==scissors && pc==paper){
            System.out.println("---------user wins---------");
        }
    }

    @Override
    public String toString() {
        return "roke_paper_scissor []";
    }
    }
    
     

