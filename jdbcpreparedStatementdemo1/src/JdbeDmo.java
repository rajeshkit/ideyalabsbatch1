import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class JdbeDmo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        addBook();
        //JdbeDmo.getBookById(234);
        //JdbeDmo.getAllBooks();


    }

    private static void getAllBooks() throws SQLException {
        Statement stmt = DBConnectionUtil.createConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM book");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + rs.getInt("price"));
        }
    }
    public static void getBookById(int bookId) throws SQLException {
        Statement stmt=DBConnectionUtil.createConnection().createStatement();

        ResultSet rs=stmt.executeQuery("SELECT * FROM book where bookid="+bookId+"");
        if(rs.next()){
            System.out.println(rs.getInt("bookid"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("price"));
        }
    }
    public static void addBook() {
        int status=0;
        try {
          //  connection = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt=DBConnectionUtil.createConnection()
                    .prepareStatement("INSERT INTO book VALUES(?,?,?)");
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the book Id");
            int bookId=s.nextInt();
            s.nextLine();
            System.out.println("Enter the book name");
            String bookName=s.nextLine();
            System.out.println("Enter the cost");
            int bookCost=s.nextInt();

            pstmt.setInt(1,bookId);
            pstmt.setString(2,bookName);
            pstmt.setInt(3,bookCost);

            status = pstmt.executeUpdate();
            if(status!=0){
                System.out.println("Book added successfully");
            }
        } catch (SQLException e) {
            System.out.println(status);
            System.out.println("Book added unsuccessfull"+e.getMessage());
        }
    }


}
