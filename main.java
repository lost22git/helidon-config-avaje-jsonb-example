///usr/bin/env jbang "$0" "$@" ; exit $?

import static java.lang.System.*;
import io.helidon.config.Config;
import io.helidon.config.ConfigSources;
import model.Person;

//DEPS io.helidon.config:helidon-config:3.2.1
//DEPS io.helidon.config:helidon-config-hocon:3.2.1
//DEPS io.helidon.config:helidon-config-object-mapping:3.2.1
//SOURCES ./model/Person.java
//FILES ./application.conf
public class main {

    public static void main(String... args) {
        var config = Config.builder().build();

        var hasValue = config.hasValue();
        var exists = config.exists();
        var type = config.type();
        out.println("hasValue=>"+hasValue+",exists=>"+exists+",type=>"+type);

        var person = config.as(Person.class).get();
        out.println("person=>"+person);
    }
}
