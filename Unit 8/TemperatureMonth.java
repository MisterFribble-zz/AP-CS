public class TemperatureMonth{

  private double[][] temperatures;

  public TemperatureMonth(double[][] t){
    temperatures = t;
  }

  public double getMaxTemp(){
    // Remove return and implement getMaxTemp method here
    double max = temperatures[0][0];
    for (double[] week : temperatures) {
      for (double d : week) {
        if (d > max) {
          max = d;
        }
      }
    }
    return max;
  }

  public double getMinTemp(){
    // Remove return and implement getMinTemp method here
    double min = temperatures[0][0];
    for (double[] week : temperatures) {
      for (double d : week) {
        if (d < min) {
          min = d;
        }
      }
    }
    return min;
  }

  public double getMonthlyAverage(){
    // Remove return and implement getMonthlyAverage method here
    double sum = 0;
    int count = 0;
    for (double[] ds : temperatures) {
      for (double d : ds) {
        sum += d;
        count++;
      }
    }
    return sum / count;
  }

  public double[] getWeeklyAverages(){
    // Remove return and implement getWeeklyAverages method here
    double[] weekAvg = new double[temperatures.length];
    for (int i = 0; i < temperatures.length; i++) {
      double sum = 0;
      for (double j : temperatures[i]) {
        sum += j;
      }
      weekAvg[i] = sum / temperatures[i].length;
    }
    return weekAvg;
  }

}
