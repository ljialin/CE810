package battle.controllers;

import asteroids.Action;
import asteroids.Controller;
import asteroids.GameState;
import asteroids.Ship;
import battle.BattleController;
import battle.NeuroShip;
import battle.SimpleBattle;
import utilities.ElapsedCpuTimer;

import java.awt.*;

/**
 * Created by simonlucas on 30/05/15.
 */
public class Rotate implements BattleController {

    NeuroShip ship;

    Action action;

    public Rotate() {
        action = new Action();
    }

    public Action action(GameState game) {
        // action.thrust = 2.0;
        action.shoot = false;
        action.turn = 1;

        return action;
    }

    public void setVehicle(NeuroShip ship) {
        // just in case the ship is needed ...
        this.ship = ship;
    }

    @Override
    public Action getAction(SimpleBattle gameStateCopy, int playerId, ElapsedCpuTimer elapsedTimer) {
        return new Action(0, 1, false);
    }


    public void draw(Graphics2D g)
    {

    }
}
