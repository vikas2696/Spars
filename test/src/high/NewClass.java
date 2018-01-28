
package high;
import java.sql.*;


public class NewClass
{
    public static int highscr=0; 
    public static Statement st;
    public static Connection con;
    public NewClass()
        
    {
        try
            {
                int h;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3307/leaderboard","root","1234");
                st=con.createStatement();
                ResultSet rs=NewClass.st.executeQuery("select * from info");
                while(rs.next())
                {
                    h=rs.getInt("score");
                    if(h>highscr) highscr=h;
                }
            }
            catch(Exception q)
            {
                q.printStackTrace();
            }
    }
           
    
}
