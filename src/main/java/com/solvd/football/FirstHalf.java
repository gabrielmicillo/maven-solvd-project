package com.solvd.football;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FirstHalf extends Thread {

    private static Logger LOGGER = LogManager.getLogger(FirstHalf.class);
    private Object homeCoachInstruction;
    private Object awayCoachInstruction;

    public FirstHalf(Object homeCoachInstruction, Object awayCoachInstruction){
        this.homeCoachInstruction = homeCoachInstruction;
        this.awayCoachInstruction = awayCoachInstruction;
    }

    @Override
    public void run() {
        synchronized (homeCoachInstruction) {
            try {
                LOGGER.info("Home coach gave instructions for his team, now the away coach must do the same.");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (awayCoachInstruction) {
                LOGGER.info("Both coaches gave instructions for their teams.");
            }
        }
    }
}
