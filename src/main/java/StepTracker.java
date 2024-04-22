import java.util.ArrayList;
public class StepTracker
{
 private int activeNum;
 private int days;
 private int activeDays;
 private double mySteps;

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
  return mySteps/days;
 }
} 
