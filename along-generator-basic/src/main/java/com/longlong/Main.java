package com.longlong;

import com.longlong.cli.CommandExecutor;

/**
 * @author longlong
 */
public class Main {

    public static void main(String[] args) {
//        args= new String[]{"generate","-o","-l","-a"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
