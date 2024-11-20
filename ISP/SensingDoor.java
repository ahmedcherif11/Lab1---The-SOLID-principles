// Classe SensingDoor implémente Door, Lockable, Operable, et ProximityCallback
class SensingDoor extends Door implements Lockable, Operable, ProximityCallback {
    private boolean _locked;
    private boolean _opened;
    private Sensor sensor;

    public SensingDoor(Sensor sensor) {
        this.sensor = sensor;
        this._locked = false;
        this._opened = false;
    }

    @Override
    public void lock() {
        _locked = true;
        System.out.println("Door is locked");
    }

    @Override
    public void unlock() {
        _locked = false;
        System.out.println("Door is unlocked");
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
            System.out.println("Door is opened");
        } else {
            System.out.println("Cannot open, door is locked");
        }
    }

    @Override
    public void close() {
        _opened = false;
        System.out.println("Door is closed");
    }

    @Override
    public void proximityCallback() {
        if (sensor.isPersonClose()) {
            open();
        }
    }
}
