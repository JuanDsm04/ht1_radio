public interface IRadio {
    public void saveStation(int buttonId, double station);
    public boolean isAM();
    public boolean  isOn();
    public double selectStation(int buttonId);
    public void switchOnOff();
    public void switchAMFM();
    public double nextStation();
}
