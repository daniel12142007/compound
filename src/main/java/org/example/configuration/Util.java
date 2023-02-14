package org.example.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Util {
    private static final SessionFactory connection;

    static {
        connection = new Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:8729/postgres")
                .setProperty(Environment.USER, "postgres")
                .setProperty(Environment.PASS, "Backflip44+")
                .setProperty(Environment.HBM2DDL_AUTO, "create")
                .setProperty(Environment.SHOW_SQL, "true")
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .buildSessionFactory();
    }

    public static SessionFactory getConnection() {
        return connection;
    }
}
