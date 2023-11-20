package josevicente;
import java.sql.*;

public class JoseVicente {
    private static final String url = "jdbc:mysql://localhost:3306/euromillones";
    private static final String usuario = "euromillones";
    private static final String contraseña = "euromillones";
    
    public static void main(String[] args) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,usuario,contraseña);
            Statement statement =  connection.createStatement();
            String sqlQuery = "";
           
            
             ////// Numero 1
            sqlQuery = "SELECT COUNT(n1) AS cantidad, n1 AS numero FROM euromillones GROUP BY n1 ORDER BY COUNT(n1) DESC LIMIT 1;";
            ResultSet resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar al numero " + numero + ", ya que ha salido " + cantidad +" veces en la casilla 1");
            }
           
             ////// Numero 2
            sqlQuery = "SELECT COUNT(n2) AS cantidad, n2 AS numero FROM euromillones GROUP BY n2 ORDER BY COUNT(n2) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar al numero " + numero + ", ya que ha salido " + cantidad +" veces en la casilla 2");
                 
            }
            
            ////// Numero 3
            sqlQuery = "SELECT COUNT(n3) AS cantidad, n3 AS numero FROM euromillones GROUP BY n3 ORDER BY COUNT(n3) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar al numero " + numero + ", ya que ha salido " + cantidad +" veces en la casilla 3");
            }
            
            ////// Numero 4
            sqlQuery = "SELECT COUNT(n4) AS cantidad, n4 AS numero FROM euromillones GROUP BY n4 ORDER BY COUNT(n4) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar al numero " + numero + ", ya que ha salido " + cantidad +" veces en la casilla 4");
            }
            
            ////// Numero 5
            sqlQuery = "SELECT COUNT(n5) AS cantidad, n5 AS numero FROM euromillones GROUP BY n5 ORDER BY COUNT(n5) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar al numero " + numero + ", ya que ha salido " + cantidad +" veces en la casilla 5");
            }
            
            ////// e1
            sqlQuery = "SELECT COUNT(e1) AS cantidad, e1 AS numero FROM euromillones GROUP BY e1 ORDER BY COUNT(e1) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                 System.out.println("Para ganar en los euromillones debes jugar a la estrella " + numero + ", ya que ha salido " + cantidad +" veces");
            }
            
            ////// e2
            sqlQuery = "SELECT COUNT(e2) AS cantidad, e2 AS numero FROM euromillones GROUP BY e2 ORDER BY COUNT(e2) DESC LIMIT 1;";
            resultSet = statement.executeQuery(sqlQuery); 
            while(resultSet.next()){
                int cantidad = resultSet.getInt("cantidad");
                int numero = resultSet.getInt("numero");
                System.out.println("Para ganar en los euromillones debes jugar a la estrella " + numero + ", ya que ha salido " + cantidad +" veces");
            }
            
            
            
            resultSet.close();
            statement.close();
            connection.close();
         }catch (SQLException | ClassNotFoundException e) { 
             e.printStackTrace();
         }  
                
         }     
       
    }
    

