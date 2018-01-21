package demo.ws.soap_jaxws;


import javax.jws.WebService;

@WebService(
        serviceName="HelloService",
        portName = "HelloServicePort",
        endpointInterface = "demo.ws.soap_jaxws.HelloService"
)
public class HelloServiceImpl implements HelloService {
    public String say(String name){
        return "hello"+name;
    }
}
