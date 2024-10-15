package ru.yuliayu.jungle.until;

import ru.yuliayu.jungle.entity.Jaguar;

public class EventProducer {
    //30// пробежка -10 энергии
    //10// спать +20 е //40 + 30
    // охотник - 15 ж
    //капкан - 10 ж
    //болезнь -5 ж
    //скушал грызун
    //скушал змея
    //скушал обезьяна
    //скушал тигр
    //скушал крокодил
    //добавить метод медоды сравнения
    //private boolean
    private int maxEnergy = 100;
    private int maxHealth = 50;

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
            } else if (eventNum >= 94 && eventNum <= 100) {
                eatCrocodileEvent(jaguar);
            }
        }
        System.out.println("К сожелению ягуар умер, но он прожил прекрасную жизнь.");
    }

    private void walkEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 10;
        if (energy < 0) {
            energy = 0;
        }
        jaguar.setEnergy(energy);
        energyCheck(jaguar);
        System.out.println("Ягуар совершил пробежку -10 энергии. Текущая энергия: " + jaguar.getEnergy());
    }

    private void sleepEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() + 20;
        if (energy > maxEnergy) {
            energy = maxEnergy;
        }
        jaguar.setEnergy(energy);
        energyCheck(jaguar);
        System.out.println("Ягуар сладко поспал +20 энергии. Текущая энергия: " + jaguar.getEnergy());
    }

    private void hanterEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 15;
        if (health < 0) {
            health = 0;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар попался охотнику - 15 жизней. Текщие жизни: " + jaguar.getHealth());
    }

    private void trapEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 10;
        if (health < 0) {
            health = 0;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("О нет!!! На пути ягуар попаля в капкан - 10 жизней. Текщие жизни: " + jaguar.getHealth());
    }

    private void diseaseEvent(Jaguar jaguar) {
        int health = jaguar.getHealth() - 5;
        if (health < 0) {
            health = 0;
        }
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Даже самые сильные не могут устоять против простуды. Ягуар заболел - 5 жизней. Текщие жизни: "
                + jaguar.getHealth());
    }

    private void eatRodentEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 5;
        int health = jaguar.getHealth() + (int) (jaguar.getCoef_food_en() * 2);

        if (energy < 0) {
            energy = 0;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар полакомился мышонком, не сильно сытный обед - 5 энергии.Текущая энергия: "
                + jaguar.getEnergy() + ". Текщие жизни: " + jaguar.getHealth());

    }

    private void eatSnakeEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 7;
        int health = jaguar.getHealth() + (int) (jaguar.getCoef_food_en() * 4);

        if (energy < 0) {
            energy = 0;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар полакомился змеей, не сильно сытный обед - 7 энергии.Текущая энергия: "
                + jaguar.getEnergy() + ". Текщие жизни: " + jaguar.getHealth());

    }

    private void eatMonkeyEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 10;
        int health = jaguar.getHealth() + (int) (jaguar.getCoef_food_en() * 6);

        if (energy < 0) {
            energy = 0;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("Ягуар съел обезьяну - 10 энергии.Текущая энергия: "
                + jaguar.getEnergy() + ". Текщие жизни: " + jaguar.getHealth());

    }

    private void eatTigerEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 15;
        int health = jaguar.getHealth() + (int) (jaguar.getCoef_food_en() * 8);

        if (energy < 0) {
            energy = 0;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("На пути ягуару встретился тигр. Это была тяжелая битва, но сытный ужин - 15 энергии.Текущая энергия: "
                + jaguar.getEnergy() + ". Текщие жизни: " + jaguar.getHealth());

    }

    private void eatCrocodileEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy() - 20;
        int health = jaguar.getHealth() + (int) (jaguar.getCoef_food_en() * 10);

        if (energy < 0) {
            energy = 0;
        }
        if (health > maxHealth) {
            health = maxHealth;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        energyCheck(jaguar);
        System.out.println("На водопое ягуар наткнулся на крокодила.После этой битвы ягуар был еще долго сыт - 20 энергии. Текущая энергия: "
                + jaguar.getEnergy() + ". Текщие жизни: " + jaguar.getHealth());

    }

    private boolean statusCheck(Jaguar jaguar) {
        if (jaguar.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void energyCheck(Jaguar jaguar) {
        int health = jaguar.getHealth();
        if (jaguar.getEnergy() <= 0) {
            health -= 5;
        }
        if (health < 0) {
            health = 0;
        }
        jaguar.setHealth(health);
    }
}
