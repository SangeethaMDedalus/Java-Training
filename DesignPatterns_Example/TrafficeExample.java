package Traffic;


interface TrafficSignalState {
    void SignalOn(Signal signal);
    void SignalOff(Signal signal);
}

class Signal {
    private TrafficSignalState state;
    
    public Signal() {
        state = new OffState();
    }
    
    public void settrafficState(TrafficSignalState state) {
        this.state = state;
    }
    
    public void SignalOn() {
        state.SignalOn(this);
    }
    
    public void SignalOff() {
        state.SignalOff(this);
    }
}

class OnnState implements TrafficSignalState {
    @Override
    public void SignalOn(Signal signal) {
        System.out.println("Red Signal - Drive On-Hold");
    }
    
    @Override
    public void SignalOff(Signal signal) {
        System.out.println("Green Signal - Drive On");
        signal.settrafficState(new OffState());
    }
}

class OffState implements TrafficSignalState {
    @Override
    public void SignalOn(Signal signal) {
        System.out.println("Red Signal Drive On-Hold");
        signal.settrafficState(new OnnState());
    }
    
    @Override
    public void SignalOff(Signal signal) {
        System.out.println("Green Signal - Drive On");
    }
}

public class TrafficeExample {
    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.SignalOn();
        signal.SignalOff();
        signal.SignalOn();
        signal.SignalOff();
    }
}
