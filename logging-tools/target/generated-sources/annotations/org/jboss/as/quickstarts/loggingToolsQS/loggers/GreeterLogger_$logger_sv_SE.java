package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2022-07-01T15:35:00-0500")
public class GreeterLogger_$logger_sv_SE extends GreeterLogger_$logger_sv implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public GreeterLogger_$logger_sv_SE(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("sv", "SE");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String logHelloMessageSent$str() {
        return "GREETER000001: Hej meddelande som skickas.";
    }
    @Override
    protected String logHelloMessageSentForLocale$str() {
        return "GREETER000002: Hej meddelande skickas till locale: %s.";
    }
}
