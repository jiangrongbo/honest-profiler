package com.insightfullogic.honest_profiler.delivery.console;

import org.junit.Test;

public class ConsoleEndToEndTest {

    private final ConsoleApplicationRunner runner = new ConsoleApplicationRunner();

    @Test
    public void displayProfile() {
        runner.loadLogFrom("log0.hpl");
        runner.displayContainsMethodOrClass("PrintStream.printf");
        runner.displayContainsMethodOrClass("PrintStream.append");
    }

}
