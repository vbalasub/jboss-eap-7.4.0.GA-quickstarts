package org.jboss.as.quickstarts.loggingToolsQS.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2022-07-01T15:35:00-0500")
public class GreetingMessagesBundle_$bundle_de extends GreetingMessagesBundle_$bundle implements GreetingMessagesBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreetingMessagesBundle_$bundle_de() {
        super();
    }
    public static final GreetingMessagesBundle_$bundle_de INSTANCE = new GreetingMessagesBundle_$bundle_de();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
