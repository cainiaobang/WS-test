package soap_jaxws;


import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {
    public String say(String name){
        return "hello"+name;
    }
}
