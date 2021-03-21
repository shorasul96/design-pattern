package uz.reem.abstractFactoryPattern.services.impl;

import lombok.Data;
import uz.reem.abstractFactoryPattern.providers.AloqaBankCardProvider;
import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;
import uz.reem.abstractFactoryPattern.services.VisaConnection;

@Data
public class VisaCardConnectionClient {

    private VisaCardProvider visaCardProvider;
    private AloqaBankCardProvider aloqaBankCardProvider;

    public VisaCardConnectionClient(VisaConnection connection){
        visaCardProvider = connection.getVisaCardConnection();
        aloqaBankCardProvider = connection.getAloqaBankConnection();
    }

    public String getVisaCardConnection(){
        return visaCardProvider.getVisaCardConnection();
    }

    public String getAloqaBackConnection(){
        return aloqaBankCardProvider.getAloqaBackConnection();
    }
}
