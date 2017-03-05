/*
import tme3.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class Restart extends Event {
	private String eventsFile = "examples1.txt";
        public Restart(long delayTime, String filename)
        throws IOException{
            super(delayTime);
            eventsFile = filename;
        }

       //adds events
        public void action(){
            //add a malfunction event
           // addEvent(new WindowMalfunction(5000));   
             addEvent(new PowerOut(5000));
            try{
                //reads from 'examples' text files.          
                Scanner sc = new Scanner(new FileReader(eventsFile));
                Pattern num = Pattern.compile("\\d+");
                //loops through each line in file
                while (sc.hasNext()) {
                    String temp = sc.next();
                    Matcher matcher = num.matcher(temp);
                    //gets delay time from file for thermostatnight, converts
                    // string to long and adds it as parameter for thermostat delay
                    if(temp.contains("ThermostatNight")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new ThermostatNight(dLay));
                    }
                    //gets delay time from file for lightOn, converts
                    // string to long and adds it as parameter for lightOn delay
                    if(temp.contains("LightOn")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new LightOn(dLay));
                    }
                    //gets delay time from file for waterOff, converts
                    // string to long and adds it as parameter for waterOff delay
                    if(temp.contains("WaterOff")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new WaterOff(dLay));
                    }


                    //gets delay time from file for ThermostatDay, converts
                    // string to long and adds it as parameter for ThermostatDay delay
                    if(temp.contains("ThermostatDay")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new ThermostatDay(dLay));
                    }
                    //gets delay time and number of rings from file for Bell, 
                    //converts strings to long and adds it as parameter for Bell 
                    //delay and number of rings
                    if(temp.contains("Bell")){
                        long dLay = 0;
                        long nRings = 0;
                        int count = 1;
                        while(matcher.find()){
                            String inNum = matcher.group();
                            nRings = Long.parseLong(inNum);
                                while(count == 1){
                                dLay = Long.parseLong(inNum);
                                count++;
                            }
                        }

                        if(dLay == nRings)
                            nRings = 1;
                        addEvent(new Bell(dLay,(int)nRings));
                    }
                    //gets delay time from file for WaterOn, converts string
                    // to long and adds it as parameter for delayTime.
                    if(temp.contains("WaterOn")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new WaterOn(dLay));
                    }

                    //gets delay time from file for LightOff, converts string
                    //to long and adds it as parameter for delayTime.
                    if(temp.contains("LightOff")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new LightOff(dLay));
                    }
                    //gets delay time from file for Terminate, converts string
                    //to long and adds it as parameter for delayTime.
                    if(temp.contains("Terminate")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new Terminate(dLay));
                    }
                    //gets delay time from file for FansOn, converts string
                    //to long and adds it as parameter for delayTime.
                    if(temp.contains("FansOn")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new FansOn(dLay));
                    }
                    //gets delay time from file for FansOff, converts string
                    //to long and adds it as parameter for delayTime.
                    if(temp.contains("FansOff")){
                        matcher.find();
                        String inNum = matcher.group();
                        long dLay = Long.parseLong(inNum);
                        addEvent(new FansOff(dLay));
                    }
                }//end while
                sc.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }//end action method
        @Override
        public String toString() {
            return "Restarting system";
        }
    }//end restart class
*/
