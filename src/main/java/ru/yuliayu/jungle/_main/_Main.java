package ru.yuliayu.jungle._main;

import ru.yuliayu.jungle.entity.Jaguar;
import ru.yuliayu.jungle.until.EventProducer;

public class _Main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar();
        EventProducer event = new EventProducer();

        event.activeEvent(jaguar);
    }
}
