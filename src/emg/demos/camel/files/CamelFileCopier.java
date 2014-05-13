package emg.demos.camel.files;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by edison on 5/13/14.
 */
public class CamelFileCopier {
    public CamelFileCopier () {

    }

    public void CopyFile () throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:out/Inbox?noop=true").to("file:out/Outbox");
            }
        });
        context.start();
        Thread.sleep(10000);
        context.stop();
    }
}
