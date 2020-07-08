package ca.ibodrov.concord.plugins.helloworld;

import com.walmartlabs.concord.sdk.Context;
import com.walmartlabs.concord.sdk.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named("helloWorld")
public class HelloWorldTask implements Task {

    private final Logger log = LoggerFactory.getLogger(HelloWorldTask.class);

    @Override
    public void execute(Context ctx) throws Exception {
        log.info("Hello, {}!", ctx.getVariable("name"));
    }
}
