package org.mapfish.print.cli;

import com.sampullara.cli.Argument;

/**
 * The CLI API definition.
 */
public final class CliDefinition extends CliHelpDefinition {
    CliDefinition() {
        // this is intentionally empty
    }

    // CHECKSTYLE:OFF
    @Argument(description = "Filename for the configuration (templates&CO)", required = true)
    public String config = null;

    @Argument(description = "The location of the description of what has to be printed. By default, STDIN")
    public String spec = null;

    @Argument(description = "Used only if log4jConfig is not specified. 3 if you want everything, " +
                            "2 if you want the debug information (stacktraces are shown), 1 for infos and 0 for only warnings and errors")
    public String verbose = "1";

    @Argument(description = "The destination file. By default, Standard Out")
    public String output = null;

    @Argument(description = "Get the config for the client form. Doesn't generate a PDF")
    public boolean clientConfig = false;

    @Argument(description = "Spring configuration file to use in addition to the default.  This allows overriding certain values if " +
                            "desired")
    public String springConfig = null;

    @Argument(description = "If true then request data (spec) is in a old api request data (Mapfish v2 compatible).", alias = "v2")
    public boolean v2Api = false;
}
