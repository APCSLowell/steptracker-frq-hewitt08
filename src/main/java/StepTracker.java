import java.util.ArrayList;
public class StepTracker
{
 
 private int activeNum;
 private int days;
 private int activeDays;
 private int mySteps;

 StepTracker(int n){
  activeNum = n;
 }
 
 public void addDailySteps(int steps){
  days++;
  mySteps+=steps;
  if(steps>=activeNum){
   activeDays++;
  }
 }
 
 public int activeDays(){
  return activeDays;
 }
 
 public double averageSteps(){
  if(days==0){
   return 0.0;
  }
  return (double)mySteps/(double)days;
 }
 
} 
