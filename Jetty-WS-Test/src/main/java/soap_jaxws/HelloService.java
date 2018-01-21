package soap_jaxws;

import javax.jws.WebService;

@WebService
public interface HelloService {
    String say(String name);
}
