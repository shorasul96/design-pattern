package uz.reem.abstractFactoryPattern;

import uz.reem.abstractFactoryPattern.services.DataBaseConnection;
import uz.reem.abstractFactoryPattern.services.VisaConnection;
import uz.reem.abstractFactoryPattern.services.impl.DataBaseConnectionClient;
import uz.reem.abstractFactoryPattern.services.impl.DataBaseDataBaseConnectionFactory;
import uz.reem.abstractFactoryPattern.services.impl.VisaCardConnectionClient;
import uz.reem.abstractFactoryPattern.services.impl.VisaCardConnectionFactory;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        DataBaseConnection connection = new DataBaseDataBaseConnectionFactory();
        DataBaseConnectionClient client = new DataBaseConnectionClient(connection);

        System.out.println(client.getPsqlConnection());
        System.out.println(client.getMongoDBConnection());
        System.out.println(client.getClientConnection() + "\n\n");


        VisaConnection visaConnection = new VisaCardConnectionFactory();
        VisaCardConnectionClient visaClient  = new VisaCardConnectionClient(visaConnection);

        System.out.println(visaClient.getVisaCardConnection());
        System.out.println(visaClient.getAloqaBackConnection());


    }
}
