package ru.yuliayu.jungle.util;

import ru.yuliayu.jungle.entity.Jaguar;

public class EventProducer {
    //добавить метод медоды сравнения
    //private boolean
    private final int MAX_ENERGY = 100;
    private final int MAX_HEALTH = 50;
    private final int MIN_ENERGY = 0;
    private final int MIN_HEALTH = 0;

    public void activeEvent(Jaguar jaguar) {
        while (statusCheck(jaguar)) {
            int eventNum = (int) (Math.random() * 100);
            if (eventNum >= 0 && eventNum < 30) {
                sleepEvent(jaguar);
            } else if (eventNum >= 30 && eventNum < 40) {
                walkEvent(jaguar);
            } else if (eventNum >= 40 && eventNum < 50) {
                hanterEvent(jaguar);
            } else if (eventNum >= 50 && eventNum < 60) {
                trapEvent(jaguar);
            } else if (eventNum >= 60 && eventNum < 70) {
                diseaseEvent(jaguar);
            } else if (eventNum >= 70 && eventNum < 76) {
                eatRodentEvent(jaguar);
            } else if (eventNum >= 76 && eventNum < 82) {
                eatSnakeEvent(jaguar);
            } else if (eventNum >= 82 && eventNum < 88) {
                eatMonkeyEvent(jaguar);
            } else if (eventNum >= 88 && eventNum < 94) {
                eatTigerEvent(jaguar);
            } else if (eventNum >= 94 && eventNum < 100) {
                eatCrocodileEvent(jaguar);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("К сожелению ягуар умер, но он прожил прекрасную жизнь.");
    }

    private boolean checkMinEnergy (int energy){
        return energy < MIN_ENERGY;
    }

    private boolean checkMaxEnergy (int energy){
        return energy > MAX_ENERGY;
    }

    private boolean checkMinHealth (int health){
        return health < MIN_HEALTH;
    }

    private boolean checkMaxHealth (int health){
        return health > MAX_HEALTH;
    }

    private void walkEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 10;
        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        jaguar.setEnergy(energy);
        energyCheck(jaguar);
        System.out.println("Ягуар совершил пробежку -10 энергии.");
    }

    private void sleepEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() + 10;
        if (checkMaxEnergy(energy)) {
            energy = MAX_ENERGY;
        }
        jaguar.setEnergy(energy);
        energyCheck(jaguar);
        System.out.println("Ягуар сладко поспал +10 энергии.");
    }

    private void hanterEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 15;
        if (checkMinHealth(health)) {
            health = MIN_HEALTH;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар попался охотнику - 15 жизней.");
    }

    private void trapEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 10;
        if (checkMinHealth(health)) {
            health = MIN_HEALTH;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("О нет!!! На пути ягуар попаля в капкан - 10 жизней.");
    }

    private void diseaseEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 5;
        if (checkMinHealth(health)) {
            health = MIN_HEALTH;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Даже самые сильные не могут устоять против простуды. Ягуар заболел - 5 жизней.");
    }

    private void eatRodentEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 5;
        int health = jaguar.getHealth() + (int) (jaguar.COEF_FOOD_EN * 2);

        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        if (checkMaxHealth(health)) {
            health = MAX_HEALTH;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар полакомился мышонком, не сильно сытный обед - 5 энергии.");

    }

    private void eatSnakeEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 7;
        int health = jaguar.getHealth() + (int) (jaguar.COEF_FOOD_EN * 4);

        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        if (checkMaxHealth(health)) {
            health = MAX_HEALTH;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар полакомился змеей, не сильно сытный обед - 7 энергии.");

    }

    private void eatMonkeyEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 10;
        int health = jaguar.getHealth() + (int) (jaguar.COEF_FOOD_EN * 6);

        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        if (checkMaxHealth(health)) {
            health = MAX_HEALTH;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар съел обезьяну - 10 энергии.");

    }

    private void eatTigerEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 15;
        int health = jaguar.getHealth() + (int) (jaguar.COEF_FOOD_EN * 8);

        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        if (checkMaxHealth(health)) {
            health = MAX_HEALTH;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("На пути ягуару встретился тигр. Это была тяжелая битва, но сытный ужин - 15 энергии.");

    }

    private void eatCrocodileEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 20;
        int health = jaguar.getHealth() + (int) (jaguar.COEF_FOOD_EN * 10);

        if (checkMinEnergy(energy)) {
            energy = MIN_ENERGY;
        }
        if (checkMaxHealth(health)) {
            health = MAX_HEALTH;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("На водопое ягуар наткнулся на крокодила.После этой битвы ягуар был еще долго сыт - 20 энергии.");

    }

    private boolean statusCheck(Jaguar jaguar) {
        System.out.println("hp: " + jaguar.getHealth() + " en: " + jaguar.getEnergy());
        return jaguar.getHealth() > 0;
    }

    private void energyCheck(Jaguar jaguar) {
        int health = jaguar.getHealth();
        if (jaguar.getEnergy() <= MIN_ENERGY) {
            health -= 5;
        }
        if (checkMinHealth(health)) {
            health = MIN_HEALTH;
        }
        jaguar.setHealth(health);
    }
}
