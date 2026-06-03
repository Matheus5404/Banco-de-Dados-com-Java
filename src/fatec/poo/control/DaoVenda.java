
package fatec.poo.control;

import fatec.poo.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVenda {
    private Connection conn;

    public DaoVenda(Connection conn) {
        this.conn = conn;
    }
    
    public Venda consultar (int codigo){
        Venda objVen = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblVendas where Codigo_Vend = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objVen = new Venda(rs.getInt("Codigo_Vend"), rs.getString("Descricao_Vend"));
                objVen.setPrecUnit(rs.getDouble("PrecUnit_Vend"));
                objVen.setQtdeVendida(rs.getInt("QtdeVendida_Vend"));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return(objVen);
    }
    
    public void inserir(Venda objVen) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblVendas(Codigo_Vend, Descricao_Vend," + 
                                       "PrecUnit_Vend, QtdeVendida_Vend) VALUES(?,?,?,?)");
            ps.setInt(1, objVen.getCodigo());
            ps.setString(2, objVen.getDescricao());
            ps.setDouble(3, objVen.getPrecUnit());
            ps.setInt(4, objVen.getQtdeVendida());
            
            ps.execute();
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Venda venda) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblVendas set PrecUnit_Vend = ?, " + 
                                       "QtdeVendida_Vend = ?" + 
                                       "WHERE Codigo_Vend = ?");
            
            ps.setDouble(1, venda.getPrecUnit());
            ps.setInt(2, venda.getQtdeVendida());
            ps.setInt(3, venda.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Venda venda){
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblVendas where Codigo_Vend = ?");
            
            ps.setInt(1, venda.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
