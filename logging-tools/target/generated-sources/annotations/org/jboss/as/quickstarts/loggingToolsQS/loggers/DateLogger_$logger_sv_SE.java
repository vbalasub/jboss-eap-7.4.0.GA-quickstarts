package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2022-04-25T14:42:09-0500")
public class DateLogger_$logger_sv_SE extends DateLogger_$logger_sv implements DateLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DateLogger_$logger_sv_SE(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("sv", "SE");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String logStringCouldntParseAsDate$str() {
        return "GTRDATES000003: giltigt datum skickas som sträng: %s.";
    }
    @Override
    protected String logDaysUntilRequest$str() {
        return "GTRDATES000004: Begärt antal dagar tills '%s'";
    }
}