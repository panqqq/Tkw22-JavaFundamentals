import java.util.Scanner;

public class Game {
    String fields;
    char[][] area = new char[3][3];
    public Game(String fields){
        this.fields = fields;
        toArray();
        ShowGame();
        play();
    }

    private void toArray() {
        int ord = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                area[i][j] = fields.charAt(ord);
                ord++;
            }

        }
    }
    public void ShowGame() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();

        }
        System.out.println("---------");
    }
    public boolean isWinner(char sym) {
        // [0,0] [0,1] [0,2]
        // [1,0] [1,1] [1,2]
        // [2,0] [2,1] [2,2]
        if (
                area[0][0] == sym && area[0][1] == sym && area[0][2] == sym
                        || area[1][0] == sym && area[1][1] == sym && area[1][2] == sym
                        || area[2][0] == sym && area[2][1] == sym && area[2][2] == sym
                        || area[0][0] == sym && area[1][0] == sym && area[2][0] == sym
                        || area[0][1] == sym && area[1][1] == sym && area[2][1] == sym
                        || area[0][2] == sym && area[1][2] == sym && area[2][2] == sym
                        || area[0][0] == sym && area[1][1] == sym && area[2][2] == sym
                        || area[0][2] == sym && area[1][1] == sym && area[0][2] == sym) {
            return true;
        }

        return false;
    }

    public boolean GameNotFinished() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(area[i][j]=='_') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMoreXorY() {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (area[i][j]=='X') {
                    countX++;
                } else if (area[i][j]=='O') {
                    countY++;
                }
            }
        }
        if (Math.abs(countX-countY) > 1) {
            return true;
        }
        return false;
    }

    public boolean showResult() {
        if (isWinner('X') && isWinner('O') || isMoreXorY()) {
            System.out.println("Impossible");
            return true;
        } else if (isWinner('X')) {
            System.out.println("X wins");
            return true;
        } else if (isWinner('O')) {
            System.out.println("O wins");
            return true;
        } else if (!GameNotFinished()) {
            System.out.println("Draw");
            return true;
        }
        return false;

    }
    public boolean isDigits(char first, char second) {
        if(Character.isDigit(first) && Character.isDigit(second)) {
            return true;
        }
        System.out.println("You should enter numbers!");
        return false;
    }
    public boolean isCoordinatesInRange(char first, char second) {
        if((first == '1' || first == '2' || first == '3')
            && (second == '1' || second == '2' || second == '3')
        ) {
            return true;
        }
        System.out.println("Coordinates should be from 1 to 3!");
        return false;
    }
    public boolean isCellEmpty(char first, char second) {
        if (isCoordinatesInRange(first,second)) {
            if (area[Character.getNumericValue(first) - 1][Character.getNumericValue(second) - 1] == '_') {
                return true;
            }
        }
        System.out.println("This cell is occupied! Choose another one!");
        return false;
    }
    public boolean meetsRequirements(char symbol) {
        boolean res = false;
        char pos1 = 'A';
        char pos2 = 'A';
        while(!res) {
            Scanner sc = new Scanner(System.in);
            System.out.println(symbol + " player, please enter the coordinates: ");
            pos1 = sc.next().charAt(0);
            pos2 = sc.next().charAt(0);
            if(isDigits(pos1,pos2) && isCoordinatesInRange(pos1,pos2)) {
                res = isCellEmpty(pos1, pos2);
            }
        }
        updateGrid(pos1, pos2, symbol);
        ShowGame();
        return res;

    }

    private void updateGrid(char first, char second, char symbol) {
        area[Character.getNumericValue(first)-1][Character.getNumericValue(second)-1] = symbol;
    }
    
    public void play() {
        char symbol = 'A';
        for (int i = 0; i < 9; i++) {
            if (i%2==0) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }
            meetsRequirements(symbol);
            if(showResult()) {
                break;
            };
        }
    }

}
