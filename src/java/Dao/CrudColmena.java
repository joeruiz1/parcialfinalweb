/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.DbUtil;
import VO.RegistroMiel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fernando stiven
 */
public class CrudColmena {


   

        private Connection connection;

        public CrudColmena() {
            connection = DbUtil.getConnection();
        }

        public void agregarColmena(RegistroMiel RM) {
            try {
                PreparedStatement preparedStatement = connection
                        .prepareStatement("insert into Libro(fecha,recolector,idColmena,KilosMiel) values (?, ?, ?, ? )");
                // Parameters start with 1
                preparedStatement.setString(1, RM.getFecha());
                preparedStatement.setString(2, RM.getRecolector());
                preparedStatement.setInt(3, RM.getIdColmena());
                preparedStatement.setInt(4, RM.getKilosMiel());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    
    



