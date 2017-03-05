import tme3.*;

   class Bell extends Event {
	public static Controller c = new Controller(); 
       int rings = 1;
        long eventTime;
        public Bell(long delayTime, int rings){ 
            super(delayTime);
            this.rings = rings;
	      for(int i=1; i<rings; i++){
 c.addEvent(new Bell(delayTime+(2000*i),0));
            }

        }
        public void action() {
	}
        @Override 
        public String toString() { 
            return "Bing!"; 
        }
    }
