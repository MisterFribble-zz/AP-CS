public boolean simulate() {
  int position = 0;
  for (int i = 0; i < maxHops; i++) {
    position += hopDistance();
    if (position >= goalDistance) {
      return true;
    }
    if (position < 0) {
      return false;
    }
  }
  return false;
}

public double runSimulations(int n) {
  double count = 0;
  for (int i = 0; i < n; i++) {
    if (simulate()) {
      count++;
    }
  }
  return count / n;
}
