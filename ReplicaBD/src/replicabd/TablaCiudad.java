
package replicabd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @soy_megh
 */
public class TablaCiudad extends Conexion{
 Connection conn;
    
    final String mostrarCiudad = "Select * from TablaCiudad";
    private PreparedStatement insertarRegistro;

    public TablaCiudad(){
        
       try {
           conn= this.obtenerConexion();
            insertarRegistro = conn.prepareStatement("insert into TablaCiudad(nombre_Ciudad, poblacion, extension) values(?, ?, ?)");
        } catch (SQLException ex) {
            Logger.getLogger(TablaCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public int registrarCiudad(String nombre, int poblacion, float extension){
        int result = 0;
        try {
            insertarRegistro.setString(1, nombre);
            insertarRegistro.setInt(2, poblacion);
            insertarRegistro.setFloat(3, extension);
            result = insertarRegistro.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TablaCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return result;
    }
    
    
    public void listarCiudad(){
        Connection conn = this.obtenerConexion();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(mostrarCiudad);
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numDeColumna = metaData.getColumnCount();
            
            System.out.println("Tabla Ciudad");
            for(int i =1; i <= numDeColumna; i++){
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                
            }
            System.out.println("");
            while (rs.next()){
                for(int i= 1; i<= numDeColumna; i++){
                    System.out.printf("%-8s \t", rs.getObject(i));
                    
                }
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablaCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}