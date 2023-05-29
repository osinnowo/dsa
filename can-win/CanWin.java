class CanWin {
    public boolean canWinNim(int n) {
        // The player who starts with a multiple of 4 stones will always lose the game.
        // If the number of stones is not a multiple of 4, the player can win.
        return n % 4 != 0;
    }
}
