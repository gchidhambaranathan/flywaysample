package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class V1_1__InsertOneMore implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        PreparedStatement statement =
                connection.prepareStatement("INSERT INTO `book` VALUES (3,'Varada','Spring');");

        try {
            statement.execute();
        } finally {
            statement.close();
        }
    }
}
