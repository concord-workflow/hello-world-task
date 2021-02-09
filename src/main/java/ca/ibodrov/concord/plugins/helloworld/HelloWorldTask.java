package ca.ibodrov.concord.plugins.helloworld;

import com.walmartlabs.concord.runtime.v2.sdk.Task;
import com.walmartlabs.concord.runtime.v2.sdk.TaskResult;
import com.walmartlabs.concord.runtime.v2.sdk.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named("helloWorld")
public class HelloWorldTask
        implements Task
{
    private final Logger log = LoggerFactory.getLogger(HelloWorldTask.class);

    @Override
    public TaskResult execute(Variables input)
            throws Exception
    {
        log.info("Hello, {}!", input.assertString("name"));
        return TaskResult.success();
    }
}
