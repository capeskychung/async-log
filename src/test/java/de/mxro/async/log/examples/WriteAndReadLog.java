package de.mxro.async.log.examples;

import de.mxro.async.log.jre.Logs;
import de.mxro.async.log.values.StringLog;
import de.mxro.async.properties.PropertyNode;

public class WriteAndReadLog {

    public static void main(final String[] args) {

        final PropertyNode logs = Logs.create();

        logs.record(Logs.entry("log1", "entry 1"));
        logs.record(Logs.entry("log1", "entry 2"));

        final String log1 = logs.retrieve("log1", StringLog.class).get().toString();

        System.out.println(log1);

        logs.stop().get();

    }

}
