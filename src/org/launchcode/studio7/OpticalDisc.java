package org.launchcode.studio7;

public interface OpticalDisc {
     static final double DVDSTORAGECAPACITY = 4.7; //gb
     static final double CDSTORAGECAPACITY = 0.783;

     void spinDisc();
     void storeData();
     void writeData();
     void readData();
}
