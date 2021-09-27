package com.aleke.alibi;

public abstract class Character {

    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {

        this.weapon = weapon;
    }
}
