package ss4_class_oop.bai_tap;

public class StopWatch {
    private long startTime, endTime;
     public StopWatch() {
         this.startTime = System.currentTimeMillis();
     }
     public void start() {
         this.startTime = System.currentTimeMillis();
     }
     public void stop() {
         this.endTime = System.currentTimeMillis();
     }
     public long getElapsedTime() {
         return endTime - startTime;
     }
}
