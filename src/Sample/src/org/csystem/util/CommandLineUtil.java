package org.csystem.util;

import java.util.Scanner;

public final class CommandLineUtil {
    private CommandLineUtil()
    {
    }

    public static String [] getArguments(String [] args, String prompt, Scanner kb)
    {
        if (args.length != 0)
            return args;

        System.out.print(prompt);
        args = new String[1];
        args[0] = kb.nextLine();

        return args;
    }
}
