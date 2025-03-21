package problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;

}
//Interfaces are great for keeping concerns for the back and front ends separate.
//If you do not use them anywhere else, this is a great place to start.