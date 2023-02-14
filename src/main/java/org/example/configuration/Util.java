package org.example.configuration;

import org.example.repo.metods.model.Company;
import org.example.repo.metods.model.Course;
import org.example.repo.metods.model.Prezident;
import org.example.repo.metods.model.Student;
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
                .addAnnotatedClass(Company.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Prezident.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }
    public static SessionFactory getConnection() {
        return connection;
    }
}
