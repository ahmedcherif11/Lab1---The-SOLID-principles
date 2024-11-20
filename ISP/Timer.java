// Classe Timer qui est utilisée dans TimedDoor
class Timer implements TimeoutCallback {
    private long timeOut;
    private TimedDoor door;

    public void register(long timeOut, TimedDoor door) {
        this.timeOut = timeOut;
        this.door = door;
    }

    @Override
    public void timeOutCallback() {
        door.timeOutCallback();
    }
}
