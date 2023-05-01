import java.sql.*;

public class SQLiteExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Carrega a classe do driver JDBC do SQLite
            Class.forName("org.sqlite.JDBC");

            // Conecta ao banco de dados embutido
            conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");

            // Cria uma tabela chamada "users"
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS users " +
                         "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         " name TEXT NOT NULL, " +
                         " email TEXT NOT NULL)";
            stmt.executeUpdate(sql);

            // Insere alguns dados na tabela "users"
            sql = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO users (name, email) VALUES ('Jane Doe', 'jane@example.com')";
            stmt.executeUpdate(sql);

            // Recupera os dados da tabela "users"
            sql = "SELECT id, name, email FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID = " + id + ", Name = " + name + ", Email = " + email);
            }

            // Fecha a conexão com o banco de dados
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
