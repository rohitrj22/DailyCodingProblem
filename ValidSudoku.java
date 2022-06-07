
import java.util.*;

public class ValidSudoku {

      
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> set = new HashSet<String>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    char num = board[i][j];
                    if(!set.add(num + " in row " + i) || !set.add(num + " in column " +j)||!set.add(num + " in " + i/3 + "-" + j/3))
                        {
                        System.out.println(set.size());
                        return false;}
                }
            }
        }
        
        return true;
    }
    
}
