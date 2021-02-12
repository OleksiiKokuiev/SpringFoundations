package rmi.server;

import rmi.common.Greeter;

public class RomanianGreeter implements Greeter {
    @Override
    public String getGreeting() {
        return "Hello moto";
    }
}
