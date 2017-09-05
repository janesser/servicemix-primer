package de.esserjan.edu.servicemix.primer;

import java.util.Locale;
import java.util.logging.Logger;

public class UpperCaseConverter {

    private static final Logger LOGGER = Logger.getLogger(UpperCaseConverter.class.getSimpleName());

    Locale locale;

    public String transform(String input) {
        final String output = input != null //
                ? input.toLowerCase(locale) //
                : "";

        LOGGER.info(String.format("transform input: %s output: %s", input, output));

        return output;
    }

}
