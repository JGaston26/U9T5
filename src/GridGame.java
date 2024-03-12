import java.util.Scanner;

public class GridGame {
    private Space[][] board;
    private Player player;
    private Scanner scanner;

    public GridGame() {
        scanner = new Scanner(System.in);
        createPlayer();
        setupBoard();
        play();
    }

    private void createPlayer() {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);
    }

    // initialize the board instance variable to be a 8x8 board;
    // place new Space object with "_" as the symbol into each board position;
    // place the Player object at lower left corner;
    // initialize and place a Goal object with the symbol "X" in the upper right corner;
    // create several Treasure objects (up to you how many), with symbol of your choice,
    // each with a point value that you decide, and place them throughout the board
    private void setupBoard() {
      board = new Space[8][8];
      for(int r = 0; r < board.length; r++){
          for(int c = 0; c < board[0].length; c++){
              Space space = new Space("_");
              board[r][c] = space;
          }
      }
      board[7][0] = new Space(player.getSymbol());
      Treasure treasure1 = new Treasure("@",69);
      Treasure treasure2 = new Treasure("@",45);
      Treasure treasure3 = new Treasure("@",30);
      Treasure treasure4 = new Treasure("@",25);
      Treasure treasure5 = new Treasure("@",50);

      board[(int) (Math.random() * 8)][(int) (Math.random() * 8)] = treasure1;
      board[(int) (Math.random() * 8)][(int) (Math.random() * 8)] = treasure2;
      board[(int) (Math.random() * 8)][(int) (Math.random() * 8)] = treasure3;
      board[(int) (Math.random() * 8)][(int) (Math.random() * 8)] = treasure4;
      board[(int) (Math.random() * 8)][(int) (Math.random() * 8)] = treasure5;

      Goal goal = new Goal("X");
      board[0][7] = new Space(goal.getSymbol());
    }

    /* prints the 2D array board, showing the symbol for each Space, e.g.
       _______X
       __#_____
       _____#__
       _#______
       ________
       ______#_
       ________
       M___#___
     */
    public void printBoard() {
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                System.out.print(board[r][c].getSymbol());
            }
            System.out.println(" ");
        }
    }

    // plays the game;
    private void play() {
        createPlayer();
        while(board[0][7] != player){
            printBoard();
            System.out.print("Enter in a direction(W,A,S,D/up,left,down,right)");
            String ask = scanner.nextLine();
            if()
        }
        // WRITE THIS METHOD
        // main game loop:
        // while the player has not yet reached the goal, print the board (complete can call helper method below)
        // then asks user to enter a direction: W, A, S, D (up, left, down, right).
        // if the intended direction is in bounds, move the Player to the new location and fill previous position
        // with a Space object (with "_" symbol).
        // if player moves to a position occupied by a Treasure, add its point value to the players score,
        // and replace that element with a Space object (with "_" symbol).
        // if the player reaches the goal, end the game and print their final score and the number of moves it took



    }
}