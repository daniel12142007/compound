package org.example.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Util {
    private static final SessionFactory connection;

    static {
        connection = new Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                //url
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
                //password
                .setProperty(Environment.USER, "postgres")
                //username
                .setProperty(Environment.PASS, "root")
                //format sql
                .setProperty(Environment.HBM2DDL_AUTO, "create")
                //show sql message
                .setProperty(Environment.SHOW_SQL, "true")
                //dialect
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .buildSessionFactory();
    }

    public static SessionFactory getConnection() {
        return connection;
    }
}
