import java.sql.*;
public class myConnection {
    public Connection conn;
    public Connection getConnection()
    {   try{
        String dbpath="jdbc:mysql://localhost/library";
         conn=DriverManager.getConnection(dbpath,"root","");
    }
    catch(SQLException e)
    {System.out.print(e.getMessage());
    
    }
    return conn;
}
}
