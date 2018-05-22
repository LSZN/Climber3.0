package com.hlxx.climber.secondpage.records;

import java.io.Serializable;
import java.util.ArrayList;

public class Records implements Serializable {
    static final long serialVersionUID = 2L;
    private int times;
    private int finishTimes;
    private int[] time = new int [2];
    private ArrayList<Record> theRecord;

    public void setFinishTimes(int finishTimes) {
        this.finishTimes = finishTimes;
    }

    public int getTimes() {
        return times;
    }

    public ArrayList<Record> getTheRecord() {
        return theRecord;
    }

    public Records() {
        this.theRecord = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder aStringBuilder = new StringBuilder();
        for (Record aRecord : theRecord) {
            aStringBuilder.append(aRecord).append("\n");
        }
        return "Records{" + "times=" + times + ", finishTimes=" + finishTimes +
                ",\n theRecord:" + aStringBuilder + '}';
    }

    public void setTime(int[] time) {
        this.time = time;
        times = time[0];
        finishTimes = time[1];
    }

    public void addRecord(Record newRecord) {
        this.theRecord.add(newRecord);
    }

    public int getFinishTimes() {
        return finishTimes;
    }
}
