package demo.ws.soap_cxf;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class JaxWsClient {


    public static void main(String[] args){
        DynamicClientFactory factory=DynamicClientFactory.newInstance();
        Client client=factory.createClient("http://localhost:8080/Spring-CXF-WS-Test/ws/soap/hello?wsdl");
        try{
            Object[] results=client.invoke("say","world");
            System.out.println(results[0]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
