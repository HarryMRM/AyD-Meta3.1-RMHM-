package uabc.mx;



public class DashBoard {
    SensorProxy sensorProxy;

    public DashBoard() {
        sensorProxy = new SensorProxy();
    }

    public void updateDisplay() {
        sensorProxy.updateData();
    }
}
