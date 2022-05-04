package com.solvd.football;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondHalf extends Thread {
    private static Logger LOGGER = LogManager.getLogger(SecondHalf.class);
    private Object homeCoachInstruction;
    private Object awayCoachInstruction;

    public SecondHalf(Object homeCoachInstruction, Object awayCoachInstruction){
        this.homeCoachInstruction = homeCoachInstruction;
        this.awayCoachInstruction = awayCoachInstruction;
    }

    @Override
    public void run() {
        synchronized (awayCoachInstruction) {
            try {
                LOGGER.info("Away coach gave instructions for his team, now the home coach must do the same.");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (homeCoachInstruction) {
                LOGGER.info("Both coaches gave instructions for their teams.");
            }
        }
    }
}