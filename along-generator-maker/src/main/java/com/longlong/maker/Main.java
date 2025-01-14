package com.longlong.maker;

import com.longlong.maker.cli.CommandExecutor;

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
