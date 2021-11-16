module AppDB {
    requires jakarta.persistence;
    requires org.eclipse.persistence.jpa;

    opens com.sau.appdb;
    exports com.sau.appdb;
}