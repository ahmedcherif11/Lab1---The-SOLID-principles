// Classe TimedDoor implémente Door, Lockable, Operable, et TimeoutCallback
class TimedDoor extends Door implements Lockable, Operable, TimeoutCallback {
    private boolean _locked;
    private boolean _opened;
    private Timer timer;

    public TimedDoor(Timer timer) {
        this.timer = timer;
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
    public void timeOutCallback() {
        close();
        System.out.println("Door is closed after timeout");
    }
}
