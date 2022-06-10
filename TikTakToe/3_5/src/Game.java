public class Game {
    String fields;
    char[][] area = new char[3][3];
    public Game(String fields){
        this.fields = fields;
        toArray();
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

    public void showResult() {
        if (isWinner('X') && isWinner('O') || isMoreXorY()) {
            System.out.println("Impossible");
        } else if (isWinner('X')) {
            System.out.println("X wins");
        } else if (isWinner('O')) {
            System.out.println("O wins");
        } else if (GameNotFinished()) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }

    }

}
